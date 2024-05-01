import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BFS bfs = new BFS();
        Map<String, Boolean> db = new HashMap<>();
        Scanner sc = new Scanner(new File("words_alpha.txt"));
        while (sc.hasNext()) {
            String temp = sc.next();
            if (!db.containsKey(temp)) {
                db.put(temp.toLowerCase(), true);
            }
        }
        sc.close();

        int tes = bfs.ladderLength("vast", "vest", db);
        int tes = bfs.ladderLength("east", "west", db);
        int tes = bfs.ladderLength("rime", "rice", db);
        System.out.println(tes);
    }
}
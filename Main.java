import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BFS bfs = new BFS();
        GBFS gbfs = new GBFS();
        Map<String, Boolean> db = new HashMap<>();
        Scanner sc = new Scanner(new File("words_alpha.txt"));
        while (sc.hasNext()) {
            String temp = sc.next();
            if (!db.containsKey(temp)) {
                db.put(temp.toLowerCase(), true);
            }
        }
        sc.close();

        // List<String> tes = bfs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");
        // tes.forEach(item -> System.out.println(item));

        // System.out.println();

        // List<String> tes2 = gbfs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");
        // tes2.forEach(item2 -> System.out.println(item2));
    }
}
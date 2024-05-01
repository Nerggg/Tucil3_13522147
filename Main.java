import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BFS bfs = new BFS();
        GBFS gbfs = new GBFS();
        UCS ucs = new UCS();
        AStar AStar = new AStar();
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

        // List<String> tes = gbfs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");
        // tes.forEach(item2 -> System.out.println(item2));

        // List<String> tes = ucs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");
        // tes.forEach(item2 -> System.out.println(item2));

        List<String> tes = AStar.algo("charge", "comedo", db);
        System.out.println("hasil\n");
        tes.forEach(item2 -> System.out.println(item2));

        System.out.println(tes.size());
    }
}
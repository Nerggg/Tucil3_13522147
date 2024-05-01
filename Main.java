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

        long startTime = System.currentTimeMillis();

        // List<String> tes = bfs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");

        List<String> tes = gbfs.algo("charge", "comedo", db);
        System.out.println("hasil\n");

        // List<String> tes = ucs.algo("charge", "comedo", db);
        // System.out.println("hasil\n");

        // List<String> tes = AStar.algo("charge", "comedo", db);
        // System.out.println("hasil\n");

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        tes.forEach(item -> System.out.println(item));
        System.out.println("panjang path " + tes.size());
        System.out.println("Total waktu yang dibutuhkan: " + totalTime + " milidetik");
    }
}
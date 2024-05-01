import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void resetDB(Map<String, Boolean> db, Scanner sc) throws Exception {
        sc = new Scanner(new File("words_alpha.txt"));
        while (sc.hasNext()) {
            String temp = sc.next();
            if (!db.containsKey(temp)) {
                db.put(temp.toLowerCase(), true);
            }
        }
        sc.close();
    }

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
        List<String> tes = bfs.algo("charge", "comedo", db);
        System.out.println("hasil BFS");
        tes.forEach(item -> System.out.println(item));
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("panjang path " + tes.size());
        System.out.println("Total waktu yang dibutuhkan: " + totalTime + " milidetik");
        System.out.println();

        resetDB(db, sc);

        startTime = System.currentTimeMillis();
        List<String> tes2 = gbfs.algo("charge", "comedo", db);
        System.out.println("hasil GBFS");
        tes2.forEach(item -> System.out.println(item));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("panjang path " + tes2.size());
        System.out.println("Total waktu yang dibutuhkan: " + totalTime + " milidetik");
        System.out.println();

        resetDB(db, sc);

        startTime = System.currentTimeMillis();
        List<String> tes3 = ucs.algo("charge", "comedo", db);
        System.out.println("hasil UCS");
        tes3.forEach(item -> System.out.println(item));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("panjang path " + tes3.size());
        System.out.println("Total waktu yang dibutuhkan: " + totalTime + " milidetik");
        System.out.println();

        resetDB(db, sc);

        startTime = System.currentTimeMillis();
        List<String> tes4 = AStar.algo("charge", "comedo", db);
        System.out.println("hasil A*");
        tes4.forEach(item -> System.out.println(item));
        endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("panjang path " + tes4.size());
        System.out.println("Total waktu yang dibutuhkan: " + totalTime + " milidetik");
        System.out.println();
    }
}
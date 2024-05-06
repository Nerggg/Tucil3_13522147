import java.util.*;
import java.io.*;

public class Main {
    public static void resetDB(Map<String, Boolean> db) throws Exception {
        Scanner sc = new Scanner(new File("words_alpha.txt"));
        while (sc.hasNext()) {
            String temp = sc.next();
            if (!db.containsKey(temp)) {
                db.put(temp.toLowerCase(), true);
            }
        }
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        Map<String, Boolean> db = new HashMap<>();
        Scanner userinput = new Scanner(System.in);
        Scanner userAgain = new Scanner(System.in);
        String beginWord = "";
        String endWord = "";
        int alg = 0;
        boolean begin = true;

        System.out.println("Welcome to Word Ladder Solver!\n");
        while (begin) {
            boolean flag1 = false;
            boolean flag2 = false;
            System.out.println("1. Greedy Best First Search");
            System.out.println("2. A Star");
            System.out.println("3. Uniform Cost Search");
            while (!flag2) {
                System.out.println("Select your preferred algorithm (enter 5 to exit): ");
                alg = userinput.nextInt();
                if (alg == 69) {
                    System.out.println(
                            "\nTABRAK-TABRAK MASUK\nRAPPER KAMPUNG TABRAK MASUK\nMESKI JAUH JARAK PANDANG\nCOBA SEDIKIT MENGAMUK\nKU CIPTAKAN LIRIK DAN BEAT\nSECEPAT KILAT TAPI TAK SEMPIT\nBERDIRI TEGAR WALAUPUN SULIT\nTRA MAMPU BERSAING SILAHKAN PAMIT\nOK GAS-OK GAS\nTAMBAH DUA TORANG GAS\n");
                } else if (alg < 1 || alg > 4) {
                    System.out.println("Incorrect input!\n");
                } else {
                    flag2 = true;
                }
            }

            if (alg == 4) {
                System.out.println("Bye!");
                begin = false;
                flag1 = true;
                break;
            }

            while (!flag1) {
                System.out.println("Enter start word: ");
                beginWord = userinput.next();
                System.out.println("Enter end word: ");
                resetDB(db);
                endWord = userinput.next();
                beginWord = beginWord.toLowerCase();
                endWord = endWord.toLowerCase();
                if (beginWord.length() != endWord.length()) {
                    System.out.println("Both words must be equal in length!\n");
                } else if (!db.containsKey(beginWord) || !db.containsKey(endWord)) {
                    System.out.println("The words entered must be words in English!");
                } else {
                    flag1 = true;
                }
            }

            long startTime = 0, endTime = 0, totalTime = 0;
            long[] visited = { 0 };
            List<String> path = new ArrayList<>();
            if (alg == 1) {
                startTime = System.currentTimeMillis();
                path = GBFS.algo(beginWord, endWord, db, visited);
                endTime = System.currentTimeMillis();
                System.out.println("\nGBFS Result:");
            } else if (alg == 2) {
                startTime = System.currentTimeMillis();
                path = AStar.algo(beginWord, endWord, db, visited);
                endTime = System.currentTimeMillis();
                System.out.println("\nAStar Result:");
            } else if (alg == 3) {
                startTime = System.currentTimeMillis();
                path = UCS.algo(beginWord, endWord, db, visited);
                endTime = System.currentTimeMillis();
                System.out.println("\nUCS Result:");
            }

            if (path.size() == 0) {
                System.out.println("There is no path between those two words");
            } else {
                System.out.print(path.get(0));
                for (int i = 1; i < path.size(); i++) {
                    System.out.print(" -> " + path.get(i));
                }
                System.out.println();
                System.out.println();
                totalTime = endTime - startTime;
                System.out.println("Node Visited: " + visited[0]);
                System.out.println("Path Length: " + path.size());
                System.out.println("Time Taken: " + totalTime + " ms");
            }

            System.out.println();
            System.out.println("Press enter to continue");
            userAgain.nextLine();
        }
        userAgain.close();
        userinput.close();
    }
}

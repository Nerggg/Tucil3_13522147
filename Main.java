import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Boolean> db = new HashMap<>();
        Scanner sc = new Scanner(new File("english.csv"));
        sc.useDelimiter(",");
        while (sc.hasNext()) {
            String temp = sc.next();
            int delIdx;

            if (temp.length() == 0) {
                continue;
            } else {
                temp = temp.substring(2);
            }

            while (temp.indexOf(' ') != -1) {
                delIdx = temp.indexOf(' ');
                temp = temp.substring(0, delIdx);
            }
            while (temp.indexOf('\n') != -1) {
                delIdx = temp.indexOf('\n');
                temp = temp.substring(0, delIdx);
            }

            if (temp.length() > 0 && !db.containsKey(temp)) {
                db.put(temp, true);
            }
        }
        sc.close();

        System.out.println(db.get("Abandon"));
    }
}
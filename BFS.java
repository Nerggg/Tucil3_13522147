import java.util.*;

public class BFS {
    public int ladderLength(String beginWord, String endWord, Map<String, Boolean> wordList) {
        Set<String> head = new HashSet<>();
        Set<String> tail = new HashSet<>();
        if (!wordList.get(endWord)) {
            return 0;
        }
        head.add(beginWord);
        tail.add(endWord);
        int ladder = 2;
        while (!head.isEmpty() && !tail.isEmpty()) {
            if (head.size() < tail.size()) {
                Set<String> temp = head;
                head = tail;
                tail = temp;
            }
            Set<String> nextLevel = new HashSet<>();
            for (String word : head) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < word.length(); i++) {
                    char originalChar = chars[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[i] = c;
                        String newWord = new String(chars);
                        if (tail.contains(newWord)) {
                            return ladder;
                        }
                        if (wordList.get(newWord) != null) {
                            nextLevel.add(newWord);
                            wordList.remove(newWord);
                        }
                    }
                    chars[i] = originalChar;
                }
            }
            ladder++;
            head = nextLevel;
        }
        return 0;
    }
}
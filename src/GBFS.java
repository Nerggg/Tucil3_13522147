import java.util.*;

class GBFS {
    static public List<String> algo(String beginWord, String endWord, Map<String, Boolean> wordList, long[] visited) {
        Node beginNode = new Node(beginWord);
        beginNode.path.add(beginWord);

        PriorityQueue<Node> todo = new PriorityQueue<>((a, b) -> {
            int diffA = getHeuristic(a.word, endWord);
            int diffB = getHeuristic(b.word, endWord);
            return Integer.compare(diffA, diffB);
        });
        todo.add(beginNode);

        while (!todo.isEmpty()) {
            Node current = todo.poll();
            visited[0]++;
            if (current.word.equals(endWord)) {
                return current.path;
            }
            wordList.remove(current.word);
            char[] charArray = current.word.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                char originalChar = charArray[j];
                for (char c = 'a'; c <= 'z'; c++) {
                    charArray[j] = c;
                    String newWord = new String(charArray);
                    if (wordList.containsKey(newWord)) {
                        List<String> tempPath = new ArrayList<>(current.path);
                        tempPath.add(newWord);
                        Node newNode = new Node(newWord, tempPath);
                        todo.add(newNode);
                        wordList.remove(newWord);
                    }
                }
                charArray[j] = originalChar;
            }
        }
        return new ArrayList<>();
    }

    static private int getHeuristic(String word, String target) {
        int diff = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }
}
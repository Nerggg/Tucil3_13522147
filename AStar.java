import java.util.*;

class AStar {
    static public List<String> algo(String beginWord, String endWord, Map<String, Boolean> wordList, long[] visited) {
        NodeAStar beginNode = new NodeAStar(beginWord);
        beginNode.path.add(beginWord);

        PriorityQueue<NodeAStar> todo = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.cost + a.heuristic, b.cost + b.heuristic));
        todo.add(beginNode);

        while (!todo.isEmpty()) {
            NodeAStar current = todo.poll();
            if (current.word.equals(endWord)) {
                return current.path;
            }
            wordList.remove(current.word);
            char[] charArray = current.word.toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                char originalChar = charArray[j];
                for (char c = 'a'; c <= 'z'; c++) {
                    visited[0]++;
                    charArray[j] = c;
                    String newWord = new String(charArray);
                    if (wordList.containsKey(newWord)) {
                        List<String> tempPath = new ArrayList<>(current.path);
                        tempPath.add(newWord);
                        int heuristic = getHeuristic(newWord, endWord);
                        NodeAStar newNode = new NodeAStar(newWord, current.cost + 1, heuristic, tempPath);
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

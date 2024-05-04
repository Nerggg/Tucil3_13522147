import java.util.*;

class UCS {
    static public List<String> algo(String beginWord, String endWord, Map<String, Boolean> wordList, long[] visited) {
        NodeUCS beginNode = new NodeUCS(beginWord, 0);
        beginNode.path.add(beginWord);

        PriorityQueue<NodeUCS> todo = new PriorityQueue<>((a, b) -> Integer.compare(a.cost, b.cost));
        todo.add(beginNode);
        while (!todo.isEmpty()) {
            NodeUCS current = todo.poll();
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
                        int newCost = current.cost + 1;
                        NodeUCS newNode = new NodeUCS(newWord, newCost, tempPath);
                        todo.add(newNode);
                        wordList.remove(newWord);
                    }
                }
                charArray[j] = originalChar;
            }
        }
        return new ArrayList<>();
    }
}

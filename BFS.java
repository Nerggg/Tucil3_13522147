import java.util.*;

class BFS {
    public List<String> algo(String beginWord, String endWord, Map<String, Boolean> wordList) {
        Node beginNode = new Node(beginWord);
        beginNode.path.add(beginWord);

        Queue<Node> todo = new LinkedList<>();
        todo.add(beginNode);
        while (!todo.isEmpty()) {
            int n = todo.size();
            for (int i = 0; i < n; i++) {
                Node current = todo.poll();
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
        }
        return new ArrayList<>();
    }
}

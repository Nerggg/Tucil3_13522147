import java.util.*;

class Node {
    public String word;
    public List<String> path;

    public Node(String word) {
        this.word = word;
        this.path = new ArrayList<>();
    }

    public Node(String word, List<String> path) {
        this.word = word;
        this.path = path;
    }
}

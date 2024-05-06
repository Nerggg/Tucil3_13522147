import java.util.*;

class NodeGBFS {
    public String word;
    public List<String> path;

    public NodeGBFS(String word) {
        this.word = word;
        this.path = new ArrayList<>();
    }

    public NodeGBFS(String word, List<String> path) {
        this.word = word;
        this.path = path;
    }
}

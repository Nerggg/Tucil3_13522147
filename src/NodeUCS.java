import java.util.*;

class NodeUCS {
    String word;
    int cost;
    List<String> path;

    NodeUCS(String word, int cost) {
        this.word = word;
        this.cost = cost;
        this.path = new ArrayList<>();
    }

    NodeUCS(String word, int cost, List<String> path) {
        this.word = word;
        this.cost = cost;
        this.path = path;
    }
}
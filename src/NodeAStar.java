import java.util.*;

class NodeAStar {
    String word;
    int cost;
    int heuristic;
    List<String> path;

    NodeAStar(String word) {
        this.word = word;
        this.cost = 0;
        this.heuristic = 0;
        this.path = new ArrayList<>();
    }

    NodeAStar(String word, int cost, int heuristic, List<String> path) {
        this.word = word;
        this.cost = cost;
        this.heuristic = heuristic;
        this.path = path;
    }
}
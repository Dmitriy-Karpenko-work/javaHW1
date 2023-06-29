package ver_002;

import java.util.ArrayList;
import java.util.Scanner;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    ArrayList<String> resultAge = new ArrayList<>();

    public Research(Family_tree geoTree) {
        tree = geoTree.getTree();
    }

    // метод поиска связи: родитель - ребенок, жена-муж
    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.Name == p.Name && t.re == re) {
                result.add(t.p2.Name);
            }
        }
        return result;
    }

}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Connor on 2017.04.02..
 */
public class Trees {

  public static void main(String[] args) {

    ArrayList<HashMap<String, Object>> trees = new ArrayList<HashMap<String, Object>>();

    HashMap<String, Object> tree0 = new HashMap<String, Object>();
    tree0.put("type", "red pine");
    tree0.put("leaf color", "dark yellow-green");
    tree0.put("age", 500);
    tree0.put("sex", "f");
    trees.add(tree0);

    HashMap<String, Object> tree1 = new HashMap<String, Object>();
    tree0.put("type", "sugar maple tree");
    tree0.put("leaf color", "green");
    tree0.put("age", 400);
    tree0.put("sex", "m");
    trees.add(tree1);

    HashMap<String, Object> tree2 = new HashMap<String, Object>();
    tree0.put("type", "silver birch");
    tree0.put("leaf color", "medium green");
    tree0.put("age", 150);
    tree0.put("sex", "f");
    trees.add(tree2);

    HashMap<String, Object> tree3 = new HashMap<String, Object>();
    tree0.put("type", "black pine");
    tree0.put("leaf color", "deep green");
    tree0.put("age", 500);
    tree0.put("sex", "m");
    trees.add(tree3);

    HashMap<String, Object> tree4 = new HashMap<String, Object>();
    tree0.put("type", "pedunculate oak");
    tree0.put("leaf color", "green");
    tree0.put("age", "120");
    tree0.put("sex", "m");
    trees.add(tree4);
  }
}

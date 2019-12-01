package eighth_lesson.collections.map;

import java.util.Map;

public class TreeMapExample {
  public static void main(String[] args) {

    Map<String, String> treeMap = new java.util.TreeMap<>();
    treeMap.put("some_key","some_value");
    treeMap.put("some_key1","some_value1");
    treeMap.put("some_key2","some_value2");

    treeMap.forEach((key, value)-> System.out.println("Key: "+ key + " Value: "+ value)  );
  }
}

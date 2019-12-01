package eighth_lesson.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("1");
    list.add("1");

    Set<String> hashSet = new HashSet<>(list);  //delete duble list
    hashSet.add("some_value");  // выступает и  key and value (Object - заглушка)

    System.out.println(hashSet);

  }
}

package eighth_lesson.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {

  /*  Map<Integer, String> worldRepeatCount = new HashMap<>();
    worldRepeatCount.put(null,null);
    worldRepeatCount.put(null,"ZXY");
    worldRepeatCount.put(null,"XZ");

    worldRepeatCount.forEach((key,value)-> {
      System.out.println("key: " + key + " value: "+ value);
    });
   for (Map.Entry<Integer, String> entries: worldRepeatCount.entrySet()){
     entries.getValue();  // можно достать и ключ и значение */

  String world = "HelloWorldWorld!";
     Map<Character, Integer> repeatCharacterCount = getRepeatCharacterCount(world);
     repeatCharacterCount.forEach((key,value)->{
       System.out.println("Character: " + key + " Count: " + value);
     });

  }

   private static Map<Character,Integer> getRepeatCharacterCount (String world){ //XYZ
     Map<Character,Integer> charCount = new HashMap<>();
     char[] characters = world.toCharArray(); //characters [0]= 'X'; characters [1]= 'Y'; etc

     for (Character character : characters) {
       if (charCount.get(character) == null){ // если по ключу ничего нет - null
         charCount.put(character,1);
       }else {
         Integer currentValue = charCount.get(character);  //currentValue - получить количество ключа по значению
         charCount.put(character, currentValue +1);      //положить по тому же ключу другое значение //к value ключа +1
       }
     }
     return charCount;
   }
  }


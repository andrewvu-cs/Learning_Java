import java.util.Arrays;
import java.util.HashMap;

public class DSExercise{
    
    public static void main(String[] args){

        HashMap<String, Integer> hashMap = new HashMap();

        String str = "That may be all i need, come and rest your bones with me, aw yeah aw yeah aw aw yeah, yeah";

        String[] words = str.replaceAll("[\\n\\t\\t.,;:!(){]", "").split(" ");
        for(String s : words){
            String lower = s.toLowerCase();
            if (hashMap.containsKey(lower)){
                hashMap.put(lower, hashMap.get(lower) + 1); 
            } else {
                hashMap.put(lower, 1);
            }
        }

        String mostRepeated = "";
        int max = 0;

        for (String word: hashMap.keySet()){
            if (max <= hashMap.get(word)){
                mostRepeated = word;
                max = hashMap.get(word);
            }
        }

        System.out.println("Most Repeated word: " + mostRepeated + " Times: " + max);
    }
}
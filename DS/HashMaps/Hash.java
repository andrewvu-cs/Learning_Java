import java.util.HashMap;

public class Hash{
    
    public static void main(String[] args){
        HashMap<String, Integer> wordToNum = new HashMap();

        // Insert key-and-value pairs into the Hashmap
        wordToNum.put("ONE", 1);
        wordToNum.put("TWO", 2);
        wordToNum.put("THREE", 3);
        wordToNum.put("FOUR", 4);
        wordToNum.put("FIVE", 5);

        System.out.println(wordToNum.get("THREE"));
        System.out.println(wordToNum.values());
        System.out.println(wordToNum.keySet());

        System.out.println(wordToNum.remove("FOUR"));

        // Common Use of HashMaps: Which character is the most repeated?
        String s = "phonebook";
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++){
            Character currentChar = s.charAt(i);
            if (hashMap.containsKey(currentChar)){
                hashMap.put(currentChar, hashMap.get(currentChar) + 1);
            } else {
                hashMap.put(currentChar, 1);
            }
        }
        // System.out.println(hashMap.keySet());
        // System.out.println(hashMap.values());
        Character mostReapeated = ' ';
        int max = 0;
        for(Character key : hashMap.keySet()){
            int currentValue = hashMap.get(key);
            if ( max < currentValue){
                mostReapeated = key;
                max = currentValue;
            }
        }

        System.out.println("Most Repeated: " + mostReapeated + " | Times: " + max);
    }
}
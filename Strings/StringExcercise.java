// import jdk.internal.org.xml.sax.ErrorHandler;

public class StringExcercise{
    public static void main(String[] args){
        String str = "alberquerqee";
        StringExcercise exc = new StringExcercise();
        exc.numVowelNumCons(str);
    }

    public void numVowelNumCons(String str){
        if (str.isEmpty()){
            throw new IllegalArgumentException("please pass a string");
        }
        
        int vowelCount = 0;
        int consCount = 0;

        char[] charArray = str.trim().toLowerCase().replaceAll(" ", "").toCharArray();
        String vowels = "aeiouy";

        for(char c : charArray){
            if (vowels.indexOf(c) != -1){
                vowelCount++;
                // System.out.println("INDEX: " + vowels.indexOf(c));
            }else{
                // System.out.println("INDEX: " + vowels.indexOf(c));
                consCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consCount);
    }
}
public class Strings {
    
    public static void main(String[] args){
        // String firstName = "Shelly";
        // String lastName = "Parker";

        // StringBuilder stringBuilder = new StringBuilder("abc");
        // stringBuilder.append("def");
        // stringBuilder.append("ghi");
        // stringBuilder.append("jkl");
        // stringBuilder.append("mno");
        // stringBuilder.insert(9, "ALPHA");
        // stringBuilder.delete(1, 3);
        // String a = stringBuilder.toString().substring(0, 3) + "!";
        // System.out.println(a);

        String p = "   Panda";
        String f = " Fish ";
        String h = "Horse    ";
        String c = " Cat";
        String nothing = " ";
        String[] strings = {p, f, c, h, nothing};

        for (String s : strings){
            System.out.println(s);
            s = s.trim();
            System.out.println(s);

            if (!s.isEmpty()){
                System.out.println("Not Empty: " + s);
            }

            if (s.length() > 3) {
                System.out.println("More than 3: " + s);
            }

            if (s.length() >= 3) {
                System.out.println("More than 3 or equal to 3: " + s);
            }

            System.out.println(s.toLowerCase());
            System.out.println(s.toUpperCase());
            System.out.println();
        }
    }
}
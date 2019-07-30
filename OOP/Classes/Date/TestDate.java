public class TestDate{
    public static void main(String[] args){
        Date d1 = new Date(8, 4, 1999);
        d1.setDate(31, 3, 2000);
        System.out.println(d1.toString());
    }
}
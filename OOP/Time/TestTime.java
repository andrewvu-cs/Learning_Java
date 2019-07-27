public class TestTime{
    public static void main (String[] args){
        Time t1 = new Time(4, 59, 0);
        System.out.println(t1.toString());
        t1.nextSecond();
        System.out.println(t1.toString());
        t1.nextSecond();
        System.out.println(t1.toString());
        t1.nextSecond();
        System.out.println(t1.toString());
        t1.previousSecond();
        System.out.println(t1.toString());
        t1.previousSecond();
        System.out.println(t1.toString());
        t1.previousSecond();
        System.out.println(t1.toString());
        t1.previousSecond();
        System.out.println(t1.toString());
    }
}
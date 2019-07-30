public class TestAccount{
    public static void main(String[] args){
        Account acc1 = new Account("1", "Andrew");
        System.out.println(acc1.toString());
        acc1.credit(150);
        System.out.println(acc1.toString());
        acc1.debit(75);
        System.out.println(acc1.toString());
        acc1.debit(80);
        System.out.println(acc1.toString());

        Account acc2 = new Account("2", "Arctic", 240);
        acc1.transferTo(acc2, 60);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        acc2.transferTo(acc1, 280);
        System.out.println(acc1.toString());
        
    }
}
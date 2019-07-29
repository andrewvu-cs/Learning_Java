public class TestBook{
    public static void main(String[] args){
        Author andrew = new Author("Andrew", "andrew@gmail.com", 'm');

        Book book1 = new Book("The autobio of Andrew", andrew, 3.00, 4);

        System.out.println(book1.toString());
        System.out.println("Book's name: " + book1.getName());
        System.out.println("Book's author: " + book1.getAuthor());
        System.out.println("Book's price: " + book1.getPrice());
        System.out.println("Book's qty: " + book1.getQty());


    }
}
public class TestAuthor{
    public static void main(String[] args){
        Author auth1 = new Author("Andrew", "andrew@email.com", 'f');
        
        System.out.println(auth1.toString());

        System.out.println("The name is " + auth1.getName());
        System.out.println("The email is " + auth1.getEmail());
        System.out.println("The gender is " + auth1.getGender());
        
        auth1.setEmail("andrewiscool@gmail.com");
        System.out.println("The email is " + auth1.getEmail());
    }
}
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a string or word to check if it's a palindrome: ");
        String strInput = sc.nextLine();
        String endResult = "";
        endResult = (isPalindrome(strInput)) ? 
            strInput + " is a palindrome!" : 
            strInput + " is not a palindrome!";
        System.out.println(endResult);
        sc.close();
        
    }


    public static Boolean isPalindrome(String input){
        // Lower case the string to avoid Capitalization errors
        // Removing instances of whitespace;
        // Race CAR will be a true value;
        char[] inputArr = input.toLowerCase().replaceAll(" ", "").toCharArray();

        int i = 0;
        int j = inputArr.length - 1;
    
        while(i <= j){
            if (inputArr[i] != inputArr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
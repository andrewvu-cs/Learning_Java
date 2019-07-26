import java.util.Scanner;
import java.util.Arrays;
// import java.util.System;


public class TwoSum{
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int target = 0, number = 0;
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Please insert a target number: ");
        target = inputNumber.nextInt();
        // Scanner inputNumberScanner = new Scanner(System.in);
        for (byte i = 0; i < numbers.length; i++){
            System.out.print("Please enter a number for index " + i + ": ");
            number = inputNumber.nextInt();
            numbers[i] = number;
        }
        System.out.println(Arrays.toString(numbers));
        inputNumber.close();
        Arrays.sort(numbers);
        
        Boolean result = isTwoSum(numbers, target);;
        String resultString = (result) ? "Hahahahahah" : "NANANANANANA";
        System.out.println(resultString);

    }

    public static boolean isTwoSum(int[] array, int target){
        int i = 0;
        int j = array.length - 1;

        while (i < j){
            if (array[i] + array[j] < target){
                i++;
            }
            if (array[i] + array[j] > target){
                j--;
            }
            if (array[i] + array[j] == target){
                System.out.println("Two numbers in the array match the target number!");
                System.out.println("Target Number: " + target);
                System.out.println("First Number: " + array[i] + " Second Number: " + array[j]);
                return true;
            }

        }

        return false;
    }
} 
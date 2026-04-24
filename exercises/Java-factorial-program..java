import java.util.Scanner;


public class Solution{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Your code to calculate the factorial of 'n' using do-while loop goes here

        int number =scanner.nextInt();
        int factorial=1;

        for(int i = 1; i<= number; i++){
            factorial*=i;
        }
        System.out.print(factorial);

        scanner.close();

    }

}
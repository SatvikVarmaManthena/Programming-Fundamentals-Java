import java.util.Scanner; 

public class Solution { 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
        int number =scanner.nextInt();
        int reverse = 0;
        int digits = 0;

        boolean isNegative = number < 0;
        number = Math.abs(number);

        while(number >0){
            digits = number % 10;
            reverse = reverse * 10 + digits;
            number = number / 10;
        }
        
        if (isNegative) {
            reverse = -reverse;
        }

        System.out.print(reverse);
    scanner.close(); 
   } 

} 
import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        // Take help of Scanner to take input 
        Scanner sc = new Scanner(System.in); 
        
        // Write your code here 
        // Display the result according to the given inputs
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();

        if (operator.length() != 1) {
            System.out.println("Invalid operation");
            return;
        }
        char op = operator.charAt(0);

        switch(op){
            case '+':
            System.out.println(num1+num2);
            break;

            case '-':
            System.out.println(num1-num2);
            break;

            case '*':
            System.out.println(num1*num2);
            break;

            case '/':
             if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println(num1 / num2);
                }
            break;

            default:
            System.out.println("Invalid Operation");
        }
        sc.close(); 
    } 
}
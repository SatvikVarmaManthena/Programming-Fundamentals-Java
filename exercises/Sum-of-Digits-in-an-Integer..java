import java.util.Scanner; 

public class Solution{ 

    public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 

    // Write your code here 
    int n = scanner.nextInt();
    int sum=0;

    while(n>0){
        int digits = n%10;
        sum+=digits;
        n=n/10;
    }
    System.out.println(sum);

    scanner.close();   

    } 

} 
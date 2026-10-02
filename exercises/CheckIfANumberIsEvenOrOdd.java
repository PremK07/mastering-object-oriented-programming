import java.util.Scanner;

public class Solution {
    
    // Write Method to determine if a number is even, odd, or invalid
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        int n = scanner.nextInt();
        if(n < 0){
            System.out.println("Invalid input");
        }
        else{
            if(n % 2 ==0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        
        scanner.close();
    }
}
import java.util.Scanner; 

// Write your code to Create a class Cat 

public class Solution { 
    public static void main(String[] args) { 
        // Create a Scanner object to read input 
        Scanner scanner = new Scanner(System.in); 
        
        // Write your code here
        int age = scanner.nextInt();
        int weight = scanner.nextInt();
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        if(age > 1 && age < 16){
            if(weight > 1 && weight < 11){
                System.out.println("Health Status: Healthy");
    
            }else{System.out.println("Health Status: Unhealthy");}
        }else{
            System.out.println("Health Status: Unhealthy");
        }
        scanner.close(); 
    }
}
import java.util.Scanner;
// Write your class here
class Person{
    String name;
    int age;
}

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        // Write your code here
        Person p = new Person();
        p.name = scanner.next();
        p.age = scanner.nextInt();
        if( p.age >= 1 && p.age <= 100){
            System.out.println("Name: " + p.name);
            System.out.println("Age: "+ p.age);

        }else{
            System.out.println("Invalid Age");
        }

        scanner.close(); 
    } 
}
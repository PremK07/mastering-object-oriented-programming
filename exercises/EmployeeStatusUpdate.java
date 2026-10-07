import java.util.Scanner;

public class Solution {

    static class EmployeeStatus {

        void PrintDefaultStatus() {
            System.out.println("System is active and ready to update employee statuses.");
        }

        void UpdateStatus(String name, boolean active) {
            if (active) {
                System.out.println("Employee statuses: Employee " + name + " is currently active.");
            } else {
                System.out.println("Employee statuses: Employee " + name + " is currently inactive.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        boolean active = sc.nextBoolean();

        EmployeeStatus employee = new EmployeeStatus();

       
        employee.UpdateStatus(name, active);
    }
}
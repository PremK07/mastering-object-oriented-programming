import java.util.Scanner;

public class Solution {

    static class Car {
        String make;
        String model;
        int year;
        double price;

        Car(String make, String model, int year, double price) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        void display() {
            if (!make.isEmpty() && !model.isEmpty() && year >= 1886 && price > 0) {
                System.out.println("Car: Make: " + make +
                        ", Model: " + model +
                        ", Year: " + year +
                        ", Rental Price Per Day: " + price);
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String make = scanner.nextLine();
        String model = scanner.nextLine();
        int year = scanner.nextInt();
        double price = scanner.nextDouble();

        model = model.replace("`", "");

        Car car = new Car(make, model, year, price);
        car.display();

        scanner.close();
    }
}
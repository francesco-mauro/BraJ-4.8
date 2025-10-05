import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        car.start();
    }
}

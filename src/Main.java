import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int newPrice;

        Car car = new Car("Charger", "Yellow", 10000);


        car.setColor("Blue");
        System.out.println("Input new price");
        newPrice = scanner.nextInt();
        car.setPrice(newPrice);

        System.out.println(car.getColor() +" "+ car.getModel() +" "+ car.getPrice());

        scanner.close();
    }
}

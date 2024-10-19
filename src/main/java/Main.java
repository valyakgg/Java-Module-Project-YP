import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите название машины № 1: ");
        String name = scanner.next();

        while (true) {
            System.out.println("Введите скорость машины № 1: ");
            int speed = scanner.nextInt();
            if (speed > 0 && speed <= 250) {
                break;
            } else {
                System.out.println("Введена неправильная скорость. Допустимые значения от 1 до 250");
            }
        }
        System.out.println("Введите название машины № 2: ");
        String nameTwo = scanner.next();
        while (true) {
            System.out.println("Введите скорость машины № 2: ");
            int speedTwo = scanner.nextInt();
            if (speedTwo > 0 && speedTwo <= 250) {
                break;
            } else {
                System.out.println("Введена неправильная скорость. Допустимые значения от 1 до 250");
            }
        }
        System.out.println("Введите название машины № 3: ");
        String nameThree = scanner.next();
        while (true) {
            System.out.println("Введите скорость машины № 3: ");
            int speedThree = scanner.nextInt();
            if (speedThree > 0 && speedThree <= 250) {
                break;
            } else {
                System.out.println("Введена неправильная скорость. Допустимые значения от 1 до 250");
            }
        }

    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название машины № " + (i + 1) + ":");
            String name = scanner.next();

            int speed;
            while (true) {
                System.out.println("Введите скорость машины № " + (i + 1) + " (от 1 до 250): ");
                try {
                    speed = Integer.parseInt(scanner.next());
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введена неправильная скорость. Попробуйте снова.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Это не число. Пожалуйста, введите число от 1 до 250.");
                }
            }

            race.addCar(new Car(name, speed));
        }

        Car fastestCar = race.getFastestCar();
        System.out.println(fastestCar.name + " оказалась самой быстрой и проехала " +
                race.distanceIn24Hours(fastestCar.speed) + " км за 24 часа.");
    }
}
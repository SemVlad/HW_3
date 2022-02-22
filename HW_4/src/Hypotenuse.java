import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        // Объявляем переменные
        double hypotenuse;
        int katA;
        int katB;

        // Вводим данные
        do {
            System.out.print("Введите катет а: ");
            Scanner scan = new Scanner(System.in);
            katA = scan.nextInt();
            System.out.print("Введите катет b: ");
            katB = scan.nextInt();
            // Проверка вводных данных
            if (katA <= 0 || katB <= 0) {
                System.out.println("Введены не корректные данные. ");
                System.out.println("Введите целые положительные значения больше нуля. ");
            }
        } while (katA <= 0 || katB <= 0);
        // Вычисление гипотенузы
        hypotenuse = Math.sqrt(katA * katA + katB * katB);
        System.out.println("Гипотенуза = " + hypotenuse);
    }
}



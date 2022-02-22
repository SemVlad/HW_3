import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        // Ввод данных
        System.out.print("Введите катет а: ");
        Scanner scan = new Scanner(System.in);
        int katA = scan.nextInt();
        System.out.print("Введите катет b: ");
        int katB = scan.nextInt();
        double hypotenuse;

        // Тело программы
        // Проверка вводных данных
        if (katA <= 0 || katB <= 0) {
            System.out.println("Введены не корректные данные. ");
            System.out.print("Введите целые положительные значения больше нуля. ");
        } else {
            hypotenuse = Math.sqrt(katA * katA + katB * katB);
            System.out.println("Гипотенуза = " + hypotenuse);
        }
    }
}

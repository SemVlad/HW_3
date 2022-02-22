import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {

        // Ввод данных
        System.out.print("Введите число а: ");
        Scanner scan = new Scanner(System.in);
        int numA = scan.nextInt();
        System.out.print("Введите число b: ");
        int numB = scan.nextInt();
        int numC;

        // Тело программы
        if (numA <= numB) {
            numC = numA + numB;
            System.out.println("Результат с: " + numC);
        } else {
            numC = numA - numB;
            System.out.println("Результат с: " + numC);
        }
    }
}

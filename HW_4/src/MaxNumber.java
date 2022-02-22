import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        // Ввод чисел
        System.out.print("Введите первое число : ");
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();               // Ввод числа
        System.out.print("Введите второе число : ");
        int numberTwo = scan.nextInt();
        System.out.print("Введите третье число : ");
        int numberThree = scan.nextInt();
        int numMaxOne; // Наибольшее число
        int numMax;

        // Определение максимального числа
        numMaxOne = Math.max(numberOne, numberTwo);
        numMax = Math.max(numMaxOne, numberThree);
        System.out.print("Наибольшее число = " + numMax);
    }
}

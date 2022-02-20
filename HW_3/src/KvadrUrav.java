import java.util.Scanner;

public class KvadrUrav {
    public static void main(String[] args) {
        // Объявляем переменные;
        double D;
        double x;
        double x1;
        double x2;
        // Вводим значение параметров уравнения;
        System.out.print("Введите цело цисло а: ");
        Scanner scanA = new Scanner(System.in);
        int a = scanA.nextInt();
        System.out.print("Введите цело цисло b: ");
        Scanner scanB = new Scanner(System.in);
        int b = scanB.nextInt();
        System.out.print("Введите цело цисло c: ");
        Scanner scanC = new Scanner(System.in);
        int c = scanC.nextInt();
        // Вычисляем дискриминант;
        D = b * b - 4 * a * c;
        // По очереди проверяем полученный дискриминант и находим корни уравнения;
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("D = " + D + " - Уравнение имеет два корня.");
            System.out.println("Корень х1 = " + x1);
            System.out.println("Корень х2 = " + x2);
        }
        if (D == 0) {
            x = (-b) / (2 * a);
            System.out.println("D = " + D + " - Уравнение имеет один корень.");
            System.out.println("Корень х = " + x);
        }
        if (D < 0) {
            System.out.println("D = " + D + " - Уравнение корней не имеет.");
        }
    }
}

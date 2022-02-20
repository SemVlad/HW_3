
import java.util.Scanner;

public class LoanClassic {
    public static void main(String[] args) {
        // Вводим значение суммы кредита.
        System.out.print(" Введите сумму кредита: ");
        Scanner scanner = new Scanner(System.in);
        int sumCredit = scanner.nextInt(); // сумма кредита

        // Вводим количество месяцев кредитования.
        System.out.print("Введите количество месяцев кредитования: ");
        int  numOfMonth = scanner.nextInt(); // количество месяцев

        // Вводим процентную ставку в относительных единицах.
        System.out.print("Введите процентную ставку в формате 0.22 : ");
        double percentRate = scanner.nextDouble();

        // Объявляем переменный, которые будут использоваться для расчетов.
        double sumPercentCreditTotal = 0; // Сумма переплаты за весь кредитный период
        double sumPercentCreditI ; // Сумма переплаты за i-тый  период
        double sumPercentCreditFirst = 0; // Сумма переплаты за первый период

        // Вычисляем сумму погашения тела кредита.
        double sumLoanRepay = sumCredit / numOfMonth;  // Сумма погашения тела кредита
        System.out.println("Сумма, которая идет на погашение тела кредита = " + sumLoanRepay);

        // Расчет переплат
        for (int i = 1; i <= numOfMonth; i++) {
            if (i == 1) {
                // Переплата за первый месяц
                sumPercentCreditFirst = (sumCredit * percentRate) / numOfMonth;
                System.out.println(i + " расчетный период. Сумма, которая идет на погашение процентов по кредиту = " + sumPercentCreditFirst);
            } else {
                // Переплаты за остальные месяцы
                sumPercentCreditI = ((sumCredit - sumLoanRepay) * percentRate) / numOfMonth;
                sumCredit = (sumCredit - sumLoanRepay); // Вычисление остатока суммы кредитования

                sumPercentCreditTotal = sumPercentCreditTotal + sumPercentCreditI;
                System.out.println(i + " расчетный период. Сумма, которая идет на погашение процентов по кредиту = " + sumPercentCreditI);
            }
        }
        // Вычисляем сумму переплаты за полный период кредитования.
        sumPercentCreditTotal = sumPercentCreditTotal + sumPercentCreditFirst;
        System.out.println("Сумма переплаты за " + numOfMonth + " месяцев = " + sumPercentCreditTotal);
    }
}


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //  Значение суммы кредита.
        double sumCredit = 50000;

        //  Количество месяцев кредитования.
        int numOfMonth = 12;

        // Процентная ставка в относительных единицах.
        double percentRate = 0.22;

        // Объявляем переменный, которые будут использоваться для расчетов.
        double sumPercentCreditTotal = 0; // Сумма переплаты за весь кредитный период
        double sumPercentCreditI; // Сумма переплаты за i-тый  период
        double sumPercentCreditFirst = 0; // Сумма переплаты за первый период

        // Вычисляем сумму погашения тела кредита.
        double sumLoanRepay = sumCredit / numOfMonth;  // сумма погашения тела кредита
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


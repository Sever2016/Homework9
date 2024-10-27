public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] paymentsPerWeek = {252000, 353555, 456777, 655000, 120022};
        int paymentsPerMonth = 0;
        for (int payment : paymentsPerWeek) {
            paymentsPerMonth += payment;
        }
        System.out.println("Сумма трат за месяц составила " + paymentsPerMonth + " рублей");
        //Задача 2
        int maxPayment = paymentsPerWeek[0];
        int minPayment = paymentsPerWeek[0];
        for (int payment : paymentsPerWeek) {
            if (payment >= maxPayment) {
                maxPayment = payment;
            }
            if (payment <= minPayment) {
                minPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        //Задача 3
        double countOfPaymentsPerWeek = paymentsPerWeek.length;
        double sumOfPaymentsPerWeek = paymentsPerMonth;
        double averagePaymentPerWeek = sumOfPaymentsPerWeek / countOfPaymentsPerWeek;

        System.out.println("Средняя сумма трат за месяц составила " + averagePaymentPerWeek + " рублей");
        //Задача 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
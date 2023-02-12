public class CreditPaymentService {
    /*
    Формула взята отсюда:

    https://www.raiffeisen.ru/wiki/kak-rasschitat-annuitetnyj-platezh/

    payment - ежемесячный платеж
    credit - сумма кредита
    rate  - процентная ставка
    month - срок кредита в месяцах

    Не стал искать как переводить число в отрицательное для степени в формуле,
    использовал выражение [0 - month]
     */
    public double calculate (double credit, double rate, double month){

        double payment = credit * (rate / (100 * 12)) / (1 - Math.pow((1 + (rate / (100 * 12))), 0 - month));
        return payment;

    }
}

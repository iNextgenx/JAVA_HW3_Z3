public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // метод ([сумма кредита], [процентная ставка], [срок в месяцах])

        System.out.println((int) service.calculate (1_000_000, 9.99, 12));
        System.out.println((int) service.calculate (1_000_000, 9.99, 24));
        System.out.println((int) service.calculate (1_000_000, 9.99, 36));
    }
}
public class Main {
    public static void main(String[] args) {
        double currentBalance = 10.15;
        int payment = 1010;

        int percent = (payment > 1000) ? 1 : 0;
        int bonus = payment / 100 * percent;

        double newBalance = currentBalance + payment + bonus;

        System.out.println("Ваш баланс " + newBalance + " из них бонусных рублей: " + bonus);

    }
}
public class Main {
    public static void main(String[] args) {
        int current_balance = 100;
        int payment = 1100;
        int required_payment = 1000;
        int bonus_peace = 100;
        int bonus;

        if (payment >= required_payment) {
            bonus = payment / bonus_peace;
        } else {
            bonus = 0;
        }

        int new_balance = current_balance + payment + bonus;

        if (bonus > 0) {
            System.out.println("Баланс пополнен на: " + payment + " рублей. Вам начислено " + bonus + " бонусных рублей." + " Текущий баланс: " + new_balance + " рублей.");
        } else {
            System.out.println("Баланс пополнен на: " + payment + " рублей. Текущий баланс: " + new_balance + " рублей.");
        }

    }
}
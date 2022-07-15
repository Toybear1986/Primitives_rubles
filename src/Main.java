public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int payment = 1100;
        int requiredPayment = 1000;
        int bonusPeace = 100;
        int bonus;

        if (payment >= requiredPayment) {
            bonus = payment / bonusPeace;
        } else {
            bonus = 0;
        }

        int newBalance = currentBalance + payment + bonus;

        if (bonus > 0) {
            System.out.println("Баланс пополнен на: " + payment + " рублей. Вам начислено " + bonus + " бонусных рублей." + " Текущий баланс: " + newBalance + " рублей.");
        } else {
            System.out.println("Баланс пополнен на: " + payment + " рублей. Текущий баланс: " + newBalance + " рублей.");
        }

    }
}
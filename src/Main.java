public class Main {
    public static void main(String[] args) {
        int base = 100; // начальная сумма на счету
        int refill = 1000; // сумма пополнения счёта
        int bonus = refill / 100; // начисленный бонус

        if (1000 >= refill) {
            System.out.println("Ваш баланс: " + (base + refill) + " рублей (рубль)");
        } else {
            System.out.println("Ваш баланс: " + (base + refill + (refill / 100)) + " рублей (рубль)");
            System.out.println("Начисленные бонусы: " + bonus + " рублей");


        }
    }

}

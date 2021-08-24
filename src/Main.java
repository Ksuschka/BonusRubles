public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1400;
        int finalBalance;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
            finalBalance = balance + refill + bonus;
        } else {
            finalBalance = balance + refill;
            bonus = 0;
        }
        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}

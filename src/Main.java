public class Main {
    public static void main(String[] args) {
        int payment = 1050;
        //пополнение баланса
        int balance = 17;
        double v = 1.1;
        double cashback;
        // cashback: по 1 рублю за каждые 100 рублей
        cashback = 1.1;
        int account = (int) (payment * cashback) + balance;
        if (payment * cashback > 100) {
            System.out.println(account);
        }
    }
}


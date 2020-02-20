public class Main {
    public static void main(String[] args) {
        int payment = 1050;
        int amount = 17;
        int percent;
        percent = 11;
        int bonus = (int) (payment * percent / 100);
        if (payment * percent > 100) {
            System.out.println(bonus);
        }
    }
}


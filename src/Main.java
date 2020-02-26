public class Main {
    public static void main(String[] args) {
        boolean condition = true;
        int balance = 25;
        int payment = 1250;
        int bonus = payment / 100;
        int total = balance + payment + bonus;
        if (payment > 1000) {
            bonus = payment /100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}


public class Main {
    public static void main(String[] args) {
        long currentBalance = 100;
        long topup = 3000;
        long bonus;
        if (topup > 1000) {
            bonus = topup / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}

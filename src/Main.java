public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int topup = 3000;
        int bonus;
        if (topup > 1000) {
            bonus = topup / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);
    }
}

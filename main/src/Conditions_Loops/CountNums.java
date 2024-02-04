package Conditions_Loops;

public class CountNums {
    public static void main(String[] args) {
        int n = 454467454;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 4) {
                count++;
            }
            n = n / 10; // n /= 10
        }

        System.out.println(count);
    }
}
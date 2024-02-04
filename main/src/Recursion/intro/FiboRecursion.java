package Recursion.intro;

public class FiboRecursion {
    public static void main(String[] args) {
        int ans = fibon(7);
        System.out.println(ans);
    }

    static int fibon(int n) {
        // base condition
        if (n < 2) {
            return n;
        }
        return fibon(n-1) + fibon(n-2);
    }
}
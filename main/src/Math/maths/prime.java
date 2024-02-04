package Math.maths;

import java.util.*;


public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n= input.nextInt();
        if(n<=1){
            System.out.println("Number is neither Math.maths.prime nor composite");
            return;
        }
        int c= 2;
        while(c*c<=n){
            if(n%c==0){
                System.out.println("not Math.maths.prime");
                return;
            }
            c=c+1;


        }
        if(c*c>n){
            System.out.println("Prime");
        }


    }
}

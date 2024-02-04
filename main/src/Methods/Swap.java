package Methods;

public class Swap {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(num1, num2);

//        System.out.println(num1 + " " + num2);

        String name = "Kunal Kushwaha";
        changeName(name);

    }

    static void changeName(String naam) {
        naam = "Rahul Rana"; // creating a new object
        System.out.println(naam);
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
        // this change will only be valid in this function scope only.
    }
}

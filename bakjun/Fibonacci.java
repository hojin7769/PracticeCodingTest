package bakjun;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(3));

    }

    public static int fibonacci(int a){
        if (a == 0) {
            System.out.println("0");
            return 0;
        } else if (a == 1) {
            System.out.println("1");
            return 1;
        } else {
            int t = a -1;
            int k = a-2;
            return fibonacci(t) + fibonacci(k);
        }
    }
}

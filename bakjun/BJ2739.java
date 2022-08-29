package bakjun;

import java.util.Scanner;

public class BJ2739 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        for (int k = 1; k <= 9; k++){
            System.out.println( i + " * " + k + " = " + i*k);
        }
    }
}

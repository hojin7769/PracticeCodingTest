package bakjun;

import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {
        int one = 0;
        int two = 0;

        Scanner sc = new Scanner(System.in);
        one = sc.nextInt();
        two = sc.nextInt();
        sc.close();

        System.out.println( one *(two%100%10) );
        System.out.println(one * (two/10%10));
        System.out.println(one * (two/100));
        System.out.println(one * two);



    }
}

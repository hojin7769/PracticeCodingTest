package bakjun;

import java.util.Scanner;

public class BJ9498 {

    public static void main(String[] args) {
        int score = new Scanner(System.in).nextInt();
        String result = "F";
        switch (score/10){
            case 10: case 9:
                result ="A";
                break;
            case 8:
                result ="B";
                break;
            case 7:
                result ="C";
                break;
            case 6:
                result ="D";
                break;
            default:
                result ="F";
                break;
        }

        System.out.println(result);
    }
}

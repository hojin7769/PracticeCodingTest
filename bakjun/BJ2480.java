package bakjun;

import java.util.Arrays;
import java.util.Scanner;

public class BJ2480 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] list = new int[3];

        for (int i = 0; i < 3; i++){
            list[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(list);
        if( list[0] == list[1] && list[0] == list[2] && list[1] == list[2]){
            sum = 10000 + list[0]* 1000;
        } else if (list[0] == list[1] || list[0] == list[2]) {
            sum = 1000 + list[0] * 100;
        }else if(list[1] == list[2]){
            sum = 1000 * list[1] * 100;
        }else{
            sum = list[2] * 100;
        }


        System.out.println(sum);

    }
}

package bakjun;

import java.util.Scanner;

public class BJ2525 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();


        if( (min + time) / 60 > 0 ){
            hour =  hour  + ((min + time) / 60);
            min = (min + time) % 60;
            if (hour >= 24 ){
                hour = hour - 24;
            }
        }else{
            min = min + time;
        }

        System.out.print( hour);
        System.out.print(" ");
        System.out.println(min);
    }
}

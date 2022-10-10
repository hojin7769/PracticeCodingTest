package bakjun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ10430 {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < 3; i++){
            list.add(sc.nextInt());
        }

        System.out.println((list.get(0)+list.get(1))%list.get(2));
        System.out.println(((list.get(0)+list.get(2))+(list.get(1)%list.get(2)))%list.get(2));
        System.out.println((list.get(0)*list.get(1))%list.get(2));
        System.out.println(((list.get(0)%list.get(2))*(list.get(1)%list.get(2)))%list.get(2));

    }
}

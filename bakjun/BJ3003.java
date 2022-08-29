package bakjun;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BJ3003 {

    public static void main(String[] args) {

        int [] chess  = {1,1,2,2,2,8};

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 6; i++){
            int k = sc.nextInt();
            if (k < 0 || k > 10){
                break;
            }
            list.add(k);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            resultList.add(chess[i] - list.get(i));
        }

        Iterator<Integer> iterator =  resultList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}

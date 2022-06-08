import java.util.*;

class Solution_나머지가1이되는수찾기 {

    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++){
            if (n%i == 1){
                list.add(i);
            }
        }

        System.out.println(list);

        return answer;
    }
}
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution_음양더하기 {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int sum = 0;
        for (int i = 0 ; i < absolutes.length;i++){
            if (signs[i]){
                sum += absolutes[i];
            }else{
                sum += (-absolutes[i]);
            }
        }


        answer = sum;

        return answer;
    }
}
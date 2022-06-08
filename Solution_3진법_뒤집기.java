import java.util.ArrayList;
import java.util.List;

class Solution_3진법_뒤집기 {

    public int solution(int n) {
        int answer = 0;
        String list = "";
        int remainder = 0;
        int share = n;

        while(share >= 1){
            remainder = share % 3;
            share = share / 3;
            list = list + remainder;
        }
        System.out.println(list);
        int ans = 0;
        char[] nums = list.toCharArray();
        for(int i=0; i < nums.length; i++){
            // 'A'이상의 숫자, 즉 10이상의 경우에는 'A'를 빼고 10을 더하면 원래 숫자가 됨
            if(nums[i] >= 'A'){
                ans = ans * 3 + (nums[i] - 'A' + 10);
                // 그 이하는 단순히 '0'만 빼면 된다.
            } else {
                ans = ans * 3+ (nums[i] - '0');
            }
        }

        answer = ans;

        return answer;
    }
}
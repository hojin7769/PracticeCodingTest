class Solution_다음_큰_숫자 {

    public int solution(int n) {
        int answer = 0;
        int count =Integer.bitCount(n);
        int countUp = 0;
        do {
            countUp = Integer.bitCount(++n);
            answer = n;
        }while (count != countUp);

        return answer;
    }



    /*public int solution(int n) {
        int answer = 0;
        String t = Integer.toBinaryString(n);
        String t2 = "";
        char[] c2 = t.toCharArray();
        int countOne = 0;
        int countUpOne = 0;
        for (int i = 0;  i < c2.length; i++ ){
            if (c2[i] == '1'){
                countOne++;
            }
        }
        while (countOne != countUpOne){
            t2 = Integer.toBinaryString(++n);
            countUpOne = (int)t2.chars().filter(c -> c == '1').count();
            answer = n;
        }
        return answer;
    }*/
}
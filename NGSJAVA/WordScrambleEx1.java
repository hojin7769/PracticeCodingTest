package NGSJAVA;

import java.util.*;

class WordScrambleEx1 {
        public static void main(String[] args) {
            String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"};
            String answer = "";
            answer = getAnswer(strArr);

            String question = getScrambledWord(answer);

            System.out.println("Question:"+question);
            System.out.println("Answer:"+answer);
        } // main

        public static String getAnswer(String[] strArr) {
            // 내용을 완성하세요.
            Random rnd = new Random();
            int rndNum = rnd.nextInt(strArr.length);


            return strArr[rndNum];
        }

        public static String getScrambledWord(String str) {
            // 내용을 완성하세요.
            Random rnd = new Random();

            List<Character> list = new ArrayList<>();
            for (int i = 0 ; i < str.length(); i++){
                list.add(str.charAt(i));
            }
            Collections.shuffle(list);
            String result = "";
            for (int i = 0 ; i<list.size(); i++){
                result += list.get(i);
            }

            return result;
        } // scramble(String str)
    }

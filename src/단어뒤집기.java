//단어 뒤집기
//설명
//
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

    static ArrayList<String> solution1(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String s : str){
            String temp = new StringBuilder(s).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    static ArrayList<String> solution2(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            int start = 0;
            int end = chars.length - 1;
            while (start < end) {
                chars[start] = s.charAt(end);
                chars[end] = s.charAt(start);
                start++;
                end--;
            }
            answer.add(String.valueOf(chars));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String[] strings = new String[i];
        for(int s = 0; s < i ; s++){
            strings[s] = scanner.next();
        }

        solution2(strings).forEach(System.out::println);
    }
}

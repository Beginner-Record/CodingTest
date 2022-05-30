//소수(에라토스테네스 체)
//설명
//
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//입력
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//출력
//첫 줄에 소수의 개수를 출력합니다.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 소수 {

    static int solution(int n){
        int answer = 0;
        int[] ints = new int[n + 1];

        for(int i = 2 ; i <= n; i++){
            if(ints[i] == 0) answer++;
            for(int e = i ; e <= n ; e=e+i){
                ints[e] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println(solution(n));
    }
}

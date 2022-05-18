//문제
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
//
//입력
//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//출력
//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 별찍기 {

    static void solution(int num) {
        final String star = "*";

        for (int i = 1; i <= num; i++) {

            //공백 구하기
            for (int t = num; t != i; t--) { // (t = 5(num) ; 5(t) != 1(i) ; 5(t)--) 즉 4번 루프 공백 4번
                System.out.print(" ");
            }

            //별찍기
            for (int s = 0; s < i; s++) {
                System.out.print(star);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int read = Integer.parseInt(bufferedReader.readLine());
        solution(read);
    }
}

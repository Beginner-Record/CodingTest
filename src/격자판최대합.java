import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 격자판최대합 {

    static int solution(int n, int[][] k) {
        int answer = 0;

        int sum1, sum2;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += k[i][j];
                sum2 += k[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += k[i][i];
            sum2 += k[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] k = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] str = bufferedReader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                k[i][j] = Integer.parseInt(str[j]);
            }
        }
        System.out.println(solution(n, k));
    }
}

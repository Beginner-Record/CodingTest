import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 임시반장정하기 {

    static int solution(int n, int[][] arr) {
        int answer = 0;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            int tmp = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 6; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        tmp++;
                        break;
                    }
                }
            }
            if (tmp > num) {
                num = tmp;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            String[] str = bufferedReader.readLine().split(" ");
            for (int j = 1; j < 6; j++) {
                arr[i][j] = Integer.parseInt(str[j - 1]);
            }
        }
        System.out.println(solution(n, arr));

    }
}

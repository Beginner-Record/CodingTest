import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 봉우리 {

    static int solution(int n, int[][] k) {
        int answer = 0;
        int[] x = {-1, 0, 1, 0};
        int[] y = {0, 1, 0, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean tmp = true;
                for (int s = 0; s < 4; s++) {
                    int ix = i + x[s];
                    int jy = j + y[s];
                    if (ix >= 0 && ix < n && jy < n && jy >= 0 && k[i][j] <= k[ix][jy]) {
                        tmp = false;
                        break;
                    }
                }
                if (tmp) answer++;
            }
        }

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

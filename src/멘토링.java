import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 멘토링 {

    static int solution(int n, int m, int arr[][]) {
        int answer = 0;
        for(int i = 1 ; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for(int k = 0 ; k < m ; k++){
                    int pi = 0;
                    int pj = 0;
                    for(int c = 0 ; c < n ; c++){
                        if(arr[k][c] == i) pi = c;
                        if(arr[k][c] == j) pj = c;
                    }
                    if(pi < pj) cnt++;
                }
                if(cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            String[] str = bufferedReader.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        System.out.println(solution(n, m, arr));

    }
}

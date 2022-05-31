import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 점수계산 {

    static int solution(int n, int[] k){
        int answer = 0;
        int tmp = 0;

        for(int i = 0 ; i < n ; i++){
            if( k[i] == 1) {
                tmp++;
                answer += tmp;
            }
            else tmp = 0;
        }

        return answer;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");
        int[] k = new int[n];
        for ( int i = 0 ; i < n ; i++){
            k[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(n, k));
    }
}

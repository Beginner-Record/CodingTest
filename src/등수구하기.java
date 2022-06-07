import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 등수구하기 {

    static String solution(int n, int[] k) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            int tmp = 1;
            for (int j = 0; j < n; j++){
                if(k[i] < k[j]) tmp++;
            }
            answer += tmp+" ";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");
        int[] k = new int[n];

        for (int i = 0; i < n; i++) {
            k[i] = Integer.parseInt(str[i]);
        }

        System.out.println(solution(n, k));
    }
}

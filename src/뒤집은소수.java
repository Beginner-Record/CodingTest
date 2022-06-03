import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 뒤집은소수 {

    static String solution(int n, int[] k) {
        String answer = "";

        for (int i = 0; i < n; i++) {
            int tmp = k[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                answer += res + " ";
            }
        }

        return answer;
    }

    private static boolean isPrime(int res) {
        if (res == 1) return false;
        else {
            for (int i = 2; i < res; i++) {
                if (res % i == 0) return false;
            }
            return true;
        }
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

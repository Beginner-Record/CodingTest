import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 가위바위보 {
    static String[] solution(int n, int[] a, int[] b){
        String[] answer = new String[n];

        for(int i = 0; i < n ; i++){
            if(a[i]-b[i] == 0) answer[i] = "D";
            else if(a[i]-b[i] == 1 || a[i]-b[i] == -2)  answer[i] = "A";
            else answer[i] = "B";
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] strA = bufferedReader.readLine().split(" ");
        String[] strB = bufferedReader.readLine().split(" ");

        int a[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            a[i] = Integer.parseInt(strA[i]);
        }

        int b[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            b[i] = Integer.parseInt(strB[i]);
        }

        Arrays.stream(solution(n, a, b)).forEach(System.out::println);
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 피보나치수열 {

    static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        int lastInt = 0;
        for (int i = 1 ; i < n ; i++){
            answer[i] = answer[i-1]+lastInt;
            lastInt = answer[i-1];
        }

        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Arrays.stream(solution(n)).forEach(it -> System.out.print(it+ " "));
    }
}

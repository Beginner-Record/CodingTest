//보이는 학생
//설명
//
//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//
//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
//
//
//입력
//첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
//
//
//
//출력
//선생님이 볼 수 있는 최대학생수를 출력한다.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 보이는학생 {

    static int solution(int n , int[] i){
        int answer = 1;
        int bigNum = i[0];
        for(int s = 1 ; s < n ; s++){
            if ( bigNum < i[s]) {
                answer++;
                bigNum = i[s];
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] str = bufferedReader.readLine().split(" ");
        int[] i = new int[n];
        for (int s = 0 ; s < n ; s++){
            i[s] = Integer.parseInt(str[s]);
        }
        System.out.println(solution(n, i));
    }
}

//문제
//배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
//
//배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다. 이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.
//
//출력
//각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class N번째큰수 {

    static int solution(int[] i){
        for(int s=0; s<i.length; s++) {
            for(int j=s+1; j<i.length; j++) {
                if(i[s] > i[j]) { //오름차순
                    int tmp = i[s];
                    i[s] = i[j];
                    i[j] = tmp;
                }
            }
        }

        return i[i.length-3];
    }

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for( int s = 0 ; s < t ; s++){
            String[] str = bufferedReader.readLine().split(" ");
            int[] i = new int[str.length];
            for ( int a = 0 ; a < str.length ; a++){
                i[a] = Integer.parseInt(str[a]);
            }
            System.out.println(solution(i));
        }
    }
}

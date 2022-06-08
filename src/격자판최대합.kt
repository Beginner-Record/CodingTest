import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val n = bufferedReader.readLine().toInt()
    var k = Array(n) { IntArray(n) }
    for (i in 0 until n) {
        val str = bufferedReader.readLine().split(" ")
        for (j in 0 until n) {
            k[i][j] = str[j].toInt()
        }
    }
    println(solution(n, k))
}

fun solution(n: Int, k: Array<IntArray>): Int {
    var answer = 0
    var sum1: Int
    var sum2: Int

    for (i in 0 until n) {
        sum1 = 0
        sum2 = 0
        for(j in 0 until n){
            sum1 += k[i][j]
            sum2 += k[j][i]
        }
        answer = max(answer, sum1)
        answer = max(answer, sum2)
    }

    sum1 = 0
    sum2 = 0
    for (i in 0 until n){
        sum1 += k[i][i]
        sum2 += k[i][n-i-1]
    }
    answer = max(answer, sum1)
    answer = max(answer, sum2)

    return answer
}
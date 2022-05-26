import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val n = bufferedReader.readLine().toInt()
    val str = bufferedReader.readLine().split(" ")
    var i = IntArray(n)
    for (s in 0 until n) {
        i[s] = str[s].toInt()
    }
    println(solution(n, *i))

}

fun solution(n: Int, vararg i: Int): Int {
    var answer = 1
    var bigNum = i[0]
    for (s in 1 until i.size) {
        if (i[s] > bigNum) {
            bigNum = i[s]
            answer++
        }
    }
    return answer
}
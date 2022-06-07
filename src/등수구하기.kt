import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val n = bufferedReader.readLine().toInt()
    val s = bufferedReader.readLine().split(" ")
    val k = IntArray(n)

    for(i in 0 until n){
        k[i] = s[i].toInt()
    }

    println(solution(n, k))
}

fun solution(n : Int , k : IntArray) : String{
    var answer = ""

    for (i in 0 until n){
        var tmp = 1
        for (j in 0 until n){
            if( k[i] < k[j]) tmp++
        }
        answer += "$tmp "
    }

    return answer
}
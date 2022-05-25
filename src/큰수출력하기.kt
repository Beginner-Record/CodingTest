import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val n = bufferedReader.readLine().toInt()
    val str = bufferedReader.readLine().split(" ")
    println(solution(n, *str.toTypedArray()))

}

fun solution(n : Int, vararg str : String) : String{
    var answer = str[0]+" "
    for (i in 1 until n){
        if(str[i-1].toInt() < str[i].toInt()) answer += str[i]+" "
    }
    return answer
}
import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    BufferedReader(InputStreamReader(System.`in`)).use {
        val n = it.readLine().toInt()
        val k = Array<IntArray>(n) { IntArray(n) }
        for (i in 0 until n) {
            val str = it.readLine().split(" ")
            for (j in 0 until n) {
                k[i][j] = str[j].toInt()
            }
        }
        println(solution(n, k))

    }
}

fun solution(n: Int, k: Array<IntArray>): Int {
    var answer = 0
    val x = arrayOf(0, 1, 0, -1)
    val y = arrayOf(-1, 0, 1, 0)

    for (i in 0 until n) {
        for (j in 0 until n) {
            var tmp = true
            for (t in 0..3) {
                val ix = i + x[t]
                val jy = j + y[t]
                if (ix >= 0 && jy >= 0 &&
                    ix < n && jy < n &&
                    k[i][j] <= k[ix][jy]
                ) {
                    tmp = false
                    break
                }
            }
            if (tmp) answer++
        }
    }

    return answer
}
fun main() {
    // TODO: Fix negative error for large answers
    var n = readLine()!!.toInt()
    for (case in 1..n) {
        var (R, A, B) = readLine()!!.split(' ').map{ it.toInt() }
        var result = 0.0
        result += R * R
        while (R > 0){
            R *= A
            result += R * R
            R /= B
            result += R * R
        }
        result *= Math.PI
        println("Case #$case: $result")
    }
}
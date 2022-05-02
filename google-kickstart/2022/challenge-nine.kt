fun main() {
    // TODO: Fix failing tests
    var n = readLine()!!.toInt()
    for(case in 1..n) {
        var a = readLine()!!
        var sum = 0
        for(i in 0 until a.length) {
            sum += a.get(i).digitToInt()
        }
        var digit = (9 - sum%9)%9
        var result = ""
        for(i in 0 until a.length)) {
            if (digit < a.get(i).digitToInt()) {
                result = a.slice(0 until i) + digit + a.slice(i until a.length)
            }
        }
        println("Case #$case: $result")
    }
}
fun main() {
  var a = readLine()!!.toInt()
  for (i in 1 .. a) {
      var I = readLine()!!
      var P = readLine()!!
      var nI = I.length
      var nP = P.length
      if (nP < nI) {
        println("Case #$i: IMPOSSIBLE")
        continue
      }
      var pI = 0
      var pP = 0
      while(pI < nI && pP < nP){
        if (I.get(pI) === P.get(pP)) {
          pI += 1
          pP += 1
        } else {
          pP += 1
        }
      }
      if (pI == nI) {
        println("Case #$i: ${nP-nI}")
      } else {
        println("Case #$i: IMPOSSIBLE")
      }
  }
}
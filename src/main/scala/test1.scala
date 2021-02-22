import scala.math._
import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.SortedMap

class test1 {

}

//object test1 {
//  def main(args: Array[String]): Unit = {
//    var str = "Hello World!"
//    var str2 = "I'm in temp branch now."
//    println(str)
//    println(str2)
//  }
//}

//object test2 {
//  def randomArray(n: Int)= {
//    for (i <- 0 until n)
//    yield (random * i).toInt
//  }
//
//  def main(args: Array[String]): Unit={
//    for (i <- 1 to (10, 2)) {
//      var random_array = randomArray(5)
////      println(random_array)
//      println(i)
//    }
//  }
//}

//object test3 {
//  def rem(a: ArrayBuffer[Double]): Unit={
//    var first = true
//    var n = a.length
//    var i = 0
//    while (i < n) {
//      if (a(i) >= 0) {
//        i += 1
//      }
//      else {
//        if (first) {
//          first = false
//          i += 1
//        }
//        else {
//          a.remove(i)
//          n -= 1
//        }
//      }
//    }
//  }
//  def main(args: Array[String]): Unit = {
//    val a = ArrayBuffer(-1, 1, 2, -3.0, 4)
//    rem(a)
//    println(a)
//  }
//}

object test1 {
  def main(args: Array[String]): Unit = {
    var s = Map("Zhangsan" -> 1, "LiSi" -> 2, "WangWu" -> 3)
    println(s)
    var ss = new HashMap[String, Int]
    ss("a1") = 1
    ss("a2") = 2
    ss("a3") = 3
    println(ss)
    ss("a1") = 11
    println(ss)
//    val a1_value = ss.getOrElse("a11", -1)
//    println(a1_value)
    var sss = ss + (("a1", 111), ("b1", "b1"))
    println(sss)

    val r = for ((k, v) <- sss) yield (v, k)
    println(r)

    var smp1 = SortedMap(("ZhangSan", 1), ("LiSi", 2), ("WangWu", 3))
  }
}

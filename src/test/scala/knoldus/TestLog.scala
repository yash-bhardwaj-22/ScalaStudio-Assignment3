package knoldus

import org.scalatest.flatspec.AnyFlatSpec

class TestLog extends AnyFlatSpec{
  val obj = new Log
  val s1 = obj.log("HAHA","LOL")
  //Test Case 1
  "Log" should " take level given in parameter"in{
    assert(s1=="[LOL]: HAHA")
  }
  val s2 = obj.log("Hi")
  //Test Case 2
  "Log" should "take default value of level"in{
    assert(s2=="[INFO]: Hi")
  }
}

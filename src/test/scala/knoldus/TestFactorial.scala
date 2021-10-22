package knoldus
import org.scalatest.flatspec.AnyFlatSpec

class TestFactorial extends AnyFlatSpec {
  val obj = new Factorial
  // Test Case for Factorial using Recursion
  // Test Case 1
  "Factorial of 6" should "return 720"in{
    assert(720==obj.factorialUsingRecursion(6))
  }
  // Test Case 2
  "Factorial of 2" should "return 2"in{
    assert(2 == obj.factorialUsingRecursion(2))
  }

  // Test Case for Factorial using Tail Recursion
  //Test Case 3
  "Factorial of 8" should "return 40320"in{
    assert(40320 == obj.factorialTailRecursion(8))
  }
  //Test Case 4
  "Factorial of 12" should "return 479001600"in{
    assert(479001600 == obj.factorialTailRecursion(12))
  }
}

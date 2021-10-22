package knoldus

import scala.annotation.tailrec

class Factorial {
   def factorialUsingRecursion(n: Int): Int = {
     if (n == 0) return 1
     else factorialUsingRecursion(n-1) * n
   }

   def factorialTailRecursion(n: BigInt): BigInt = {
     @tailrec
     def factorialAcc(n: BigInt, acc: BigInt): BigInt = {
       if (n == 0) acc
       else factorialAcc(n-1, acc * n)
     }
     factorialAcc(n, acc = 1)
   }

}

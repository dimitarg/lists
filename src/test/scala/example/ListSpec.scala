package example

import weaver.pure._
import weaver.scalacheck._
import fs2._
import cats.effect.IO
import cats.implicits._
import org.scalacheck.Gen
import org.scalacheck.Arbitrary

object ListSpec extends Suite with Checkers[IO] {

  override def suitesStream: Stream[IO,Test] = Stream(
    test("sample test") {
      expect(1 == 1).pure[IO]
    },

    test("sample property") {
      forall { (x: Int, y: Int) =>
        expect(x + y == y + x)

      }
    }
  )







  
  
  def genL[A](aGen: Gen[A]): Gen[L[A]] = Gen.listOf(aGen).map(L.fromStd)
  implicit def arbL[A](aArb: Arbitrary[A]): Arbitrary[L[A]] = Arbitrary(genL(aArb.arbitrary))

 
}

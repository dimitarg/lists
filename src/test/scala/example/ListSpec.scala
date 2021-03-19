package example

import weaver.pure._
import fs2._
import cats.effect.IO
import cats.implicits._

object ListSpec extends Suite {

  override def suitesStream: Stream[IO,Test] = Stream(
    test("sample test") {
      expect(1 == 1).pure[IO]
    }
  )

 
}

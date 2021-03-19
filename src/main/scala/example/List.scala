package example

import cats.Applicative

sealed trait L[A] {

  def foldRight[B](z: B)(f: (A, B) => B): B = ???

  def foldLeft[B](z: B)(f: (B, A) => B): B = ???

  def map[B](f: A => B): L[B] = ???

  def traverse[F[_]: Applicative, B](f: A => F[B]): F[List[B]] = ???
}

object L {

}
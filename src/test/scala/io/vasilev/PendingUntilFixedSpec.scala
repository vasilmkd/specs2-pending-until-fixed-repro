package io.vasilev

import org.scalacheck.Prop.forAll
import org.specs2.ScalaCheck
import org.specs2.mutable.Specification

class PendingUntilFixedSpec extends Specification with ScalaCheck {
  "Pending until fixed" should {
    "work" in {
      forAll { (_: Int) =>
        failure("boom!")
      }.pendingUntilFixed
    }
  }
}

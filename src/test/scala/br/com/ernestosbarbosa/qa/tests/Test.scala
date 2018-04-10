package br.com.ernestosbarbosa.qa.tests

import br.com.ernestosbarbosa.qa.Params
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Test {

  val exemplo = http("Exemplo")
    .get(Params.testeGet)
    .check(status.is(200))
}
package br.com.ernestosbarbosa.qa.simulation

import br.com.ernestosbarbosa.qa.core.Http
import br.com.ernestosbarbosa.qa.tests.Test
import io.gatling.core.Predef._
import org.junit.runner.RunWith
import ru.pravo.qa.gatling.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class GatlingSimulationTest extends Simulation {

  val scn = scenario("Teste")
      .exec(Test.exemplo)

  setUp(scn.inject(rampUsers(2).over(5))).protocols(Http.httpProtocol).assertions(forAll.failedRequests.percent.lte(0))

}

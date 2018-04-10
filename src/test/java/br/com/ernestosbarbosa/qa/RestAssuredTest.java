package br.com.ernestosbarbosa.qa;

import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class RestAssuredTest {

    @BeforeClass
    public static void setUp(){
        RestAssured.baseURI = Params.baseUrl;
    }

    @Test
    public void restAssuretTest(){
        given()
            .when()
                .get(Params.testeGet)
                .then()
                    .statusCode(200);
    }

}

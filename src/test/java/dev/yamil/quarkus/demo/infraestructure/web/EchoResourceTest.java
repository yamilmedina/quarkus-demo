package dev.yamil.quarkus.demo.infraestructure.web;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class EchoResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/echo")
          .then()
             .statusCode(200)
             .body(is("hello stranger"));
    }

}
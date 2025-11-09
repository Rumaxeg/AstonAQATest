package lesson_08Tests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.core.StringContains;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Lesson08Tests {

    @Test
    public void GetRequestWoopsTest() {
        given().baseUri("https://postman-echo.com/").contentType("application/JSON").queryParam("foo1", "bar1").and().queryParam("foo2", "bar2")
                .when().get("/get")
                .then().log().body()
                .statusCode(200)
                .and().body("args.foo1", equalTo("bar1"))
                .and().body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void PostRawTextTest() {
        given().baseUri("https://postman-echo.com/").contentType("text/plain").body("{test : value}")
                .when().post("/post")
                .then().log().body()
                .statusCode(200)
                .and().body("data", equalTo("{test : value}"))
                .and().body(not(contains("This is expected to be sent back as part of response body.")));

    }

    @Test
    public void PostFormData() {
        given().baseUri("https://postman-echo.com/").contentType("application/x-www-form-urlencoded").formParam("foo", "bar")
                .when().post("/post")
                .then().log().body()
                .statusCode(500)
                .and().body("form.foo", equalTo("bar"));
    }

    @Test
    public void PutRequestTest() {
        given().baseUri("https://postman-echo.com/").contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().put("/put")
                .then().log().body()
                .statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void PatchRequestTest() {
        given().baseUri("https://postman-echo.com/").contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().patch("/patch")
                .then().log().body()
                .statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }

    @Test
    public void DeleteRequestTest() {
        given().baseUri("https://postman-echo.com/").contentType("text/plain").body("This is expected to be sent back as part of response body.")
                .when().delete("/delete")
                .then().log().body()
                .statusCode(200)
                .and().body("data", equalTo("This is expected to be sent back as part of response body."));
    }
}

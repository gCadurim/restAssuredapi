package test.resources.qaops.automation.api;

import org.apache.http.HttpStatus;
import org.junit.Test;
import qaops.automation.api.domain.User;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class AppTest {
    @Test
    public void testListaMetadadosdoUsuario() {
        when().
            get("https://reqres.in").
        then().
            statusCode(200).
            body("pages", is(2));
    }
    @Test
    public void testListaMetadadosdoUsuarioerro() {
        when().
            get("https://reqres.in").
        then().
            statusCode(201).
            body("pages", is(2));
    }

}
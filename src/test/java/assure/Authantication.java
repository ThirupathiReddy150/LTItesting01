package assure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Authantication {
@Test
public void f1() {
	RestAssured.given().auth().basic("postman","password").when()
	.get("https://postman-echo.com/basic-auth")
	.then()
	.log().body();
	
}
}

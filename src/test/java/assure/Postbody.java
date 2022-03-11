package assure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Postbody {
	@Test
	public void TC1() {
		
	String a="{\r\n"
			+ "    \"name\": \"morpheus\",\r\n"
			+ "    \"job\": \"leader\"\r\n"
			+ "}";
	
	RestAssured.given()
	  .contentType(ContentType.JSON)
	  .body(a)
	  .when()
	   .post("https://reqres.in/api/users")
	  .then()
	   .statusCode(201)
	   .log().body();
	}
}

package assure;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import io.restassured.matcher.RestAssuredMatchers;

public class Passingpara {
	@Test
	public void f() {
		RestAssured.given()
		  .pathParam("pageNo",2)
		  .baseUri("https://reqres.in/")
		  .when()
		     .get("api/users?page={pageNo}")
		     .then()
		      .statusCode(200)
		        .log().body();
		
		
	}
   
}

package assure;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class AssureClass {
	
	@Test
	public void TC1() {
		
		RestAssured.baseURI="https://reqres.in/";
		Response response=RestAssured.given().get("/api/users?page=2");
		
		System.out.println(response.asString());
		
		Assert.assertTrue(response.asString().contains("michael"));
		
		Assert.assertEquals(200, response.getStatusCode());
		
		Assert.assertEquals(0, response.getTimeIn(TimeUnit.SECONDS));
		
		Headers header= response.getHeaders();
		
		System.out.println(header);
	}
	public void TC2() {
		RestAssured.given()
		  .baseUri("https://reqres.in/")
		.when()
		   .get("/api/users?page=2")
		.then()
		   .statusCode(200);
	
	}

}

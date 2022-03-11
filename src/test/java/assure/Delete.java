package assure;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Delete {
	@Test
	public void f() {
		RestAssured.given()
		//  .pathParam("pageNo",2)
		 
		  .baseUri("/api/users/2")
		  
		  .when()
		     
		     .delete("https://reqres.in/api/users/2")
		   
		     .then()
		      .statusCode(204)
		        .log().body();
	}

}

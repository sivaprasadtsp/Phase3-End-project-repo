package restassurescripts;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Assignment6 {
	 
	 @Test
	    public void testLogoutAPI() {
	        // Set base URI
	        RestAssured.baseURI = "https://petstore.swagger.io/v2/user";

	        // Perform GET request and validate response using Hamcrest
	        given()
	            .when()
	            .get("/logout")
	            .then()
	                .statusCode(200) // Validate response code is 200
	                .body("code", equalTo(200)) // Validate 'code' field in the response is 200
	                .body("message", equalTo("ok")); // Validate 'message' field in the response is "OK"
	    }

}

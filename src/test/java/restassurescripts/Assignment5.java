package restassurescripts;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
public class Assignment5 {
	 @Test
	    public void testPetFindByStatus() {
	        
	        RestAssured.given()
	                .param("status", "available")
	                .contentType(ContentType.JSON)
	                .when()
	                .get("https://petstore.swagger.io/v2/pet/findByStatus")
	                .then()
	                .statusCode(Matchers.equalTo(200))
	                .body(Matchers.everyItem(Matchers.equalTo("available")));

	        
	        RestAssured.given()
	                .param("status", "pending")
	                .contentType(ContentType.JSON)
	                .when()
	                .get("https://petstore.swagger.io/v2/pet/findByStatus")
	                .then()
	                .statusCode(Matchers.equalTo(200))
	                .body(Matchers.everyItem(Matchers.equalTo("pending")));

	        
	        RestAssured.given()
	                .param("status", "sold")
	                .contentType(ContentType.JSON)
	                .when()
	                .get("https://petstore.swagger.io/v2/pet/findByStatus")
	                .then()
	                .statusCode(Matchers.equalTo(200))
	                .body(Matchers.everyItem(Matchers.equalTo("sold")));
	    }
}

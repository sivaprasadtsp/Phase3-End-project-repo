package restassurescripts;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
public class Assigment3 {
	 @Test
	    public void testUserLogin() {
	        RestAssured.baseURI = "https://petstore.swagger.io/v2";

	        RestAssured.given()
	                .auth().basic("Uname001", "@tt!tude")
	                .contentType(ContentType.JSON)
	                .when()
	                .get("/user/login")
	                .then()
	                .statusCode(Matchers.equalTo(200))
	                .body(Matchers.containsString("logged in user session"));
	 }
}

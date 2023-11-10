package restassurescripts;
import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class Script007HamcrestValidateMethods {
	// Hamcrest dependency ahs been added to your POM file
		// This depenedency provides us many validation methods that help us to validate the response code

		// equalTo() Hamcrest method
		@Test(priority='1')
		public void ValidateRepsonseBody()
		{
			String PMapikey = "PMAK-65447d96a7ac350031f650e4-79966e3dabc58b3d031839d4ad7";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces[1].id", equalTo("9e971180-6a90-4c16-80e8-4601b730767a"),
				  "workspaces[1].name",equalTo("Phase3-Lesson2-APITesting"),
				   "workspaces[1].type",equalTo("personal"));
			
			
		}
		
		@Test(priority='2')
		public void ValidateRepsonseBody_equlaTo()
		{
			
			given().baseUri("https://petstore.swagger.io")
			.basePath("/v2/user/Uname001")
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("username", equalTo("Uname001"),
				  "email", equalTo("Positive@Attitude.com"),
				  "userStatus", equalTo(1));
			
			
		}
		
		
		@Test(priority='3')
		public void ValidateRepsonseBody_hasitems()
		{
			String PMapikey = "PMAK-65447d96a7ac350031f650e4-79abc58b3fa5d749d031839d4ad7";
			given().baseUri("https://api.postman.com")
			.basePath("/workspaces")
			.header("X-API-Key", PMapikey)
			.when().get()
			.then().statusCode(200)
			// fetch the repsonse body and validate if response includes corrrect values or not
			.body("workspaces.name", hasItems("My Workspace", "Phase3-Lesson2-APITesting"),
					"workspaces.type", hasItems("personal","personal"));
			
		
		}
		
		
}

package restassurescripts;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class LogginginRestAssured {
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447d96a7ac350031f650e4-79966e3dabc58b3fa5d749d031839d4ad7";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}
}

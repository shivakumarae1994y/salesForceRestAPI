package salesforce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateContact extends BaseClass {
	
	@Test
	public  void postReq() {
		// TODO Auto-generated method stub
		
		
		response = inpReq.contentType(ContentType.JSON).body("{\r\n    \"LastName\":\"Lname\"\r\n\r\n}").post();
		
		glbVar = response.jsonPath().get("id");
		response.prettyPrint();
		
		

	}

}

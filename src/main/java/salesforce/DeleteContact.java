package salesforce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteContact extends BaseClass{
	
	@Test(dependsOnMethods ="salesforce.CreateContact.postReq")
	public void delReq() {
		// TODO Auto-generated method stub
		
		response = inpReq.delete(glbVar);
		
		response.prettyPrint();
		int statusCode = response.statusCode();
		
		System.out.println(statusCode);

	}

}

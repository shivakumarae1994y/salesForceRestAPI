package salesforce;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetContact extends BaseClass{
	
	@Test(dependsOnMethods ="salesforce.CreateContact.postReq")
	public  void getReq() {
		// TODO Auto-generated method stub
		response = inpReq.get(glbVar);
		
		response.prettyPrint();
		int statusCode = response.statusCode();
		
		System.out.println(statusCode);

	}

}

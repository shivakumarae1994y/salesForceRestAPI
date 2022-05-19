package salesforce;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	
	static RequestSpecification inpReq = null;
	static Response response = null;
	static String glbVar ; 
	@BeforeMethod
	public void preCond() {
		RestAssured.useRelaxedHTTPSValidation();
		
		RestAssured.baseURI = "https://ap16.salesforce.com/services/data/v20.0/sobjects/contact";
		
		RestAssured.authentication = RestAssured.oauth2("00D5g000007oRrU!AQkAQMBVrvqx0wfRcAuKfKmkpsMAeBPVxV.g19tUYibaX_fe2wALjMqjbOBtu6Yp8hojtUwEJHjvJibQZDhEW_Xx8kAyduHx");
		
		inpReq = RestAssured.given().log().all();
	}
	
	@AfterMethod
	public void postCond() {
		response.prettyPrint();
	}

}

package DUMP;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo 
{
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException 
	{
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification a1 = RestAssured.given();
		Response res = a1.request(Method.GET,"/api/users?page=2");
		
	}
}

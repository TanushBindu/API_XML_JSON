package Utils;

import org.testng.Assert;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class Demo 
{
	public static boolean verifyResponseValue(String responseKey, String value, Response res) throws Throwable {
		Object obj = responseKey;
		JsonPath responseObject = new JsonPath(res.asString());
		String key =(String) responseObject.get(responseKey);
		return compareResponseValues(value,key, responseKey);
	}
	
	private static boolean compareResponseValues(String expected, String actual, String responseKey) {
		if (expected.equals(actual)) {
			Assert.assertEquals(actual, expected);
			return true;
		} else {
			Assert.assertEquals(actual, expected);
			return false;
		}
	}
	public static void main(String[] args) throws Throwable 
	{
			
			Response a1 = Request_submit.submitRequest("/api/users?page=2",null,"GET", "https://reqres.in/", "https://reqres.in/");
			System.out.println(a1.asString());
	}
}
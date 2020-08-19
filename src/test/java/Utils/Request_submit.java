package Utils;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class Request_submit 
{
	public static String REQUESTBODY;
	public static Response response;

	public static Response submitRequest(String endpoint ,String requestBodyPath, String requestType, String CONTENT_TYPE) throws Throwable {
		RestAssured.baseURI = Properties_extract.get_property_baseurl();
		RequestSpecification request = given();
		request.header("Content-Type", CONTENT_TYPE);
		if (requestBodyPath != null && !requestBodyPath.isEmpty() && requestType.equalsIgnoreCase("POST")) 
		{
			JSONParser jsonParser = new JSONParser();
			try (FileReader reader = new FileReader(requestBodyPath))
			{
				Object obj = jsonParser.parse(reader);
				REQUESTBODY = obj.toString();
			} catch (Exception exc)
			{
				exc.printStackTrace();
			}
			if (REQUESTBODY.length() > 0) 
			{
				request.body(REQUESTBODY);
				response = request.post(endpoint);
			}
		} else if (requestType.equalsIgnoreCase("GET")) 
		{
			response = request.get(endpoint);
		}else if(requestBodyPath != null && !requestBodyPath.isEmpty() && requestType.equalsIgnoreCase("PUT"))
		{
			response = request.put(endpoint);
		}
		return response;
	}
}

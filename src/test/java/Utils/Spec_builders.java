package Utils;
import java.io.IOException;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_builders
{
	private ResponseSpecification res;
	private RequestSpecification req;

	public RequestSpecification request_spec_builder(String type) throws IOException
	{
		switch (type.toUpperCase()) {
		case "JSON":
			RequestSpecBuilder req_build = new RequestSpecBuilder();
			req = req_build.setBaseUri(Properties_extract.get_property_baseurl()).setContentType(ContentType.JSON).build();
			break;
		case "XML":
			 req_build = new RequestSpecBuilder();
			req = req_build.setBaseUri(Properties_extract.get_property_baseurl()).setContentType(ContentType.XML).build();
			break;
		}
		return req;
	}
	
	public ResponseSpecification response_spec_builder(String content_type)
	{
			ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
			res = res_bui.expectContentType(content_type).build();
			return res;
	}
}

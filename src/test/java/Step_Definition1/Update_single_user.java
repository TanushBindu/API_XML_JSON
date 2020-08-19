package Step_Definition1;
import org.testng.Assert;

import Utils.Request_submit;
import Utils.Resuable_Validation_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
public class Update_single_user
{
	private Response res;

	@Given("^User pass the base url of reqres with Update single user API with PUT HTTP request$")
    public void user_pass_the_base_url_of_reqres_with_update_single_user_api_with_put_http_request() throws Throwable 
	{
		 res = Request_submit.submitRequest("/api/users/2","D:\\API_FRAMEWORK\\API_JSON_XML\\SingleData.json", "PUT", "application/json");
    }
}

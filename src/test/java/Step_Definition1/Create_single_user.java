package Step_Definition1;

import org.testng.Assert;

import Utils.Request_submit;
import Utils.Resuable_Validation_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class Create_single_user 
{
	private Response res;

	@Given("^User pass the base url of reqres with Create single user API with POST HTTP request$")
    public void user_pass_the_base_url_of_reqres_with_create_single_user_api_with_post_http_request() throws Throwable 
	{
		 res = Request_submit.submitRequest("/api/users","D:\\API_FRAMEWORK\\API_JSON_XML\\SingleData.json", "POST", "application/json");
    }

    @Then("^user should get 201 as status code$")
    public void user_should_get_201_as_status_code() throws Throwable 
    {
    	System.out.println(res.asString());
    	Assert.assertTrue(Resuable_Validation_methods.validate_status_code(201, res.getStatusCode()));
    }
}

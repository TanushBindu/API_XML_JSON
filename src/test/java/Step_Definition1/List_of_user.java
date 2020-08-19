package Step_Definition1;
import org.testng.Assert;
import Utils.Request_submit;
import Utils.Resuable_Validation_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
public class List_of_user
{
	 private Response res;
	@Given("^User pass the base url of reqres with List of user API with GET HTTP request$")
	    public void user_pass_the_base_url_of_reqres_with_list_of_user_api_with_get_http_request() throws Throwable 
	 {
		 res = Request_submit.submitRequest("/api/users?page=2",null, "GET","https://reqres.in/");
	 }

	    @Then("^user should get 200 as status code$")
	    public void user_should_get_200_as_status_code() throws Throwable 
	    {
	    	System.out.println(res.asString());
	    	Assert.assertTrue(Resuable_Validation_methods.validate_status_code(200, res.getStatusCode()));
	    }

}

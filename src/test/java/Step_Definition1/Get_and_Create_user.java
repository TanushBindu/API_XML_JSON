package Step_Definition1;

import java.util.Iterator;

import org.testng.Assert;

import Utils.Request_submit;
import Utils.Resuable_Validation_methods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojo.Data;
import pojo.List_of_User;

public class Get_and_Create_user 
{	
	    private Response res;
		private List_of_User list_of_user;
		private String first_name;

		@Given("^User pass the base url of reqres with List of user API with GET HTTP request$")
	    public void user_pass_the_base_url_of_reqres_with_list_of_user_api_with_get_http_request() throws Throwable 
	    {
	    	res = Request_submit.submitRequest("/api/users?page=2","D:\\API_FRAMEWORK\\API_JSON_XML\\SingleData.json", "POST","application/json");
	    }

	    @When("^user calls the Create user API with POST HTTP request$")
	    public void user_calls_the_create_user_api_with_post_http_request() throws Throwable 
	    {
	    	System.out.println(res.asString());
	    	Assert.assertTrue(Resuable_Validation_methods.validate_status_code(201, res.getStatusCode()));
	    	list_of_user = res.as(List_of_User.class);
	    }

	    @Then("^user extract the George from first_name$")
	    public void user_extract_the_george_from_firstname() throws Throwable 
	    {
	    	Iterator<Data> data = list_of_user.getData().iterator();
	    	while (data.hasNext())
	    	{	
	    		if (data.next().getFirst_name().equals("George"))
	    		{
	    			first_name = data.next().getFirst_name();
				}
			}
	    }

	    @Then("^user will pass the extracted value to the body$")
	    public void user_will_pass_the_extracted_value_to_the_body() throws Throwable 
	    {
	    	
	    }

	    @Then("^user should get the response body with the name as first_name$")
	    public void user_should_get_the_response_body_with_the_name_as_firstname() throws Throwable 
	    {
	    
	    }
}

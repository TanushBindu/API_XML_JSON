Feature: Performing GET for list of user

  Scenario: Validating the List of user API call
    Given User pass the base url of reqres with List of user API with GET HTTP request
      Then user extract the George from first_name
        When user calls the Create user API with POST HTTP request
          Then user will pass the extracted value to the body
            Then user should get the response body with the name as first_name
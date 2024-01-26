package com.zeeJava.stepDefin;

import java.util.List;

public class UserPageSteps {

    @Given("I am on the login page")
    public void givenIAmOnTheLoginPage() {
        // Implementation for navigating to the login page
    }

    @When("I login as a librarian")
    public void whenILoginAsLibrarian() {
        // Implementation for logging in as a librarian
    }

    @When("I click on {string} link")
    public void whenIClickOnLink(String linkText) {
        // Implementation for clicking on the specified link
    }

    @Then("table should have following column names:")
    public void thenTableShouldHaveFollowingColumnNames(List<String> expectedColumnNames) {
        // Implementation for verifying that the table has the expected column names
        // You may use your UI automation framework or interact with the actual web elements here
    }
}


}

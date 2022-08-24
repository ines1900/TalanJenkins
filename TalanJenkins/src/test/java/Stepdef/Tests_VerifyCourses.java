package Stepdef;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import PageObject.CheckingCoursesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tests_VerifyCourses extends Driver{
	CheckingCoursesPage checkResources;
	 @Given("old session link is displayed")
	    public void old_session_link_is_displayed() throws InterruptedException {
		 checkResources = new CheckingCoursesPage(driver);
	    	checkResources.checkdiplayoldsessions();
	    }


	    @When("user clicks on his old sessions link")
	    public void user_clicks_on_his_old_sessions_link() throws InterruptedException {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.clickoldsessions();
	    }

	    @And("user clicks on view the course")
	    public void user_clicks_on_view_the_course() throws InterruptedException {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.clickvoircours();
	    }
	    @And("user clicks on a module number")
	    public void user_clicks_on_a_module_number() throws InterruptedException {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.clickvoirmodule();
	    }

	    @And("user clicks on a course number")
	    public void user_clicks_on_a_course_number() throws InterruptedException {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.clickvoircoursnum();
	    }

	    @And("user clicks on resources")
	    public void user_clicks_on_resources() throws InterruptedException {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.clickvoirressources();
	    }

	    @Then("user get lessons title displayed")
	    public void user_get_lessons_title_displayed() {
	    	checkResources = new CheckingCoursesPage(driver);
	    	checkResources.checkreferences();
	    }
}

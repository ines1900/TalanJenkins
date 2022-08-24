package Stepdef;

import Driver.Driver;
import PageObject.UpdatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tests_update extends Driver {
	UpdatePage modifprofil;
	@Given("user is on his dashbord")
	public void user_is_on_his_dashbord() {
		modifprofil = new UpdatePage(driver);
		modifprofil.verifyprofil();
	}
    
    @When("user clicks on his profil")
    public void user_clicks_on_his_profil() throws InterruptedException {
		modifprofil = new UpdatePage(driver);
    	modifprofil.clickprofil();
    }

    @And("user delet his old data")
    public void user_delet_his_old_data() {
		modifprofil = new UpdatePage(driver);
    	modifprofil.deletolddata();
    }

    @And("^user enters his new data(.*) and (.*) and (.*) and (.*) and (.*)$")
    public void user_enters_his_new_data_name_and_familyname_and_birthday_and_mobilenumber_and_town(String name,String familyname,String birthday,String mobilenumber,String town) {
		modifprofil = new UpdatePage(driver);
    	modifprofil.inputnewdata(name, familyname, birthday, mobilenumber, town);
     
    }
    
    @And("^user clicks on submit")
    public void user_clicks_on_submit() {
		modifprofil = new UpdatePage(driver);
    	modifprofil.submit();
    }
    

    @Then("user get confirmation of his data modification")
    public void user_get_confirmation_of_his_data_modification() throws InterruptedException {
		modifprofil = new UpdatePage(driver);
    	modifprofil.verifymodifsubmit();
}
}
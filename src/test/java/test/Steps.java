package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	

@Given("^I am able to acces magento web page$")
public void i_am_able_to_acces_magento_web_page(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 
}

@Given("^I click on user icon$")
public void i_click_on_user_icon() {
    // Write code here that turns the phrase above into concrete actions

}

@When("^I input the username as \"([^\"]*)\"$")
public void i_input_the_username_as(String arg1) {
    // Write code here that turns the phrase above into concrete actions

}

@When("^I input the password as \"([^\"]*)\"$")
public void i_input_the_password_as(String arg1){
    // Write code here that turns the phrase above into concrete actions

}

@When("^I click on login button$")
public void i_click_on_login_button(){
    // Write code here that turns the phrase above into concrete actions

}

@Then("^I should see the magento ID as \"([^\"]*)\"$")
public void i_should_see_the_magento_ID_as(String arg1){
    // Write code here that turns the phrase above into concrete actions

}
	
	

}

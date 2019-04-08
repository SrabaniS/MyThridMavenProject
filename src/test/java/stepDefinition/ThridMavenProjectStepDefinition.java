package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThridMavenProjectStepDefinition {
    static WebDriver mydriver;
    @Given("^Open The Chrome Browers$")
    public void open_The_Chrome_Browers()  {
        System.setProperty("webdriver.chrome.driver","C:\\work_space\\MyThridMavenProject\\src\\chromedriver.exe");
        // Write code here that turns the phrase above into concrete actions
        mydriver = new ChromeDriver();

    }

    @When("^Enter Valid Booking\\.Com URL$")
    public void enter_Valid_Booking_Com_URL()  {
        // Write code here that turns the phrase above into concrete actions
mydriver.get("https://www.google.com/search?q=booking.com&oq=b&aqs=chrome.0.69i59j69i57j69i61j69i60l2j0.4617j0j8&sourceid=chrome&ie=UTF-8");
    }

    @Then("^Validate Booking\\.com Sites Opening Successsfuly$")
    public void validate_Booking_com_Sites_Opening_Successsfuly()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.getTitle();
        System.out.println(mydriver.getTitle());
        mydriver.quit();

    }


}

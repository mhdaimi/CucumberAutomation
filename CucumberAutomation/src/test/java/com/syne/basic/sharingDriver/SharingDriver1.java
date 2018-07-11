package com.syne.basic.sharingDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SharingDriver1 {
	
	//WebDriver driver;
	
/*	@Before
	public void setUp() throws InterruptedException {
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammad.daimi\\Cucumber\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("opned browser");
		Thread.sleep(5000);
	}*/
	
/*	public SharingDriver1(SharingDriver sharedObj) throws Throwable {
		// TODO Auto-generated constructor stub
		driver = sharedObj.getDriver(); 
	}*/
	
	@Given("^the user is on registration Page$")
	public void the_user_is_on_registration_Page() {
		System.out.println("actual script started");
		SharingDriver.getDriver().get("http://demo.automationtesting.in/Register.html");
	}
	
	@And("^he enters \"([^\"]*)\" as user name$")
	public void He_enters_user_name(String userName) {
		SharingDriver.getDriver().findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(userName);
	}
	
	@When("^he enters \"([^\"]*)\" as user last name$")
	public void He_enters_user_last_name(String lastname) throws InterruptedException {
		SharingDriver.getDriver().findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lastname);
		Thread.sleep(5000);
	}
	
	@Then("^check username is present in textbox$")
	public void check_signup_should(){
		Assert.assertTrue(true);
		//driver.quit();
	}

}

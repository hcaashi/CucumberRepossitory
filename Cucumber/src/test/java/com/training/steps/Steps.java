package com.training.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.*;

public class Steps {
	 WebDriver driver;
	
	@Given("User launch the salesforce application")
	public void user_launch_the_salesforce_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}
	@Then("user enter username")
	public void user_enter_username() {
		driver.findElement(By.id("username")).sendKeys("hc@tekarch.com");
	}
	@Then("user enter password")
	public void user_enter_password() {
		 driver.findElement(By.id("password")).sendKeys("Tekarch@2022");
	    
	}
	@Then("click on login button")
	public void click_on_login_button() {
		 driver.findElement(By.name("Login")).click();
	}
	
	@Then("click on Rememberme")
	public void click_on_rememberme() {
	   driver.findElement(By.id("rememberUn")).click();
	}


}

package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class BillingAddress extends BasePage {
	WebDriver driver;
//	public BillingAddress() {
//		// TODO Auto-generated constructor stub
//	}
	public BillingAddress(WebDriver driver,String firstName) {
		this.driver=driver;
		this.firstName(firstName);
		
	}

	private String firstName,lastName,companyName,country_region
	,streetAddressMain,town_city,state,zip,
	phone,email;
	public void firstName(String firstName) {
		driver.findElement(By.id("billing_first_name")).sendKeys("anil");
//		return null;
	}
	
}

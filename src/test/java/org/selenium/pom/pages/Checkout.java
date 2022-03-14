package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	WebDriver driver;
	public Checkout(String firstName) {
//		this.driver=driver;
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

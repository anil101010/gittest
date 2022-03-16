package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class CheckoutPage extends BasePage{
CheckoutPage(WebDriver driver){
	super(driver);
}
public CheckoutPage enterFirstName() {
	driver.findElement(By.id("billing_first_name")).clear();
driver.findElement(By.id("billing_first_name")).sendKeys("anil");
return this;
}
public CheckoutPage enterLastName() {
	driver.findElement(By.id("billing_last_name")).clear();
driver.findElement(By.id("billing_last_name")).sendKeys("anil");
return this;
}
public CheckoutPage enterAddressLineOne() {
	driver.findElement(By.id("billing_address_1")).clear();
driver.findElement(By.id("billing_address_1")).sendKeys("anil");
return this;
}
public CheckoutPage enterCity() {
	driver.findElement(By.id("billing_city")).clear();
driver.findElement(By.id("billing_city")).sendKeys("anil");
return this;
}
public CheckoutPage enterPostalcode() {
	driver.findElement(By.id("billing_postcode")).clear();
driver.findElement(By.id("billing_postcode")).sendKeys("anil");
return this;
}
public CheckoutPage enterEmail() {
	driver.findElement(By.id("billing_email")).clear();
driver.findElement(By.id("billing_email")).sendKeys("anil");
return this;
}

}

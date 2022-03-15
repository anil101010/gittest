package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;
import org.testng.Assert;

public class StorePage extends BasePage {


public StorePage() {

}

public StorePage(WebDriver driver)
{
super(driver);
}
public void searchForItem() {
	driver.findElement(By.cssSelector("#woocommerce-product-search-field-0")).sendKeys("blue");
	driver.findElement(By.cssSelector("#woocommerce_product_search-1 > form > button")).click();
  	Assert.assertEquals(driver.findElement(By.xpath("//main[@id=\"main\"]/div/header/h1")).getText(),"Search results: “blue”");
}
}

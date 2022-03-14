package org.selenium.pom.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
WebDriver driver;
BasePage(){
	
}
public BasePage(WebDriver driver){
	this.driver=driver;
}
}

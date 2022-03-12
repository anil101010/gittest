package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTest {
@Test
void checkoutDBT() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://askomdch.com");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("#menu-item-1227 > a")).click();
	driver.findElement(By.cssSelector("#woocommerce-product-search-field-0")).sendKeys("blue");
	driver.findElement(By.cssSelector("#woocommerce_product_search-1 > form > button")).click();
  	Assert.assertEquals(driver.findElement(By.className("woocommerce-products-header__title page-title")).getText(),"Search results: “blue”");
driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.button.product_type_simple.add_to_cart_button.ajax_add_to_cart")).click();
driver.findElement(By.cssSelector("#main > div > ul > li.ast-col-sm-12.ast-article-post.astra-woo-hover-swap.product.type-product.post-1215.status-publish.first.instock.product_cat-men.product_cat-womens-shoes.has-post-thumbnail.featured.taxable.shipping-taxable.purchasable.product-type-simple > div.astra-shop-summary-wrap > a.added_to_cart.wc-forward")).click();
Assert.assertEquals(driver.findElement(By.xpath("//td/a[text()=\"Blue Shoes\"]")).getText(), "Blue Shoes"	);
driver.findElement(By.className("wc-proceed-to-checkout")).click();
}

}

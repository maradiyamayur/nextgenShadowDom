package com.common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FlipkartLogin extends FlipkartCommonTest {

	@Test
	public void loginButtonClick() {
		openBrowser("https://www.flipkart.com");
		System.out.println("Flipkart URL opened");
		driver.findElement(By.xpath("//*[@class='-dOa_b L_FVxe']")).click();
		System.out.println("Login button clicked");
	}

	@Test
	public void searchItemForMobiles() throws InterruptedException {
		openBrowser("https://www.flipkart.com");
		WebElement searchItems = driver.findElement(By.xpath("//INPUT[@class='Pke_EE']"));
		searchItems.sendKeys("iPhone 15 Pro Max");
		searchItems.submit();
		System.out.println("Searched iPhone text");

		driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 15 Pro Max (Black Titanium, 256 GB)')]"))
				.click();
		System.out.println("First link clicked");
		// scrollDown();
		switchTab();

		/*
		 * List<WebElement> dynamicElement =
		 * driver.findElements(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")); if
		 * (dynamicElement.size()!=0) {
		 * driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click
		 * (); System.out.println("Add to Cart button clicked"); } else {
		 * //driver.findElement(By.xpath("//button[@class='QqFHMw AMnSvF v6sqKe']")).
		 * click(); System.out.println("Notify Me button clicked"); }
		 */
		// driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+
		// In9uk2']")).click();

		if (driver.findElement(By.xpath("//button[@class='QqFHMw AMnSvF v6sqKe']")).isDisplayed()) {
			
			System.out.println("Case 1 - Notify Button check");
			String notifyButton = driver.findElement(By.xpath("//button[@class='QqFHMw AMnSvF v6sqKe']")).getText();
			
			if (notifyButton != null && notifyButton.equalsIgnoreCase("Notify Me")) {
				System.out.println("Notify Me button present");
				
				driver.findElement(By.xpath("//button[@class='QqFHMw AMnSvF v6sqKe']")).click();
				System.out.println("Notify Me button clicked");
				
				//WebDriverWait wait1 = new WebDriverWait(driver, 10);
				//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='YPxIKQ']")));	
				
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='YPxIKQ']")));
				button.click();
				
				//driver.findElement(By.xpath("//button[@class='YPxIKQ']")).click();
				System.out.println("Allow clicked on popup");
			}
			else {
				System.out.println("Case 2 - Add to Cart button check");
			}
		}

	}

	public void searchCloths() {

	}
}



//cmm-cookie-banner__content.hydrated.buttons-wrapper.button-group.button--accept-all

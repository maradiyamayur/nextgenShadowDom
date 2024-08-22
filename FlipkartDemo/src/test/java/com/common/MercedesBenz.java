package com.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MercedesBenz extends FlipkartCommonTest {
	@Test
	public void openURL() throws InterruptedException {
		openBrowser("https://www.mercedes-benz.com/en/");
		System.out.println("Mercedes-benz URL opened");
		Thread.sleep(10500);

		JavascriptExecutor acceptButton = (JavascriptExecutor) driver;
		WebElement acceptButtonClick = (WebElement) acceptButton.executeScript(
				"return document.querySelector('#page-63060b8ece > cmm-cookie-banner').shadowRoot.querySelector('div > div > div.cmm-cookie-banner__content > cmm-buttons-wrapper > div > div.button-group > wb7-button.button.button--accept-all.wb-button.hydrated')");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", acceptButtonClick);
		System.out.println("Accept All");
		
		JavascriptExecutor vehicles = (JavascriptExecutor) driver;
		WebElement vehiclesMenuClick = (WebElement) vehicles.executeScript(
				"return document.querySelector(\"#page-63060b8ece > div.header > brandhub-header > div:nth-child(2) > div > brandhub-main-navigation > div:nth-child(6) > brandhub-main-navigation-item\").shadowRoot.querySelector(\"button\")");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", vehiclesMenuClick);
		System.out.println("Vehicles menu clicked");
		
		Thread.sleep(3000);
		
		JavascriptExecutor gelandewagen = (JavascriptExecutor) driver;
		WebElement gelandewagenClick = (WebElement) gelandewagen.executeScript(
				"return document.querySelector('body.page.basicpage.brandhub-theme-default > div.header > brandhub-header').shadowRoot.querySelector('div > div.brandhub-header-flyout.brandhub-header-flyout--in > div.brandhub-header-flyout__container > div > div > div.headerflyoutimageitem > brandhub-header-flyout-image-item').shadowRoot.querySelector('a > div > picture > img.brandhub-picture.brandhub-picture--cover')");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gelandewagenClick);
		System.out.println("Gelandewagen Mercedes pic clicked");
		
		Thread.sleep(3000);
		
		JavascriptExecutor gelandewagenDetailPage = (JavascriptExecutor) driver;
		WebElement gelandewagenDetailPageClick = (WebElement) gelandewagenDetailPage.executeScript(
				"return document.querySelector('body.page.basicpage.brandhub-theme-default > div.imagejumper > brandhub-image-jumper').shadowRoot.querySelector('div.brandhub-image-jumper.brandhub-image-jumper--text-inverted.brandhub-image-jumper--three-buttons > div.brandhub-image-jumper__wrapper > div.brandhub-image-jumper__overlay > div.brandhub-image-jumper__container > div.brandhub-image-jumper__buttons.brandhub-image-jumper__buttons--visible > ul.brandhub-image-jumper__buttons-list > li.brandhub-image-jumper__buttons-list-item.brandhub-image-jumper__buttons-list-item--active > a.brandhub-image-jumper__button-link.brandhub-image-jumper__button-link--active')");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gelandewagenDetailPageClick);
		System.out.println("Gelandewagen Mercedes Detail Page clicked");
		
		switchTab();
		
		JavascriptExecutor configureG580 = (JavascriptExecutor) driver;
		WebElement configureG580Clicked = (WebElement) configureG580.executeScript(
				"return document.querySelector('body.generic-template > cmm-cookie-banner').shadowRoot.querySelector('div.cmm-cookie-banner.cmm-cookie-banner--B > div.cmm-cookie-banner__wrapper.visible > div.cmm-cookie-banner__content > cmm-buttons-wrapper > div.buttons-wrapper > div.button-group > wb7-button.button.button--accept-all.wb-button.hydrated')");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", configureG580Clicked);
		System.out.println("Configure G 580 link clicked");
		
		
		
	}
	
}


//('body.generic-template > cmm-cookie-banner').shadowRoot.querySelector('div.cmm-cookie-banner.cmm-cookie-banner--B > div.cmm-cookie-banner__wrapper.visible > div.cmm-cookie-banner__content > cmm-buttons-wrapper > div.buttons-wrapper > div.button-group > wb7-button.button.button--accept-all.wb-button.hydrated')

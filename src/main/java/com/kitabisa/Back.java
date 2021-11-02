package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Back {
	
	public WebDriver driver;
	
	private By clickKembaliKePenggalangan = By.xpath("//*[@id=\"summary-page\"]/header/div/button");
	private By clickBackArrowOntheCampaign = By.xpath("//*[@id=\"plain-header\"]");
	
	public Back(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickKembaliKePenggalangan() {
		try {
			Thread.sleep(7000);
			driver.findElement(clickKembaliKePenggalangan).click();				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickBackArrowOnTheCampaign() {
		try {
			Thread.sleep(7000);
			WebElement click = driver.findElement(clickBackArrowOntheCampaign);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", click);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

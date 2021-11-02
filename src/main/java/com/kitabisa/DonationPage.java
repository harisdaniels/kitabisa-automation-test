package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DonationPage {
	
	public WebDriver driver;
	
	private By selectDonation = By.xpath("//*[@id=\"donation-amount\"]/div[2]");
	
	public DonationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectDonation() {
		try {
			Thread.sleep(3000);
			driver.findElement(selectDonation).click();			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

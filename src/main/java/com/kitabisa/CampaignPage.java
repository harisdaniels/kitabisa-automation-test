package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CampaignPage {
	
	public WebDriver driver;
	
	private By donasiSekarang = By.id("campaign-detail_button_donasi-sekarang");
	
	public CampaignPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickDonasiSekarang() {
		try {
			Thread.sleep(3000);
			driver.findElement(donasiSekarang).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	
	private By selectCampaign = By.xpath("//*[@id=\"template_horizontal-wide-card-slider\"]/div/div/a[1]");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectCampaign() {
		try {
			Thread.sleep(3000);
			driver.findElement(selectCampaign).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

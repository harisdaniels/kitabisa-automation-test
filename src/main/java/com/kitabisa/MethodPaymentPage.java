package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MethodPaymentPage {
	
	public WebDriver driver;
	
	private By selectPaymentMethod = By.xpath("//*[@id=\"__next\"]/main/main/div[6]/div[4]");
	
	public MethodPaymentPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectPaymentMethod() {
		try {
			Thread.sleep(3000);
			driver.findElement(selectPaymentMethod).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

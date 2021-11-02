package com.kitabisa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputNameAndEmail {
	
	public WebDriver driver;
	
	private By inputName = By.xpath("//*[@id=\"contribute-page\"]/form[2]/div[3]/div[2]/input");
	private By inputEmail = By.xpath("//*[@id=\"contribute-page\"]/form[2]/div[3]/div[3]/input");
	private By clickLanjutkanPembayaran = By.xpath("//*[@id=\"contribute_button_lanjutkan-pembayaran\"]");
	
	public InputNameAndEmail(WebDriver driver) {
		this.driver = driver;
	}
	
	public void inputName(String name) {
		try {
			Thread.sleep(3000);
			driver.findElement(inputName).sendKeys(name);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inputEmail(String email) {
		try {
			Thread.sleep(3000);
			driver.findElement(inputEmail).sendKeys(email);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void clickLanjutkanPembayaran() {
		try {
			Thread.sleep(3000);
			driver.findElement(clickLanjutkanPembayaran).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package com.kitabisa;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.screenrecord.ScreenRecord;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	
	WebDriver driver;
	HomePage home;
	
	@BeforeAll
	public void setUp() {
		try {
			ScreenRecord.startRecording("Test started");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://kitabisa.com/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			home = new HomePage(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterAll
	public void tearDown() {
		try {
			Thread.sleep(3000);
			driver.close();
			driver.quit();
			System.out.println("Success!");
			ScreenRecord.stopRecording();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

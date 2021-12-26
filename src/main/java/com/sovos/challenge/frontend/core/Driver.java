package com.sovos.challenge.frontend.core;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Driver {

	private static WebDriver driver;

	public Driver() {

	}

	public static WebDriver getDriver() {

		//set up for macbook
		System.setProperty("webdriver.chrome.driver", "/opt/homebrew/bin/chromedriver");

		if (driver == null) {
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return driver;

	}

	public static WebDriver encerraDriver() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

}

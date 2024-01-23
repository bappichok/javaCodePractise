package com.javaCode.UiAutomation;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.devtools.v117.input.model.TimeSinceEpoch;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WdExaample {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		 driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		driver.getTitle();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("")));
		
		JavascriptExecutor jsexe = (JavascriptExecutor)driver;
		
		
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);;
		
	
		Set<String> windowHandels = driver.getWindowHandles();
		driver.getWindowHandle();
		
		By userNameLocator =By.id("username");
		
		
		

	}
	
	
	
}

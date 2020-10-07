package com.versapay.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.versapay.qa.base.TestBase;

public class LoginPage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="identifierId")
	WebElement emailID;
	
	@FindBy(id="identifierNext")
	WebElement nextButton;
	
	@FindBy(name="password")
	WebElement passwordField;
	
	@FindBy(id="passwordNext")
	WebElement passwordNextButton;
	
	@FindBy(xpath="//h1[@class='x7WrMb']")
	WebElement versaPayHeading;
	
	
	public String loginMethod()
	{
		emailID.sendKeys(prop.getProperty("userName"));
		nextButton.click();
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.sendKeys(prop.getProperty("password"));
		passwordNextButton.click();
		wait.until(ExpectedConditions.visibilityOf(versaPayHeading));
		return versaPayHeading.getText();
		
	}
	
}

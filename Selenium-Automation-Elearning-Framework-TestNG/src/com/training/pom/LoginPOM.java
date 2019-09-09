package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	//username
	@FindBy(id="input-username")
	private WebElement Username; 
	
	//password
	@FindBy(id="input-password")
	private WebElement Password;
	
	//Login button
	@FindBy(xpath ="//*[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	//log out button
	@FindBy(xpath ="//*[@id='header']/ul/li[4]/a/span")
	private WebElement logout;
	
	public void sendUserName(String Username) {
		this.Username.clear();
		this.Username.sendKeys(Username);
	}
	
	public void sendPassword(String Password) {
		this.Password.clear(); 
		this.Password.sendKeys(Password); 
	} 
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void logout() {
		this.logout.click(); 
	}

	
}


	
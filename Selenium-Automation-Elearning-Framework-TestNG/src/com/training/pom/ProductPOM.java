package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPOM {
	private WebDriver driver; 
public ProductPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='input-name']")
	private WebElement Product_Name;
	
	@FindBy(xpath ="//*[@id='button-filter']")
	private WebElement Filter;
	
	@FindBy(xpath ="//*[@id='input-price']")
	private WebElement Price;
	
	@FindBy(xpath ="//*[@id='form-product']/div/table/tbody/tr[10]/td[1]/input")
	private WebElement Earrings;
	
	@FindBy(xpath ="//*[@id='menu-catalog']/ul/li[2]/a")
	private WebElement Product;
	
	//Delete
	@FindBy(xpath ="//*[@id='content']/div[1]/div/div/button[2]")
	private WebElement Delete;
	
	//edit icon
	@FindBy(xpath ="//*[@id='form-product']/div/table/tbody/tr[1]/td[8]/a/i")
	private WebElement Edit_icon;
	
	//data link
	@FindBy(xpath ="//*[@id='form-product']/ul/li[2]/a")
	private WebElement data;
	
	//clear quantity data
	@FindBy(xpath ="//*[@id='input-quantity' and @name='quantity']")
	private WebElement clear;
	
	//click on save
	@FindBy(xpath ="//*[@id='content']/div[1]/div/div/button/i")
	private WebElement save;
	
	//click on fingerring
	@FindBy(xpath ="//*[@id='form-product']/div/table/tbody/tr[11]/td[1]/input")
	private WebElement Fingerring;
	
	
	public void Fingerring() {
		this.Fingerring.click();
		String content =driver.findElement(By.xpath("//*[@id='form-product']/div/table/tbody/tr[11]/td[3]")).getText();
		//System.out.println("clicked on " + content);
		if ( content.equals("Finger Ring")){
				System.out.println("checked Finger ring");
				
		}
		else{
			Assert.fail();
		}
	}
	
	
	public void clear()  {
		this.clear.clear();
		this.clear.sendKeys("45");	
	}

	public void save() {
		this.save.click();
	}
	public void data() {
		this.data.click();
	}
	
	public void Edit_icon() {
		this.Edit_icon.click();
	}
	public void Product() {
		this.Product.click();
	}
	public void Delete() {
		this.Delete.click();
	}
	
	public void Earrings() {
		this.Earrings.click();
		String content =driver.findElement(By.xpath("//*[@id='form-product']/div/table/tbody/tr[10]/td[3]")).getText();
		System.out.println("clicked on " + content);
		if ( content.equals("Ear Rings")){
			System.out.println("checked Ear Rings");
				
		}
		else{
			Assert.fail();
		}
	}
	
	public void Product_Name() {
		this.Product_Name.sendKeys("Integer vitae iaculis massa");
	}
	
	public void Filter() {
		this.Filter.sendKeys("Integer vitae iaculis massa");
	}
	public void Price() {
		this.Price.sendKeys("515");
	}
	
	public void Model_Display() {
		 boolean Model = driver.findElement(By.xpath(" //*[@id='form-product']/div/table/tbody/tr[1]/td[3]")).isDisplayed();
         System.out.println("Integer vitae iaculis massa is displayed :" + Model);
         
	}
	
	public void Model_Display_Price() {
		boolean Model_Final = driver.findElement(By.xpath(" //*[@id='form-product']/div/table/tbody/tr[1]/td[3]")).isDisplayed();
        System.out.println("Integer vitae iaculis massa with price is filtered :" + Model_Final);
	}
	
	public void Accept_Alert() {
		
		Alert alert= driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.accept();
		
	}
	
	public void Success_Content() {
			
	String content =driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).getText();
	System.out.println("The success message : "+ content);
			if (driver.findElement(By.xpath("//*[@id='content']/div[2]/div[1]")).isDisplayed()){
				System.out.println("Success: You have modified categories");
				}
				else
				{
	Assert.fail();
				}
		}	


}

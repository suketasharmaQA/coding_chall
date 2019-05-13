package com.application.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath ="//input[@class='desktop-searchBar']")
private WebElement searchBar;

@FindBy(xpath="//a[@class='desktop-submit']")
private WebElement search_action_button;

@FindBy(xpath="//img[(contains(@title, \'Bedsheet\'))]")
private List<WebElement> prod_select;


public void search_product()
{
	System.out.println("******************"+ driver);
	searchBar.sendKeys("Bedsheet");
	search_action_button.click();
	
	for(WebElement item : prod_select)
	{
		item.click();
	}
	
	
}

}

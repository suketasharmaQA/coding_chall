package com.application.tests;

import org.testng.annotations.Test;

import com.application.pages.HomePage;

public class HomePageTest 
{

@Test
public void search_product()
{
	
	HomePage homepg = new HomePage(BaseClassTest.driver);
	homepg.search_product();
	
}
	
	
	
	
}

package saucedemo;

import org.openqa.selenium.WebDriver;


public class Case7_CheckOut1 {
	
	WebDriver driver;

	public Case7_CheckOut1(WebDriver driver) {
		this.driver = driver;
	}

	public void CheckOutOrder1() {
		ItemList_CheckOutProcess items = new ItemList_CheckOutProcess(driver);
		items.ProdCart();
		items.ProdCheckOut();
		items.First_Name("Akshay");
		items.Last_Name("Saraf");
		items.Pin_Code("412308");
		items.Order_Continue();
		String Total = items.Prod_Total();
		System.out.println(Total);
		items.Finish_Order();
		items.BacktoHomePage();
		
	}
}
	
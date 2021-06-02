package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.loginpage;
import autodemo.base.BaseTest;

public class createproducttest extends BaseTest{
	
	
	@Test
	public void createproduct() throws InterruptedException {
		
		cp.addproduct();
		cp.saveelements();
		cp.epd();
	}

}

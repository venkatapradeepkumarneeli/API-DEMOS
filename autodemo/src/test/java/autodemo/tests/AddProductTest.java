package autodemo.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.base.BaseTest;
import autodemo.pages.AddProduct;
import autodemo.pages.loginpage;

public class AddProductTest extends BaseTest{
	
	
	
	@Test
	public void addproduct() {
		ap.createproduct();
	}

}

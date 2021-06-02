package autodemo.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.base.BaseTest;
import autodemo.pages.CreateProduct;
import autodemo.pages.loginpage;

public class loginpagetest extends BaseTest{
	
	@Test
	public void login() throws InterruptedException {
		lp.addproduct();
	}

}

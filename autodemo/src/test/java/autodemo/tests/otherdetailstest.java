package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.base.BaseTest;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.EngageProductDetails;
import autodemo.pages.OtherDetails;
import autodemo.pages.loginpage;

public class otherdetailstest extends BaseTest{

	loginpage lp;
	AddProduct ap;
	CreateProduct cp;
	EngageProductDetails epd;

	@Test
	public void cancel() {
		
		od.ap();
	}



}

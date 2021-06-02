package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.base.BaseTest;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.EngageProductDetails;
import autodemo.pages.loginpage;

public class engageproductdetailstest extends BaseTest{
	
	
	
	@Test
	public void engageproductdetails() {
		
		edp.fillDetails();
		edp.od();
	}

}

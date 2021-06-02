package autodemo.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.base.BaseTest;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.EngageProductDetails;
import autodemo.pages.OtherDetails;
import autodemo.pages.ProductDetails;
import autodemo.pages.loginpage;

public class productdetailstest extends BaseTest{
	
	
	
	
	@Test
	public void productdetails() throws InterruptedException {
//		od.pd();
		
		pd.Searchproduct();
		pd.ap();
	}

}

package autodemo.base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import autodemo.pages.*;

public class BaseTest extends Base{
	
	
	
	 public loginpage lp;
	 public loginpage getLp() {
		return lp;
	}
	public void setLp(loginpage lp) {
		this.lp = lp;
	}
	public AddProduct getAp() {
		return ap;
	}
	public void setAp(AddProduct ap) {
		this.ap = ap;
	}
	public CompareArrays getCa() {
		return ca;
	}
	public void setCa(CompareArrays ca) {
		this.ca = ca;
	}
	public EngageProductDetails getEdp() {
		return edp;
	}
	public void setEdp(EngageProductDetails edp) {
		this.edp = edp;
	}
	public OtherDetails getOd() {
		return od;
	}
	public void setOd(OtherDetails od) {
		this.od = od;
	}
	public ProductDetails getPd() {
		return pd;
	}
	public void setPd(ProductDetails pd) {
		this.pd = pd;
	}
	public CreateProduct getCp() {
		return cp;
	}
	public void setCp(CreateProduct cp) {
		this.cp = cp;
	}


	public AddProduct ap;
	 public CompareArrays ca;
	 public EngageProductDetails edp;
	 public OtherDetails od;
	 public ProductDetails pd;
	 public CreateProduct cp;
	 
	 @BeforeTest
		public void setUp() {
			initialization();
			lp = new loginpage();
			ap = new AddProduct();
			ca = new CompareArrays();
			edp = new EngageProductDetails();
			od = new OtherDetails();
			pd = new ProductDetails();
			cp = new CreateProduct();
		}

}

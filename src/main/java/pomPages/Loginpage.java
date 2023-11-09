package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	//Declaration
	
	@FindBy(xpath="//h3[text()='Login']")
	private WebElement pageHeader;
	
	@FindBy(id="email")
	private WebElement eamilTF;
	
	@FindBy(id="password")
	private WebElement passwordtf;
	
	//Intilization
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//Utilization
	
	public String getPageHeader() {
		
		return pageHeader.getText();
	}
		
		public void setmail(String Email) {}
	}


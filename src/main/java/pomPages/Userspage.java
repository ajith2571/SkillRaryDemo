package pomPages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userspage {

//Declaration
	
	@FindBy(xpath="//h1[normalize-space(text())='Users']")
	private WebElement pageHeader;
	@FindBy(xpath="//a(text())='New']")
	private WebElement plusNewButton;
	
	@FindBy(xpath="//ul[@class='pagination']/li[last()-1]/a")
	private WebElement usersListpage;
	
	@FindBy(xpath="//h1[normalize-space(text())='Users']")
	private WebElement lastuser;
	
	
	//Initilization
	public UsersPage(WebDriver,driver) {
		
		PageFactory.initElements(driver,this);
		
	
	}
	
	//Utilization
	Public 
}
	
	
	
	
	
	
	
	
}

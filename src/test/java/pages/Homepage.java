package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Manage Product']")
	WebElement manageProductBtn;
	
	public void HomePage(WebDriver baseDriver) {
		driver = baseDriver;
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
	}
	
	public void selectCategory(String category) {
		String xpath = "//a[text()=\"" + category + "\"]";
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void selectManageProduct() {
		manageProductBtn.click();
	}
}

package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.When;

public class Adminpage {
	
	WebDriver driver = hooks.driver;
	
	
	//After lunching website and click on login link
	
	@When("i clcik on login link")
	public void i_clcik_on_login_link() throws InterruptedException {
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(5000);	}

	@When("i enter the correct username and password")
	public void i_enter_the_correct_username_and_password() throws InterruptedException {
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("vk@gmail.com");

		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password1.sendKeys("admin");
	}

	@When("i clcik on login Button")
	public void i_clcik_on_login_Button() {
		WebElement login1 = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		login1.click();
	}

	@When("i click on manage product")
	public void i_click_on_manage_product() throws InterruptedException {
		Thread.sleep(3000);
		WebElement manageproduct = driver.findElement(By.linkText("Manage Product"));
		manageproduct.click();
	}

	@When("in product management page i enter Name and Brand name and Discription and Unit price and Quantity")
	public void in_product_management_page_i_enter_Name_and_Brand_name_and_Discription_and_Unit_price_and_Quantity() {
		
		WebElement productname = driver.findElement(By.xpath("//input[@placeholder=\"Product Name\"]"));
		productname.sendKeys("welcome");

		WebElement brandname = driver.findElement(By.xpath("//input[@placeholder=\"Brand Name\"]"));
			brandname.sendKeys("ajiagdc");

		WebElement descriptionofproduct = driver.findElement(By.xpath("//textarea[@placeholder=\"Enter your description here!\"]"));
		descriptionofproduct.sendKeys("good for health and hair");
		
		
		WebElement unitprice = driver.findElement(By.xpath("//input[@placeholder=\"Enter Unit Price\"]"));
		unitprice.sendKeys("0.54");
		
		WebElement qunitty = driver.findElement(By.xpath("//input[@placeholder=\"Enter Quantity\"]"));
		qunitty.sendKeys("50");
	}

	@When("i upload file regards product")
	public void i_upload_file_regards_product() throws InterruptedException {
		WebElement selectfile = driver.findElement(By.xpath("//input[@name=\"file\"]"));
		selectfile.sendKeys("C:\\Users\\Dell\\Desktop\\text.txt");
		Thread.sleep(5000);
	}

	@When("i click on add new Category")
	public void i_click_on_add_new_Category() throws InterruptedException {
		WebElement addnewcat = driver.findElement(By.xpath("//button[@data-target=\"#myCategoryModal\"]"));
		addnewcat.click();
		Thread.sleep(5000);
	}
	@When("i enter new productname and Discription  and i will save the product Category")
	public void i_enter_new_productname_and_Discription_and_i_will_save_the_product_Category() throws InterruptedException {
		Thread.sleep(5000);
		WebElement catname = driver.findElement(By.xpath("//input[@placeholder=\"Category Name\"]"));
		catname.sendKeys("come to home");
	
		
		WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Enter category description here!']"));
		description.sendKeys("come to home znfksdhvivb kjdanfvoiw");
		Thread.sleep(5000);
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {

		WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"categoryForm\"]/div[3]/div/input"));
		saveButton.click();
		Thread.sleep(5000);
	}

		@When("i clcik on ViewProduct to recheck the new category")
	public void i_clcik_on_ViewProduct_to_recheck_the_new_category() {
		WebElement viewsaveproduct = driver.findElement(By.xpath("//li[@id=\"listProducts\"]"));
		viewsaveproduct.click();
	}
}
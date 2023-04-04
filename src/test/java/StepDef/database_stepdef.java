package StepDef;

import java.sql.SQLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class database_stepdef {
	
	
	
	WebDriver driver = hooks.driver;
	String categoryName = "";
	String categoryDescription = "";
	
	
		
	@Given("I login as an admin")
	public void i_login_as_an_admin() throws InterruptedException {
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		Thread.sleep(5000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("vk@gmail.com");

		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password1.sendKeys("admin");	
		
		WebElement login1 = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		login1.click();
		
	}

	@When("I click on Manage Product i will land product manage page")
	public void i_click_on_Manage_Product_i_will_land_product_manage_page() throws InterruptedException {
	
		Thread.sleep(3000);
		WebElement manageproduct = driver.findElement(By.linkText("Manage Product"));
		manageproduct.click();
		Thread.sleep(5000);
	}

		@Then("I click on Add New Category button")
	public void i_click_on_Add_New_Category_button() throws InterruptedException {
			WebElement addnewcat = driver.findElement(By.xpath("//button[@data-target=\"#myCategoryModal\"]"));
			addnewcat.click();
			Thread.sleep(5000);
			
	}

		@Then("I enter Name")
		public void i_enter_Name() {
			WebElement catname = driver.findElement(By.xpath("//input[@placeholder=\"Category Name\"]"));
			catname.sendKeys("solution");}

		@Then("I enter Description")
		public void i_enter_Description() throws InterruptedException {
			WebElement description = driver.findElement(By.xpath("//textarea[@placeholder='Enter category description here!']"));
			description.sendKeys("solution for testing database product");
			Thread.sleep(5000);
		}

	@Then("I click Save button")
	public void i_click_Save_button() throws InterruptedException {
		WebElement saveButton = driver.findElement(By.xpath("//*[@id=\"categoryForm\"]/div[3]/div/input"));
		saveButton.click();
		Thread.sleep(5000);
	}

	@Then("I verify the new category is added to the database")
	public void i_verify_the_new_category_is_added_to_the_database() throws ClassNotFoundException, SQLException {
		DBUtils dbutils = new DBUtils();
		String catDesc = dbutils.getCategoryDescription(categoryName);
		Assert.assertEquals(catDesc, categoryDescription);
	}
}

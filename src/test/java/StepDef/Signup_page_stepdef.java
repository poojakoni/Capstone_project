package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.en.Given;

public class Signup_page_stepdef {
	WebDriver driver = hooks.driver;
	FluentWait<WebDriver> wait;

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		driver.get("http://localhost:8080/medicare/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

	}

	@Given("i clcik on sign up link")
	public void i_clcik_on_sign_up_link() {

		// Click on sign up link
		WebElement singup = driver.findElement(By.xpath("//li[@id=\"signup\"]"));
		singup.click();

	}

	@Given("i enter the firstname and lastname and email and contactno and password and confirm passowrd  and select role as user in radio button")
	public void i_enter_the_firstname_and_lastname_and_email_and_contactno_and_password_and_confirm_passowrd_and_select_role_as_user_in_radio_button() {
		
		// giving details about username
		WebElement firstname = driver.findElement(By.xpath("//input[@id=\"firstName\"]"));
		firstname.sendKeys("akk");
		
		// giving last name of user
		WebElement lastname = driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
		lastname.sendKeys("ll");
		
		// giving the email
		WebElement emaliid = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		emaliid.sendKeys("sdfcing@gmail.com");
		
		// giving the contact no
		WebElement cno = driver.findElement(By.xpath("//input[@id=\"contactNumber\"]"));
		cno.sendKeys("9876543345");
		
		// giving the password
		WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password.sendKeys("123456");
		
		// giving the confirm password
		WebElement conpassword = driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]"));
		conpassword.sendKeys("123456");
		
		// Click on radio button
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id=\"role1\"]"));
		radiobutton.click();
	}


	@Given("i clcik on next-billing Button")
	public void i_clcik_on_next_billing_Button() throws InterruptedException {
		
		WebElement singupnextpage = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
		singupnextpage.click();
		Thread.sleep(5000);

	}

	@Given("i enter the addresslineone and addresslinetwo  and city  and postal code  and state as  and country as")
	public void i_enter_the_addresslineone_and_addresslinetwo_and_city_and_postal_code_and_state_as_and_country_as() {
		
		WebElement addresslineone = driver.findElement(By.cssSelector("input#addressLineOne"));
		addresslineone.sendKeys("xyzz");
		
		WebElement addresslintwo = driver.findElement(By.cssSelector("input#addressLineTwo"));
		addresslintwo.sendKeys("sfsdg");
		
		WebElement city = driver.findElement(By.cssSelector("input#city"));
		city.sendKeys("drf");
		
		
		WebElement postalcode = driver.findElement(By.cssSelector("input#postalCode"));
		postalcode.sendKeys("123456");
		
		WebElement state = driver.findElement(By.cssSelector("input#state"));
		state.sendKeys("zczdfsf");

		WebElement contry = driver.findElement(By.cssSelector("input#country"));
		contry.sendKeys("india");
		}
	

	@Given("i click on next-confirm button")
	public void i_click_on_next_confirm_button() {
		WebElement nextandconfirm = driver.findElement(By.xpath(" //button[@name='_eventId_confirm']"));
		nextandconfirm.click();
	}

	@Given("i click on confirm button")
	public void i_click_on_confirm_button() throws InterruptedException {
		
		Thread.sleep(3000);
		WebElement confirm = driver.findElement(By.linkText("Confirm"));
		confirm.click();

	}

	@Given("i click on Login Here button")
	public void i_click_on_Login_Here_button() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement login = driver.findElement(By.linkText("Login Here"));
		login.click();

	}

	@Given("I enter the username and password as")
	public void i_enter_the_username_and_password_as() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		username.sendKeys("kn@gmail.com");
		
		WebElement password1 = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		password1.sendKeys("12345");

	}

	@Given("i clcik on Login Button")
	public void i_clcik_on_Login_Button() {
		WebElement login1 = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		login1.click();

	}

	@Given("I select product and clcik on view product")
	public void i_select_product_and_clcik_on_view_product() {
		WebElement view = driver.findElement(By.xpath("//a[@ng-href=\"/medicare/show/1/product\"]")); //view product
		view.click(); 
	}

	@Given("i clcik on addcart Button")
	public void i_clcik_on_addcart_Button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement addcart = driver.findElement(By.xpath("//*[text()=\" Add to Cart\"]"));
		addcart.click(); //add cart

	}

	@Given("i clcik on checkout Button")
	public void i_clcik_on_checkout_Button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement checkout = driver.findElement(By.xpath("//a[@href=\"/medicare/cart/validate\"]"));
		checkout.click(); 

	}

	@Given("I clcik on saved address detilas")
	public void i_clcik_on_saved_address_detilas() throws InterruptedException {
		Thread.sleep(3000);
		WebElement select = driver.findElement(By.xpath("//*[text()=\"Select\"]"));
		select.click();

	}

	@Given("i enter card no  and expmonth and expyear and cvv")
	public void i_enter_card_no_and_expmonth_and_expyear_and_cvv() {
		
		WebElement cardno = driver.findElement(By.xpath("//input[@id=\"cardNumber\"]"));
		cardno.sendKeys("1234567890");
		
		WebElement expmonth = driver.findElement(By.xpath("//input[@id=\"expityMonth\"]"));
		expmonth.sendKeys("jan");
		
		WebElement expyear = driver.findElement(By.xpath("//input[@id=\"expityYear\"]"));
		expyear.sendKeys("2025");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@id=\"cvCode\"]"));
		cvv.sendKeys("123");

	}

	@Given("i clcik on pay Button")
	public void i_clcik_on_pay_Button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement pAY = driver.findElement(By.xpath("//*[text()='Pay']"));
		pAY.click();

	}

}

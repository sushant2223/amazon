package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepdefination {
	WebDriver driver;
	

@Given("user is on login page")
public void user_is_on_login_page() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://ui.cogmento.com/");
	
   
}
@When("user enter valid username")
public void user_enter_valid_username() {
	driver.findElement(By.xpath("//*[@name='email']")).sendKeys("prafulp1010@gmail.com");
	
   
}
@When("user enter valid password")
public void user_enter_valid_password() {
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Pr@ful0812");
	driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']")).click();
}
@Then("user is on Home page")
public void user_is_on_home_page() {
	   String actualtitle=driver.getTitle(); 		   
	  System.out.println(actualtitle);
	
   
}
@Then("user is on contact page")
public void user_is_on_contact_page() {
	driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
@Then("user click on create button")
public void user_click_on_create_button() {
	driver.findElement(By.xpath("//a[@href='/contacts/new']")).click(); 	  
	driver.findElement(By.name("first_name")).sendKeys("amit"); 
	
	
	
   
}
@Then("user enter last name")
public void user_enter_last_name() {
	driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("patil");
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	driver.close();
    
}
	
	
	

}

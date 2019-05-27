package CucumberTest.CucumberFramework;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stepDefination
{
	public WebDriver driver;
	WebDriverWait wait1=null;
	
	@Given("^Url opened$")
	public void Url_opened() throws Exception
	{
	   	System.setProperty("webdriver.chrome.driver","C:/Users/ankur.dixit/Desktop/DriversList/chromedriver.exe");	 
		driver = new ChromeDriver();
	    driver.manage().window().maximize();	    	  
	    driver.get("http://newtours.demoaut.com/");	
	    driver.findElement(By.linkText("SIGN-ON")).click();  
	}
    
	@When("^Enter username$")
	public void Enter_username() throws Exception
	{  
		
		System.out.println("Enter Username");
		driver.findElement((By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"))).sendKeys("Dummyuser_123");		
		
	}
	
	@And("^Enter Password$")
	public void Enter_Password() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Demo123");
		System.out.println("Enter Password");
	}
	
	@Then("^Click Signin$")
	public void Click_Signin() throws Exception
	{
		driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input")).click();
		System.out.println("Click Signin");
	}
	
	@Then("^Close browser$")
	public void Close_browser() throws Exception
	{
		driver.quit();
	    System.out.println("Mercury Tours Login Done");
	   
	}
	
	
	
	
}

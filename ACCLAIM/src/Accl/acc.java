
package Accl;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
 
@SuppressWarnings("unused")
public class acc {

	
	//Testers approach to check if login was successful
	
	public void login_T(String username,String password,String url) throws InterruptedException  
	
	{
	System.out.println("entered succssfully");
	System.setProperty("webdriver.gecko.driver", "C:\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver(); //launch firefox browser
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.get(url);
	driver.findElement(By.name("txtLoginId")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("btnLogin")).click();
	driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver,120);
	 
	driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/form[1]/div[9]/nav[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	System.out.println("left the above object");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	
	WebElement element = driver.findElement(By.id("ctl01_MenuControl_hlSubmission"));
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.perform();
 Thread.sleep(5000);
	driver.findElement(By.id("ctl01_MenuControl_hlSubmission")).click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	
	driver.findElement(By.id("ctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_txtx02ecc523-2b8f-4e40-a475-84acb1bc5e02")).sendKeys("7/8/2020");
	driver.findElement(By.id("ctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_txtx2418188d-557b-47f1-b6cb-c16a0a5c7384")).sendKeys("7/9/2020 ");
	driver.findElement(By.name("ctl01$cphMain$answercontrolb1337459bb244e7989effbf59d6cb1c7$txtxc5ff5bfb-0cc0-42e6-a973-93831cebffdd")).sendKeys("qza.co");
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/span[2]/input[1]")).sendKeys("My new address");
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/span[2]/input[1]")).sendKeys("New address 2.com");
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/span[2]/input[1]")).sendKeys("New city");
	Select states=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/span[2]/select[1]")));
	states.selectByIndex(2);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/span[2]/select[1]")).sendKeys("190002");
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[13]/div[1]/span[2]/input[1]")).sendKeys("190002");
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[14]/div[1]/span[2]/input[1]")).sendKeys("190002");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)", "");
	
	Select marketseg=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[17]/div[1]/span[2]/select[1]")));
	marketseg.selectByIndex(2);
	
	Thread.sleep(20000);
	//WebDriverWait wait = new WebDriverWait(driver, 60);
	//wait.until(presenceOfElementLocated(By.id("ctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_drpl165f01be-5ad8-496e-85f5-7f5745e45462"))).click();
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	//driver.findElement(By.id("ctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_drpl165f01be-5ad8-496e-85f5-7f5745e45462")).click();
	Select custseg=new Select(driver.findElement(By.id("ctl01_cphMain_answercontrolb1337459bb244e7989effbf59d6cb1c7_drpl165f01be-5ad8-496e-85f5-7f5745e45462")));
	custseg.selectByIndex(2);
	
	Thread.sleep(20000);
	Select productselc=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[19]/div[1]/span[2]/select[1]")));
	productselc.selectByIndex(1);
	Thread.sleep(20000);
	Select availgroupT=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[20]/div[1]/span[2]/select[1]")));
	availgroupT.selectByIndex(3);
	Thread.sleep(20000);
	Select assignUnder=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[27]/div[1]/span[2]/select[1]")));
	assignUnder.selectByIndex(5);
	Thread.sleep(20000);
	Select avail_form=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[21]/div[1]/span[2]/select[1]")));
	avail_form.selectByIndex(1);
	Thread.sleep(20000);
	Select sales_contact=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[25]/div[1]/span[2]/select[1]")));
	sales_contact.selectByIndex(2);
	Thread.sleep(20000);
	Select Region=new Select(driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[26]/div[1]/span[2]/select[1]")));
	Region.selectByIndex(2);
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[1]/div[1]/div[2]/input[2]")).click();
	
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	// click next button on submission page
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/a[1]")).click();
	Thread.sleep(20000);
	// click search on agency
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")).click();
	Thread.sleep(20000);
	//select agency
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
	
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/span[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/a[1]")).click();
	Thread.sleep(20000);
	Select distri_source=new Select(driver.findElement(By.id("ctl01_cphMain_ClientBrokerContact_drpDistributionSource")));
	distri_source.selectByIndex(3);
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[5]/div[1]/a[3]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]/i[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
	Thread.sleep(20000);
	JavascriptExecutor jso = (JavascriptExecutor) driver;
	
	jso.executeScript("window.scrollBy(0,350)", "");
	
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[2]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/div[11]/div[2]/div[3]/input[3]")).click();
	}


	public static void main( String[] args) throws InterruptedException
	{
		acc login=new acc();
		acc pick=new acc();
		String c=login.login_D("Qamar", "Password");
		System.out.println(c);
		login.login_T("qamar.zaman","Qamar@1234567","https://testv4.qwikcoverage.com/Login/Login.aspx");
		
	}
	
	
	@SuppressWarnings("unused")
	private static Function<WebDriver,WebElement> presenceOfElementLocated(final By locator)
	{
	    return new Function<WebDriver, WebElement>() {
	        @Override
	        public WebElement apply(WebDriver driver) {
	            return driver.findElement(locator);
	        }
	    };
	}
	

	// Developers approach to check if login was successful

	public String login_D( String username, String password) 
	
	{                                       
		String true_password="Password";
		String true_username="Qamar";
		 
		if (true_password==password && true_username==username)
					
			return("You have successfully logged in");
		else
			return("Login Failed");
			
			 
	
}
	
//Testers approach to check if login was successful
	
	public void clander_pick()
	 {
		 WebDriver driver =new FirefoxDriver();
		  
	}
}

	


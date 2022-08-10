package explore;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ExploreWithStokeTrade {

	private static final CharSequence RELIANCE = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shreyas\\Files\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  

		  driver.get("https://expert.investwithtribe.com/mytribe");
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//img[@alt='tribe logo']")).click();
		  driver.findElement(By.xpath("//button[@class='tribeDemo']")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/section/aside/div/ul/li[2]/span/a")).click();
	Actions actions=new Actions(driver);
	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
	  Select oSelect=new Select(driver.findElement(By.xpath("//input[@class='ant-input']")));
       oSelect.selectByIndex(3);
       driver.findElement(By.xpath("//*[@id='create-tip']/div[1]/div[1]/label"));
       WebElement instrumentType    = driver.findElement(By.xpath("//*[@id='create-tip_instrumentType']/label[1]"));
       WebElement EQ =driver.findElement(By.xpath("//*[@id='create-tip_instrumentType']/label[1]/span[2]"));
       WebElement CE= driver.findElement(By.xpath("//*[@id='create-tip_instrumentType']/label[2]/span[2]"));
       WebElement PE= driver.findElement(By.xpath("//*[@id='create-tip_instrumentType']/label[3]/span[2]"));
       WebElement FUT= driver.findElement(By.xpath("//*[@id='create-tip_instrumentType']/label[4]/span[2]"));
       driver.findElement(By.xpath("//*[@id='create-tip']/div[2]/div[1]/label)"));
       Actions actions1 =new Actions(driver);
       actions.moveToElement(EQ).moveToElement(CE).moveToElement(PE).moveToElement(FUT).click().perform();
       driver.findElement(By.xpath("//*[@id='rc_select_2']/input"));
	   driver.findElement(By.xpath("//*[@id='cre.ate-tip']/div[2]/div[2]/div/div/div[2]/span[2]")).click();
	   Select oaSelect=new Select(driver.findElement(By.xpath("//*[@id='rc_select_14']/input)")));
       oaSelect.selectByVisibleText("RELIANCE");
       oaSelect.selectByVisibleText("POLICYBZR-EQ");
       oaSelect.selectByVisibleText("ADANIPOWER-EQ");
       oaSelect.selectByVisibleText("SBIN-EQ");
       oaSelect.selectByVisibleText("TATASTEEL-EQ");
       Select sa=new Select(driver.findElement(By.xpath("//*[@id='create-tip']/div[4]/div/div[2]/div[2]/div/div/div/div/span[2]")));
	   sa.selectByVisibleText("Below");
	   sa.selectByVisibleText("Market");
	   sa.selectByVisibleText("Above");
	   Select aSelect=new Select(driver.findElement(By.xpath("//*[@id='create-tip_target']")));
	   aSelect.selectByIndex(1);
	   driver.findElement(By.xpath("//*[@id='create-tip']/div[7]/div[1]/div/div[2]/div/div/div[1]/div/input)")).sendKeys("2022-12-31 3:00 pm");
	   driver.findElement(By.xpath("//*[@id='create-tip_qty']")).sendKeys("1");
	   driver.findElement(By.xpath("//*[@id='create-tip']/div[7]/div[1]/div/div[2]/div/div/div[2]/span[1])")).click();
	   Select as=new Select(driver.findElement(By.xpath("//*[@id='create-tip_transactionType']/label[1]/span[1])")));
	   as.selectByVisibleText("BUY");
	   Select ra=new Select(driver.findElement(By.xpath("//*[@id='create-tip_transactionType']/label[2])")));
	   ra.selectByVisibleText("SELL");
	   Select pa=new Select(driver.findElement(By.xpath("//*[@id='create-tip_premiumTradeType']/label[1]")));
	   pa.selectByVisibleText("FREE");
	   Select ml=new Select(driver.findElement(By.xpath("//*[@id='create-tip_premiumTradeType']/label[2]")));
	   ml.selectByVisibleText("PAID");
	   driver.findElement(By.xpath("//*[@id='create-tip_viewPrice']")).sendKeys("100");
	   driver.quit();
	
	
	
	
	
	
	
	}

}

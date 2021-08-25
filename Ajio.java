package assignment.week3.day2;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Search Screen
		driver.findElementByXPath("//input[@name='searchVal']").sendKeys("bags", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@id='Men']/following::label[1]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//input[@id='Men - Fashion Bags']/following-sibling::label").click();
		Thread.sleep(5000);
		String searchresult=driver.findElementByXPath("//div[@class='length']").getText();
		System.out.println(searchresult);
		List<WebElement> brandname= driver.findElementsByXPath("//div[@class='brand']");
		Set<String>brand=new LinkedHashSet<String>(); 
		System.out.println("******Brand Name*******");
		for(int i=0;i<=brandname.size()-1;i++) {
			String value=brandname.get(i).getText();
			brand.add(value);
		}
		System.out.println(brand);
		List<WebElement> bagname= driver.findElementsByXPath("//div[@class='name']");
		Set<String>name=new LinkedHashSet<String>();
		System.out.println("******Bag Name*******");
		for(int i=0;i<=bagname.size()-1;i++) {
			String bname=bagname.get(i).getText();
			name.add(bname);
		}
		System.out.println(name);
	}

}

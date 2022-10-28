package com.amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonFirefoxTest {
	
	WebElement link;
	WebDriver driver;

	public static void main(String[] args) {
		
		AmazonFirefoxTest obj=new AmazonFirefoxTest();
		obj.setup();
		obj.validateLink();
		
	}
	
		
	public void setup() {
		
		
		
		System.setProperty("webdriver.gecko.driver", "./Resouces/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>  allLinks=(List<WebElement>) driver.findElements(By.xpath("//img[@class='s-image']"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks) {
			System.out.println(link.getText()+ "-" +link.getAttribute("alt"));
		
		
		}
HashMap<String, String> obj1=new HashMap<String, String>();
		
		obj1.put("₹24,999", "OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage)"); 
		obj1.put("₹28,999", "OnePlus Nord 2T 5G (Gray Shadow, 8GB RAM, 128GB Storage)");
		obj1.put("₹33,999", "OnePlus Nord 2T 5G (Jade Fog, 12GB RAM, 256GB Storage)");
		obj1.put("₹28,999", "OnePlus Nord 2T 5G (Jade Fog, 8GB RAM, 128GB Storage)");
		obj1.put("₹55,999 ", "OnePlus 10T 5G (Moonstone Black, 16GB RAM, 256GB Storage)");
		obj1.put("₹15,240", "OnePlus Nord N20 SE (Blue Oasis 4GB RAM 64GB Storage) Smartphone");
		obj1.put("₹₹15,230 ", "OnePlus Nord N20 SE (Celestial Black, 4GB RAM 64GB Storage)"); 
		obj1.put("₹15,240", "OnePlus Nord N20 SE (Blue Oasis 4GB RAM 64GB Storage) Smartphone");
		obj1.put("₹37,999", "OnePlus 10R 5G (Sierra Black, 12GB RAM, 256GB Storage, 150W SuperVOOC)");
		obj1.put("₹61,999", "OnePlus 10 Pro 5G (Emerald Forest, 8GB RAM, 128GB Storage)");
		obj1.put("₹36,999 ", "OnePlus 10R 5G (Sierra Black, 12GB RAM, 256GB Storage, 80W SuperVOOC)");
		obj1.put("₹49,999", "OnePlus 10T 5G (Jade Green, 8GB RAM, 128GB Storage)");
		obj1.put("₹24,999", "OnePlus Nord CE 2 5G (Gray Mirror, 8GB RAM, 128GB Storage)"); 
		obj1.put("₹54,999", "OnePlus 10T 5G (Moonstone Black, 12GB RAM, 256GB Storage)");
		obj1.put("₹66,999", "OnePlus 10 Pro 5G (Volcanic Black, 12GB RAM, 256GB Storage)");
		obj1.put("₹10,499", " (Renewed) OnePlus 5 (Slate Grey, 6GB RAM, 64GB Storage)");
		obj1.put("₹55,999 ", "OnePlus 10T 5G (Moonstone Black, 16GB RAM, 256GB Storage)");
		obj1.put("₹49,999", "OnePlus 10T 5G (Moonstone Black, 8GB RAM, 128GB Storage)");
		obj1.put("₹24,399", "(Renewed) OnePlus Nord 5G (Gray Onyx, 12GB RAM, 256GB Storage)"); 
		obj1.put("₹33,999", "OnePlus Nord 2T 5G (Gray Shadow, 12GB Storage, 256GB Storage)");
		
		
		
		for(Map.Entry<String, String> data :obj1.entrySet()) {
			
			System.out.println("Key from Map is "+data.getKey() + " and value is "+data.getValue());
		}
		driver.close();
		

	
	}
	
	
		
		public boolean validateLink() {
			
			return link.isDisplayed();
			
		}
		
		
		}	
	
	



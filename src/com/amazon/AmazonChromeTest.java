package com.amazon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonChromeTest {
	
	static WebElement link;
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		links();
		validateLinks();
		
	}	
	
	
	public static void links() {
			
		System.setProperty("webdriver.chrome.driver", "./Resouces/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>  listOfElements=(List<WebElement>) driver.findElements(By.xpath("//img[@class='s-image']"));
		System.out.println(listOfElements.size());
		for(WebElement link:listOfElements) {
			System.out.println(link.getText()+ "-" +link.getAttribute("alt"));
			
			
		}
		
		
		
        HashMap<String, String> obj1=new HashMap<String, String>();
		
		obj1.put("₹13,499", "Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)"); 
		obj1.put("₹6,999", "(Renewed) Lenovo Phab 2 (Champagne Gold, 32GB)");
		obj1.put("₹0", "Lenovo A850 (Black)");
		obj1.put("₹6,399", "Nokia C01 Plus 4G, 5.45” HD+ Screen, Selfie Camera with Front Flash | 32GB Storage (Blue)");
		obj1.put("₹9,999 ", "Nokia C21 Plus Android Smartphone, Dual SIM, 3-Day Battery Life, 4GB RAM + 64GB Storage, 13MP Dual Camera with HDR | Dark Cyan");
		obj1.put("₹6,399", "realme narzo 50i (Mint Green, 2GB RAM+32GB Storage) - 6.5\" inch Large Display | 5000mAh Battery");
		obj1.put("₹₹14,499 ", "Nokia G21 Android Smartphone, Dual SIM, 3-Day Battery Life, 6GB RAM + 128GB Storage, 50MP Triple AI Camera | Nordic Blue"); //not follow order
		obj1.put("₹7,499", "Lava Z3 Striped Cyan(3GB RAM, 32GB Storage)");
		obj1.put("₹13,999", "Samsung Galaxy M13 5G (Aqua Green, 4GB, 64GB Storage) | 5000mAh Battery | Upto 8GB RAM with RAM Plus");
		obj1.put("₹11,990", "OPPO A31 (Mystery Black, 6GB RAM, 128GB Storage) with No Cost EMI/Additional Exchange Offers");
		obj1.put("₹24,899 ", "TimeTech Optimus 2 4G Android Mobile Phone (4Gb Ram + 64Gb ROM, 1.6 inch IPS Screen, 13MP Rotating Camera with LED Flash, 1260mAh Battery, Healthcare Sports Function)");
		obj1.put("₹17,990", "Lava Agni 5G |64 MP AI Quad Camera| (8GB RAM/128 GB ROM)| 5000 mAh Battery| Superfast 30W Fast Charging| 6.78 inch Big Screen (Fiery Blue)");
		obj1.put("₹5,599", "Nokia C01 Plus 4G, 5.45” HD+ Screen, Selfie Camera with Front Flash (Grey)"); 
		obj1.put("₹6,299", "Redmi A1 (Light Green, 2GB RAM 32GB ROM) | Helio A22 | 5000 mAh Battery | 8MP AI Dual Cam | Leather Texture Design | Android 12");
		obj1.put("₹3,090", "LYF C451 Touchscreen");
		obj1.put("₹12,999", "Redmi 11 Prime 5G (Thunder Black, 4GB RAM, 64GB Storage) | Prime Design | MTK Dimensity 700 | 50 MP Dual Cam | 5000mAh | 7 Band 5G");
		obj1.put("₹14,499 ", "Nokia G21 Android Smartphone, Dual SIM, 3-Day Battery Life, 6GB RAM + 128GB Storage, 50MP Triple AI Camera | Dusk");
		obj1.put("₹13,499", "Samsung Galaxy M32 Prime Edition (Light Blue, 6GB RAM, 128GB)");
		obj1.put("₹9,999", "Nokia G10, 6.5” HD+ Screen, 5050 mAh Battery, Triple Camera, 4 + 64GB Memory(Dusk/Purple)"); 
		obj1.put("₹6,299", "Redmi A1 (Light Blue, 2GB RAM, 32GB Storage) | Helio A22 | 5000 mAh Battery | 8MP AI Dual Cam | Leather Texture Design | Android 12");
		obj1.put("₹5,599", "Lava Z21 (2GB RAM, 32GB ROM)-Cyan| Octa Core Processor| Stock Android 11| Powerful 3100 mAh Battery");
		obj1.put("₹0", "(Renewed) Oppo A55 (Rainbow Blue, 4GB RAM, 64GB Storage) Without Offers");
		
		
		for(Map.Entry<String, String> data :obj1.entrySet()) {
			
			System.out.println("Key from Map is "+data.getKey() + " and value is "+data.getValue());
		}
		driver.close();
		
	}
		
		public static boolean validateLinks() {
		
	           return link.isDisplayed();
	           
	           
	           
		
		}
		
		
	
		
	
}
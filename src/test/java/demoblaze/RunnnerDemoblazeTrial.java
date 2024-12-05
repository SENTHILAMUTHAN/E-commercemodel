package demoblaze;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RunnnerDemoblazeTrial extends BaseDemblaze {
	@Test
	public void tc1() throws InterruptedException, IOException {
		
		launchBrowser();
		maximizeWindow();
		Wait();
		openwebpage("https://www.demoblaze.com/index.html");

		
//sdbcsdbcscisbeicsbecs
		

		Homepojo h = new Homepojo();
		
		moveTheCursor(h.getIphone632gb());
		actionClick(h.getIphone632gb());
		WebElement addtocart1 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
		moveTheCursor(addtocart1);
		actionClick(addtocart1);
		Thread.sleep(5000);
		handlingAlertAccept();
		// backbtn();

		moveTheCursor(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		actionClick(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		
		
		moveTheCursor(h.getNexus6());
		actionClick(h.getNexus6());
		WebElement addtocart2 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
		moveTheCursor(addtocart2);
		actionClick(addtocart2);
		Thread.sleep(5000);
		handlingAlertAccept();
		// backbtn();

		moveTheCursor(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		actionClick(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		
		
		moveTheCursor(h.getNokiaLumia1520());
		actionClick(h.getNokiaLumia1520());
		WebElement addtocart3 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
		moveTheCursor(addtocart3);
		actionClick(addtocart3);
		Thread.sleep(5000);
		handlingAlertAccept();
		// backbtn();

		moveTheCursor(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		actionClick(driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']")));
		
		
		
		moveTheCursor(h.getCart());
		actionClick(h.getCart());
		
		driver.findElement(By.xpath("(//a[text()='Delete'])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		String placingorderwindow = driver.getWindowHandle();
		driver.switchTo().window(placingorderwindow);
		
		driver.findElement(By.id("name")).sendKeys("Senthil Amuthan");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Tirunelveli");
		driver.findElement(By.id("card")).sendKeys("378282246310005");
		driver.findElement(By.id("month")).sendKeys("July");
		driver.findElement(By.id("year")).sendKeys("2024");
		
		driver.findElement(By.xpath("//button[@onclick='purchaseOrder()']")).click();
		scnsht("Orderconfirmation");
		
	
	
}
        
        
        
        

		
		
	}
	
	
	
	
	
	
	
	
	


package demoblaze;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoblazeRunner extends BaseDemblaze {

    @BeforeClass
    public void setup() throws IOException {
        launchBrowser();
        maximizeWindow();
        Wait();
        openwebpage("https://www.demoblaze.com/index.html");
    }

    @Test
    public void tc1_addIphoneToCart() throws InterruptedException {
        Homepojo h = new Homepojo();
        moveTheCursor(h.getIphone632gb());
        actionClick(h.getIphone632gb());
        WebElement addtocart1 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        moveTheCursor(addtocart1);
        actionClick(addtocart1);
        Thread.sleep(5000);
        handlingAlertAccept();
        navigateHome();
    }

    @Test(dependsOnMethods = "tc1_addIphoneToCart")
    public void tc2_addNexusToCart() throws InterruptedException {
        Homepojo h = new Homepojo();
        moveTheCursor(h.getNexus6());
        actionClick(h.getNexus6());
        WebElement addtocart2 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        moveTheCursor(addtocart2);
        actionClick(addtocart2);
        Thread.sleep(5000);
        handlingAlertAccept();
        navigateHome();
    }

    @Test(dependsOnMethods = "tc2_addNexusToCart")
    public void tc3_addNokiaToCart() throws InterruptedException {
        Homepojo h = new Homepojo();
        moveTheCursor(h.getNokiaLumia1520());
        actionClick(h.getNokiaLumia1520());
        WebElement addtocart3 = driver.findElement(By.xpath("//a[normalize-space()='Add to cart']"));
        moveTheCursor(addtocart3);
        actionClick(addtocart3);
        Thread.sleep(5000);
        handlingAlertAccept();
        navigateHome();
    }

    @Test(dependsOnMethods = "tc3_addNokiaToCart")
    public void tc4_deleteFirstProductAndPlaceOrder() throws InterruptedException, IOException {
        Homepojo h = new Homepojo();
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

    private void navigateHome() throws InterruptedException {
        WebElement homeButton = driver.findElement(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
        moveTheCursor(homeButton);
        actionClick(homeButton);
        Thread.sleep(3000);
    }
}

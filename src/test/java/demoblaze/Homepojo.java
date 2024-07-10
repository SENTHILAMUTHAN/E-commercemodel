package demoblaze;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepojo extends BaseDemblaze {
	
	public Homepojo() {
		PageFactory.initElements(driver, this);
	}
	

	

@FindBy(xpath="//a[normalize-space()='Samsung galaxy s6']") @CacheLookup private WebElement samsungGalaxyS6;
@FindBy(xpath="//a[normalize-space()='Nokia lumia 1520']") @CacheLookup private WebElement nokiaLumia1520;
@FindBy(xpath="//a[normalize-space()='Nexus 6']") @CacheLookup private WebElement nexus6;
@FindBy(xpath="//a[normalize-space()='Samsung galaxy s7']") @CacheLookup private WebElement samsungGalaxyS7;
@FindBy(xpath="//a[normalize-space()='Iphone 6 32gb']") @CacheLookup private WebElement iphone632gb;
@FindBy(xpath="//a[normalize-space()='Sony xperia z5']") @CacheLookup private WebElement sonyXperiaZ5;

@FindBy(xpath="//a[@id='cartur']") @CacheLookup private WebElement cart;


public WebElement getCart() {
	return cart;
}
public WebElement getSamsungGalaxyS6() {
	return samsungGalaxyS6;
}
public WebElement getNokiaLumia1520() {
	return nokiaLumia1520;
}
public WebElement getNexus6() {
	return nexus6;
}
public WebElement getSamsungGalaxyS7() {
	return samsungGalaxyS7;
}
public WebElement getIphone632gb() {
	return iphone632gb;
}
public WebElement getSonyXperiaZ5() {
	return sonyXperiaZ5;
}
	
	
	
	
	
	
	
	
	
	
	
	

}

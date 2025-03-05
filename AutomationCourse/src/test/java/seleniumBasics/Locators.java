package seleniumBasics;

import org.openqa.selenium.By;

public class Locators extends Base {
	
	public void handlingLocators() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("single-input-field")); //to find element by ID
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Radio Buttons"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']"));
		driver.findElement(By.xpath("//input[@id='value-b']"));
		driver.findElement(By.xpath("//button[@id='button-two']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[@type='button' and @id='button-one']"));
		driver.findElement(By.xpath("//button[@type='buttonsecond' or @id='button-one']"));
		driver.findElement(By.xpath("//input[@id='single-input-field']/parent::div"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		
	}

	public static void main(String[] args) {
		Locators locator=new Locators();
		locator.initialiseBrowser();
		locator.handlingLocators();
		locator.driverCloseAndQuit();

	}

}
//html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input- absolute xpath
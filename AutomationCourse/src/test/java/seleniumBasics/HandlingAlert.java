package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base{
	
	public void handlingSimpleAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick=driver.findElement(By.xpath("//button[@id='alertButton']"));
		simpleclick.click();
		Alert alertRef=driver.switchTo().alert();
		alertRef.accept();
	}
	
	public void handlingConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmclick=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmclick.click();
		Alert confirmRef=driver.switchTo().alert();
		confirmRef.accept();
	}
	
	public void handlingPromptAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptclick=driver.findElement(By.xpath("//button[@id='promtButton']"));
		promptclick.click();
		Alert promptRef=driver.switchTo().alert();
		promptRef.sendKeys("Sample text");
		promptRef.accept();
	}

	public static void main(String[] args) {
		HandlingAlert alert = new HandlingAlert();
		alert.initialiseBrowser();
		//alert.handlingSimpleAlert();
		//alert.handlingConfirmAlert();
		alert.handlingPromptAlert();
		//alert.driverCloseAndQuit();
		

	}

}

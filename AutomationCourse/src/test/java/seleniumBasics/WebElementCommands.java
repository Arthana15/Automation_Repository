package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base{
	
	public void handlingWebElementCommands() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messageField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		messageField.sendKeys("Arthana");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		System.out.println(showMessageButton.isDisplayed());
		System.out.println(showMessageButton.isEnabled());
		showMessageButton.click();
		//messageField.clear();
		System.out.println(showMessageButton.getCssValue("background-color"));
		System.out.println(messageField.getTagName());
		System.out.println();
		WebElement yourMessage=driver.findElement(By.id("message-one"));
		yourMessage.getText();
	}

	public static void main(String[] args) {
		WebElementCommands web =new WebElementCommands();
		web.initialiseBrowser();
		web.handlingWebElementCommands();
		//web.driverCloseAndQuit();

	}

}

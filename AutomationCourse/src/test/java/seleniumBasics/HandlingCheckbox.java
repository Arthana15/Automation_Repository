package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckbox extends Base {
	
	public void handlingCheckbox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement check=driver.findElement(By.xpath("//input[@value='option-1']"));
		check.click();
		System.out.println(check.isSelected());
	}

	public void handlingRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radio=driver.findElement(By.xpath("//input[@value='blue']"));
		radio.click();
	}
	
	public static void main(String[] args) {
		HandlingCheckbox checkbox=new HandlingCheckbox();
		checkbox.initialiseBrowser();
		checkbox.handlingCheckbox();
		//checkbox.handlingRadioButton();
		//checkbox.driverCloseAndQuit();

	}

}

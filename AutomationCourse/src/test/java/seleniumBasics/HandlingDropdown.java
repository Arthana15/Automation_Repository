package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	
	public void dropdown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement drop1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(drop1); //Select is predefined class
		//select.selectByIndex(3);
		//select.selectByVisibleText("Python");
		select.selectByValue("c#");
	}

	public static void main(String[] args) {
		HandlingDropdown drop=new HandlingDropdown();
		drop.initialiseBrowser();
		drop.dropdown();
		//drop.driverCloseAndQuit();

	}

}

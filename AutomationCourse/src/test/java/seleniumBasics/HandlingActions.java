package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage=driver.findElement(By.id("button-one"));
		Actions action=new Actions(driver);
		action.contextClick(showMessage).build().perform();
	}
	public void verifyMouseHover() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement mouseHover=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
		Actions action=new Actions(driver);
		action.moveToElement(mouseHover).build().perform();
	}
	
	public void dragAndDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
	}

	public void verifyKeyboardActions() throws AWTException {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);//pressed control
		robot.keyPress(KeyEvent.VK_T);//Virtualkey - T(cntrl+T)
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
	}
	
	public static void main(String[] args) {
		HandlingActions actions=new HandlingActions();
		actions.initialiseBrowser();
		//actions.verifyRightClick();
		//actions.verifyMouseHover();
		//actions.dragAndDrop();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//actions.driverCloseAndQuit();
		

	}

}

package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base{
	
	public void verifyFileUploaUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\artha\\git\\Automation_Repository\\AutomationCourse\\src\\test\\resources\\Bug Life Cycle. pdf");
		WebElement textCheckbox=driver.findElement(By.xpath("//input[@id='terms']"));
		textCheckbox.click();
		WebElement submit=driver.findElement(By.xpath("//button[@id='submitbutton']"));
		submit.click();
	}
	
	public void fileUploadUsingRobotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement selectPdf=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		selectPdf.click();
		StringSelection s = new StringSelection("C:\\Users\\artha\\git\\Automation_Repository\\AutomationCourse\\src\\test\\resources\\Bug Life Cycle. pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); 
		Robot robot = new Robot();
		robot.delay(2500);
		 robot.keyPress(KeyEvent.VK_ENTER);
	     
	      robot.keyRelease(KeyEvent.VK_ENTER);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      robot.keyPress(KeyEvent.VK_V);
	      
	      
	      robot.keyRelease(KeyEvent.VK_CONTROL);
	      robot.keyRelease(KeyEvent.VK_V);
	      robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}

	public static void main(String[] args) {
		FileUpload upload=new FileUpload();
		upload.initialiseBrowser();
		//upload.verifyFileUploaUsingSendKeys();
		try {
			upload.fileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//upload.driverCloseAndQuit();
		

	}

}

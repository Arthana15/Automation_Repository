package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorSample extends Base {
	
	public void jsexecutorsample() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[@id='button-one']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageButton);
		//js.executeScript("window.scrollBy(0,350)", ""); //scrolldown
		//js.executeScript("window.scrollBy(0,-350)", "");   //scrollup
		js.executeScript("window.scrollBy(0,350)", "");   //scrolldown (350:scroll ratio)
	} 
	
	

	public static void main(String[] args) {
		JavaScriptExecutorSample jsexecutor=new JavaScriptExecutorSample();
		jsexecutor.initialiseBrowser();
		jsexecutor.jsexecutorsample();
		//jsexecutor.driverCloseAndQuit();

	}

}

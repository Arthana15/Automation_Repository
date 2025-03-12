package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {
	
	public void handlingframes() {
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size()); //find how many iframes are there in DOM
		WebElement firstFrame=driver.findElement(By.id("frame1"));//driver control will be inside entire webpage
		driver.switchTo().frame(firstFrame);//webpage control will switch to this frame
		WebElement frameText=driver.findElement(By.id("sampleHeading"));
		System.out.println(frameText.getText());
		driver.switchTo().defaultContent();//control will be back to entire webpage
		System.out.println(driver.getTitle());
		
	}

	public static void main(String[] args) {
		HandlingFrames frames=new HandlingFrames();
		frames.initialiseBrowser();
		frames.handlingframes();
		//frames.driverCloseAndQuit();

	}

}

package seleniumBasics;

public class HandlingNavigationCommands extends Base {
	
	public void handlingNavigationCommands() {
		
		driver.navigate().to("https://www.amazon.in");//to navigate to different pages
		driver.navigate().back();//back to the initial page
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		
		HandlingNavigationCommands navigate=new HandlingNavigationCommands();
		navigate.initialiseBrowser();
		navigate.handlingNavigationCommands();
		navigate.driverCloseAndQuit();
		
		

	}

}

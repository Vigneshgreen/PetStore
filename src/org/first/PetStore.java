package org.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PetStore {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vigne\\eclipse-workspace\\PetStore\\driver\\msedgedriver.exe");
		
		//set up the selenium webdrive
		WebDriver driver=new EdgeDriver();
		
		//maximizing the browser window
		driver.manage().window().maximize();
		
		//Navigate to the petstore website
		driver.get("https://petstore.swagger.io/");
		
		//wait untill 10 sec
		Thread.sleep(10000);
		
		//quit Browser
		driver.quit();
		
		
	}

}

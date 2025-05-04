package day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLoactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the browser
				ChromeDriver driver =new ChromeDriver();
				
				//load the url
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to get the title
				String title=driver.getTitle();
				System.out.println(title);
				
				//enter the username [using the element ID]
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
				//enter the password [using the element name]
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				
				//Click the login button [using the element classname]
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Click on the CRM/SFA [using the elment partial link]
				driver.findElement(By.partialLinkText("SFA")).click();
				

	}

}

package day_3;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the url
		driver.get("https://www.flipkart.com/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to get the title
		String title=driver.getTitle();
		System.out.println(title);
		
		//close the window
		driver.close();
	}

}

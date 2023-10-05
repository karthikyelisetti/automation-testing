import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		//Close v/s quit - close will close only the current browser session. quit will close all the dependent and parent browser session
		driver.close();
	}

}

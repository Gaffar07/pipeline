package comm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	
	
	@Test
	public void test() {
		ChromeOptions options = new ChromeOptions();  
		options.addArguments("--headless");
		WebDriver driver=new ChromeDriver(options);
        
		driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Reporter.log(driver.getTitle(),true);
        Reporter.log("hello Gaffar",true);
        
	
}

}

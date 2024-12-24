package comm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	
	
	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
        
		driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.getTitle();
	
}

}

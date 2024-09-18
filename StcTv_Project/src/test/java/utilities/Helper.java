package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
	
	
	
	 private static WebDriver driver ;
	 
//	 public static void setUpDriver() {
//	        if (Helper==null) {
//	            Helper = new Helper();
//	        }
//	    }
//	 
	 public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
     }

}

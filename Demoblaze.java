package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Setup ChromeDriver using WebDriverManager
        WebDriver.chromedriver().setup();
        
        // Set up Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        
        // Navigate to the website
        driver.get("https://www.demoblaze.com/");
        
        // Verify the title of the page
        String expectedTitle = "STORE";
        String actualTitle = driver.getTitle();
        
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Page landed on correct website");
        } else {
            System.out.println("Page not landed on correct website");
        }
        
        // Close the browser
        driver.quit();
    }
}
		
		        
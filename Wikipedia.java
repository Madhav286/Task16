package Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Wikipedia {
	
	
	    public static void main(String[] args) {
	        // Setup ChromeDriver using WebDriverManager
	        WebDriver.chromedriver().setup();
	        
	        // Set up Chrome options
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        
	        // Initialize WebDriver
	        WebDriver driver = new ChromeDriver(options);
	        
	        try {
	            // Navigate to the website
	            driver.get("https://www.wikipedia.org/");
	            
	            // Search for "Artificial Intelligence"
	            WebElement searchBox = driver.findElement(By.id("searchInput"));
	            searchBox.sendKeys("Artificial Intelligence");
	            searchBox.submit();
	            
	            // Wait for the results to load
	            Thread.sleep(3000);
	            
	            // Click on the "History" section link
	            WebElement historyLink = driver.findElement(By.partialLinkText("History"));
	            historyLink.click();
	            
	            // Wait for the page to load
	            Thread.sleep(3000);
	            
	            // Print the title of the "History" section
	            WebElement sectionTitle = driver.findElement(By.id("firstHeading"));
	            System.out.println("Section title: " + sectionTitle.getText());
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}



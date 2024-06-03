package Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxBrowser {
	
	
	    public static void main(String[] args) {
	        // Set the path to the geckodriver executable
	    	System.setProperty("webdriver.gecko.driver", "/Users/ratnalabindumadhav/Downloads/geckodriver \n"
	    			+ "\n"
	    			+ "");


	        // Initialise the Firefox driver
	      
	        WebDriver driver = new FirefoxDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to Google
	            driver.get("http://google.com");

	            // Print the URL of the current page
	            System.out.println("Current URL: " + driver.getCurrentUrl());

	            // Reload the page
	            driver.navigate().refresh();

	            // Wait for a couple of seconds to observe the refresh
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	}



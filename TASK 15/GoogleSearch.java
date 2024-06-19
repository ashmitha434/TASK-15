package selenium;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class GoogleSearch {
	    public static void main(String[] args) {
	        // Set the path to the FirefoxDriver executable
	        System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

	        // Create a new instance of the FirefoxDriver
	        WebDriver driver = new FirefoxDriver();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Find the search box by name
	        WebElement searchBox = driver.findElement(By.name("q"));

	        // Type "Selenium Browser Driver" into the search box
	        searchBox.sendKeys("Selenium Browser Driver");

	        // Submit the search
	        searchBox.submit();

	        // Wait for the search results to load
	        try {
	            Thread.sleep(2000); // You can use WebDriverWait for a better solution
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Print the title of the search results page
	        System.out.println("Page title: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	    }
	}



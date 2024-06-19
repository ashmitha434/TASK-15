package selenium;
	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class SimpleWebDriverScript {
	    public static void main(String[] args) {
	        // Set the path to the FirefoxDriver executable
	        System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

	        // Create a new instance of the Firefox Driver
	        WebDriver driver = new FirefoxDriver();

	        // Step 3: Navigate to Google
	        driver.get("https://www.google.com");

	        // Step 4: Find the search box and input "Selenium Browser Driver"
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("Selenium Browser Driver");

	        // Step 4 (continued): Submit the search
	        searchBox.submit();

	        // Step 7: Optionally, perform assertions or verifications
	        String expectedTitle = "Selenium Browser Driver - Google Search";
	        if (driver.getTitle().equals(expectedTitle)) {
	            System.out.println("Test Passed! Search results page title is correct.");
	        } else {
	            System.out.println("Test Failed! Search results page title is incorrect.");
	        }

	        // Step 8: Close the browser
	        driver.quit();
	    }
	}



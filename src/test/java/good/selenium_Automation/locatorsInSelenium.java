package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsInSelenium {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Locator - ID
        driver.findElement(By.id("autocomplete")).sendKeys("Indi");
        driver.manage().window().maximize();
        //Locator - Xpath
        driver.manage().deleteAllCookies();



















        driver.quit();

    }
}

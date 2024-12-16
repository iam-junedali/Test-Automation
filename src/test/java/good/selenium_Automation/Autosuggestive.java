package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Autosuggestive {

    @Test
    public void autoSuggestiveDropdown() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("India");
        List<WebElement> countryNames = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for (int i=0; i<=countryNames.size()-1; i++) {
            String cName = countryNames.get(i).getText();
            i++;
            if(countryNames.get(i).getText().equals("India")) {
                countryNames.get(i).click();
            }
        }





    }
}

package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class dropdownsInSelenium {

    @Test
    public void dropdowns() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("divpaxinfo")).click();
        WebElement addition = driver.findElement(By.id("hrefIncAdt"));
        for (int i=0; i<4; i++) {
            addition.click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();

        Select currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        System.out.println(currency.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        List<WebElement> Source = driver.findElements(By.className("mapbg"));
        for (int i = 0; i <= Source.size()-1; i++) {

            String CityName  = Source.get(i).getText();
            i++;
            System.out.println(CityName);

            if(CityName.equals("Delhi (DEL")){
                Source.get(i).click();
            }

        }
    }
}

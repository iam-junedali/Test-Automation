package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class loop {

    @Test
    public void test() {

        System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        List<WebElement> City = driver.findElements(By.xpath("//div[@class='dropdownDiv']/ul/li/a"));
        for (int i = 0; i <= City.size()-1; i++) {

            String cityname = City.get(i).getText();
            i++;
            System.out.println(cityname);
            if(cityname.equalsIgnoreCase("Adampur (AIP)")){
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                City.get(i).click();
            }

        }

    }
}

package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Calendar {

    @Test
    public void calendar_ui() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
        List<WebElement> CalendarDates = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div/table"));
        for (int i = 0; i < CalendarDates.size(); i++) {
            String cdate = CalendarDates.get(i).getText();
                if (cdate.equalsIgnoreCase("29")) {
                    CalendarDates.get(i).click();
                }
        }


    }
}

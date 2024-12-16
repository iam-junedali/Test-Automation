package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Mousehover {

    @Test
    public void TestMousehover() throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
        Thread.sleep(4000);
        driver.close();

    }
}

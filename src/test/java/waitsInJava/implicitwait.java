package waitsInJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicitwait {

    @Test
    public void testImplicitWait() {

        System.setProperty("webdriver.chrome.driver", "E:\\WebDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alaskaair.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }
}

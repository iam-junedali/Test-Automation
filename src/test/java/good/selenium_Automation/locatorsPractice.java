package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class locatorsPractice {

    @Test
    public void LocatorsInPractice() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("inputUsername")).sendKeys("Juned");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettacademy");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String errmsg = driver.findElement(By.className("error")).getText();
        System.out.println(errmsg);
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Juned");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Juned@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9550");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String msg = driver.findElement(By.cssSelector(".infoMsg")).getText();
        System.out.println(msg);
        driver.findElement(By.className("go-to-login-btn")).click();
        driver.findElement(By.id("inputUsername")).sendKeys("Juned");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String successmsg = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
        System.out.println(successmsg);
        driver.findElement(By.className("logout-btn")).click();

    }
}

package good.selenium_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class GreenKart {

    @Test
    public void greenKart(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\juned\\AquaProjects\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String[] vegNames = {"Brocolli","Cauliflower","Potato","Corn"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> productNames = driver.findElements(By.cssSelector("h4.product-name"));
        List<String> al = Arrays.asList(vegNames);

        for (int i = 0; i < productNames.size(); i++) {

            String[] pName = productNames.get(i).getText().split("-");
            String updatedPName = pName[0].trim();

            if(al.contains(updatedPName)){

                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

            }

        }
    }
}

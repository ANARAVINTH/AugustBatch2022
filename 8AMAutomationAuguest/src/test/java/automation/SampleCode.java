package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SampleCode {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\SeleniumFiles\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

      //  driver.findElement(By.id("username")).sendKeys("Learn More");

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Learnmore");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/div[3]/form/div[1]/div/input[1]")).sendKeys("123");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("pw")));

       // driver.findElement(By.name("pw")).sendKeys("123");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
        
        //error
    }



}

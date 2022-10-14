package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import reusable.BrowserInvocation;

import java.io.IOException;

public class StaleExample extends ParentClass {
    int a =1;
   public  void m1(){

       int a =7 ;
       System.out.println(a);
       System.out.println(this.a);
       System.out.println(super.a);

       final double pie = 3.14;

   }


    public static void main(String[] args) throws IOException {

       StaleExample s = new StaleExample();
       s.m1();
      WebDriver driver = BrowserInvocation.broswerCall();

        WebElement enterUserName = driver.findElement(By.id("username"));
        WebElement enterPassword = driver.findElement(By.name("pw"));

        enterUserName.sendKeys("Learnmore");
        enterPassword.sendKeys("123");

        driver.navigate().refresh();

        try {
            enterUserName.sendKeys("Learnmore");
            enterPassword.sendKeys("123");
        }
        catch(StaleElementReferenceException e){

            enterUserName = driver.findElement(By.id("username"));
            enterPassword = driver.findElement(By.name("pw"));
            enterUserName.sendKeys("Learnmore");
            enterPassword.sendKeys("123");
        }

    }
}

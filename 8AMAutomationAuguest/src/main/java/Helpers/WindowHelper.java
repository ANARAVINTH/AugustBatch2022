package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WindowHelper {

    private  static WebDriver webDriver;
    private  static  WindowHelper windowHelper;

    public WindowHelper(WebDriver driver) {
        webDriver = driver;
    }

    private static WindowHelper getInstance(WebDriver driver){

        if(driver.hashCode() != webDriver.hashCode()){
            windowHelper = new WindowHelper(driver);
        }
        return windowHelper;
    }

    private WebDriverWait getWait(){

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(50));
        return wait;
    }
    private List<String> getWindowhandleIds(){

       List<String> windowIds= new ArrayList<>(webDriver.getWindowHandles());
        return Collections.unmodifiableList(windowIds);
    }

    public  void switchToChild(int index){

       List<String> windowIds = getWindowhandleIds();

       if(index < 0 || index > windowIds.size() ){
           throw new IllegalArgumentException("user entered invalid index : " + index);
       }

        WebDriverWait wait =getWait();
        wait.until(ExpectedConditions.numberOfWindowsToBe(index));

        webDriver.switchTo().window(windowIds.get(index));
    }

    public  void switchToParent(){
        List<String> windowIds = getWindowhandleIds();
        webDriver.switchTo().window(windowIds.get(0));
       // webDriver.switchTo().defaultContent();
    }

    //switch to parent window with close




}

package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TextBoxHelper {

    private static TextBoxHelper textBoxHelper;
    private WebDriver wd; //null
    private WebElement element;

    public TextBoxHelper(WebDriver driver) {
        wd = driver;
    }

    public static TextBoxHelper getInstance(WebDriver driver){

        textBoxHelper  = new TextBoxHelper(driver);

        return textBoxHelper;
    }
    
    //setText //getText
    
    public void setTextValue(By locater, String value){

        element= wd.findElement(locater);
        element.sendKeys(value);
    }

    public String getTextValue(By locater){
        element= wd.findElement(locater);
        String value = element.getText();
        return value;
    }

    public void clearTextValue(By locater){
        element= wd.findElement(locater);
        element.clear();
    }


    
    
}

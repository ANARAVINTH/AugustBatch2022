package Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHelper {

    private static WebDriver webDriver; //null
    private static DropdownHelper dropdownHelper;

    private DropdownHelper(WebDriver driver){
        webDriver = driver;
    }

    public static DropdownHelper getInstance(WebDriver driver){

        if(driver.hashCode() != webDriver.hashCode()) {
            dropdownHelper = new DropdownHelper(driver);
        }

        return dropdownHelper;

    }

    public void selectByVisibleTextValue(By locater, String textValue){

        Select select = new Select(webDriver.findElement(locater));

        select.selectByVisibleText(textValue);
    }

    public void selectByIndexPosition(By locater, int index){

        Select select = new Select(webDriver.findElement(locater));

        select.selectByIndex(index);
    }



}

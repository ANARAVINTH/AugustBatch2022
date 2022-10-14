package com.xyz.stepdefination;

import Helpers.TextBoxHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BrowserInvocation;
import reusable.ReadExcel;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class SalesforceValidationSteps {

   private int a =1;  //Global variable

   private WebDriver driver;  //null //chrome
   private  TextBoxHelper textBoxHelper;


    @Then("user navigates to the homepage")
    public void homePage(){

    }

    @Given("user navigates to salesforce application")
    public void login() throws IOException {

      int a=  BrowserInvocation.m1();

      String d= BrowserInvocation.m2();

      driver = BrowserInvocation.broswerCall();

      textBoxHelper=TextBoxHelper.getInstance(driver);

    }

    @When("User enter the username {string} and password {string}")
    public void enterUsernamePassword(String userName ,String password) throws IOException {

        textBoxHelper.setTextValue(By.id("username"),userName);
        textBoxHelper.setTextValue(By.id("password"),password);
       // driver.findElement(By.id("username")).sendKeys(ReadExcel.retrevieData("UserDetails",0,0));
      //  driver.findElement(By.id("password")).sendKeys(ReadExcel.retrevieData("UserDetails",0,1));

     //   driver.getTitle();
      //  driver.switchTo().alert().accept();
      //  driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().sendKeys("Aravinth");
//        driver.switchTo().alert().accept();
//       String actual = driver.switchTo().alert().getText();
    }

    @Then("validate the error message")
    public void errorMessage(){

       String expectedResult = "check your username and password. If you still can't log in, contact your Salesforce administrator.";
       String actualResult = driver.findElement(By.id("error")).getText();

       if(expectedResult.equals(actualResult)){
           System.out.println("Error message Matched");
       }
       else{
           System.out.println("Error Message Doesnot Match");
       }
    }

    @And("User clicks the login button")
    public void clickLoginButton(){

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofSeconds(10));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Login123")));

        driver.findElement(By.id("Login123")).click();
      //  driver.findElement(By.cssSelector("[id='Login']")).click();
       // driver.findElement(By.className("login_credentials_wrap")).click();

    }

    @Given("user navigate to URL")
    public void user_navigate_to_url() throws IOException {

       driver= BrowserInvocation.broswerCall();
    }

    @When("Use Map")
    public void mapexa() {

        List<WebElement> key = driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr/th"));

        List<WebElement> value = driver.findElements(By.xpath("//table[@class='infobox vcard']/tbody/tr//td[not(contains(@class,'infobox-image logo'))]"));

        Map<String, String> map = new HashMap<String, String>();

        List<String> keyList  = new ArrayList<>();

        for (int i = 0; i < key.size(); i++) {
            keyList.add(i,getListOfText(i,key)) ;
            map.put(getListOfText(i,key),getListOfText(i,value));

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("What information you need in coginzant wiki tabel");
        String userInput = sc.nextLine();

        if(keyList.contains(userInput)){

            for (String coulumOneTitle:keyList){
                if(coulumOneTitle.equals(userInput)){
                    System.out.println(map.get(userInput));
                    break;
                }

            }

        }
        else {

            System.out.println("Enter valid input");
        }

    driver.findElement(By.cssSelector("[id*='card-']"));

    }


    public String getListOfText(Integer itr,List<WebElement> e){

       return e.get(itr).getText().trim();
    }





    @When("Handle")
    public  void handle(){

       WebElement footer = driver.findElement(By.id("nav_menu-2"));

      List<WebElement> links= footer.findElements(By.tagName("a"));

      for (WebElement e:links){

          String keyAction =Keys.chord(Keys.CONTROL,Keys.ENTER);
          e.sendKeys(keyAction);
      }

     Set<String> winProp = driver.getWindowHandles();

      for (String r:winProp) {
          driver.switchTo().window(r);
          System.out.println(driver.getTitle());
      }
      driver.switchTo().defaultContent();

      driver.close();
      driver.quit();

    }

    @When("Handle the table")
     public void handleTable(){

     WebElement infosysTable =   driver.findElement(By.xpath("//table[@class='infobox vcard']"));

      int tableSize =  infosysTable.findElements(By.tagName("tr")).size();
        System.out.println(tableSize);

        int coloumnOne =  infosysTable.findElements(By.tagName("td")).size();


      for (int i=0;i<coloumnOne;i++){
          String value = infosysTable.findElements(By.tagName("th")).get(i).getText();
          System.out.println(value);
      }

      driver.findElements(By.tagName("//tr/th[5]")).size();

      String a= "123";
      Integer.parseInt(a);




    }

    @When("Handle the frame")
    public void handle_the_frame() {

        WebElement frameElement = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frameElement);

        Actions actions = new Actions(driver);

        WebElement source =driver.findElement(By.id("draggable"));
       WebElement target = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
        actions.dragAndDrop(source,target).build().perform();

        driver.switchTo().defaultContent();
        driver.switchTo().alert().sendKeys("learnmore");
        driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        String expectedResult = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String actualResult = driver.findElement(By.id("error")).getText();

        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("User selects the respective month")
    public void month(){

        driver.findElement(By.className("ui-datepicker-trigger")).click();

        while( !driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']/descendant::div[2]")).getText().contains("December")) {
            driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
        }
    }

    @When("User selects the value from Auto suggestive dropdown")
    public void selectValue(){

        driver.findElement(By.id("flying_from_N")).click();
        WebElement fromDropdown = driver.findElement(By.id("flying_from"));
        fromDropdown.sendKeys("che");

        int i=0;
        while(i<4) {
            fromDropdown.sendKeys(Keys.ARROW_DOWN);
        i++;
        }
        fromDropdown.sendKeys(Keys.ENTER);

    }



    @When("User selects the value from dynamic dropdown")
    public void user_selects_the_value_from_dynamic_dropdown() {
      driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
      driver.findElement(By.xpath("//a[@value='BLR']")).click();
//      WebElement fromElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//      fromElement.findElement(By.xpath("//a[@value='MAA']")).click();

      driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();

      String enableCondition = driver.findElement(By.id("marketDate_2")).getAttribute("style");

      if(enableCondition.contains("0.5")){
          
      }else{

      }

      driver.close();
    }


    @When("User selects the value from dropdown")
     void user_selects_the_value_from_dropdown() {

        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
        Select selectCurrency = new Select(currencyElement);
        selectCurrency.selectByValue("MYR");

        int currencyDropdownSize = currencyElement.findElements(By.tagName("option")).size();

        for(int i=0 ; i<currencyDropdownSize ;i++){

            String value = currencyElement.findElements(By.tagName("option")).get(i).getText();
            System.out.println(value);
        }

        List<WebElement> dropElements=currencyElement.findElements(By.tagName("option"));

        List<String> storeDrop = new ArrayList<String>();

        for (WebElement j:dropElements){  //hasNext()

            storeDrop.add(j.getText());

        }

    }


}

package reusable;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BrowserInvocation {

    private static WebDriver driver;
    public static WebDriver broswerCall() throws IOException {

       String path= System.getProperty("user.dir");

        System.out.println(path);

        FileInputStream fileInputStream = new FileInputStream(new File("D:\\Selenium\\8AMAutomationAuguest\\src\\main\\resources\\Configuration\\config.properties"));
        Properties prop = new Properties();

        prop.load(fileInputStream);

        if(prop.getProperty("Browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",path + "//src//main//resources//drivers//chromedriver.exe");
           driver = new ChromeDriver();
        }
        else if(prop.getProperty("Browser").equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        else{
           throw  new InvalidArgumentException("Provide the Correct browser name");
        }

        driver.manage().deleteAllCookies();
        driver.navigate().to(prop.getProperty("ApplicationURL"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        return driver;
    }

     public static int m1(){
        int a=1;

        return a;
    }

    public static String m2(){
        String s = "learn more";
        return s;
    }



}

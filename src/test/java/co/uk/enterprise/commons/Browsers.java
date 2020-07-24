package co.uk.enterprise.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers extends DriverLibrary {

    public WebDriver initChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

//    public WebDriver initSafari(){
//        WebDriverManager.safaridriver().setup();
//    }
}

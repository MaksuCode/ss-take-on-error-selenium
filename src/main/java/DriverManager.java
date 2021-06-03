import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    static String browser = System.getProperty("browser");
    static WebDriver driver ;

    public static WebDriver getDriver(){

        switch (browser){
            case "chrome" :
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox" :
                WebDriverManager.firefoxdriver().setup();
                driver = new ChromeDriver();
                break;
        }
        return driver ;
    }



}

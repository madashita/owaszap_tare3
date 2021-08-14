package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ChromeProxy implements IBrowser {

@Override
public WebDriver create(){
    String rutaDriver= "src/test/resources/driver/chromedriver.exe";
    System.setProperty("webdriver.chrome.driver", rutaDriver);

    //Proxy
    Map<String, Object> prefs= new HashMap<>();

    Proxy proxy= new Proxy();

    prefs.put("credentials_enable_service",false);
    proxy.setHttpProxy("127.0.0.1:8080");
    proxy.setSslProxy("127.0.0.1:8080");

    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    capabilities.setCapability("proxy", proxy);
    ChromeOptions options = new ChromeOptions();
    options.addArguments("ignore-certificate-errors");
    options.setExperimentalOption("prefs", prefs);

    capabilities.setCapability(ChromeOptions.CAPABILITY, options);

    ChromeDriver driver = new ChromeDriver(capabilities);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    return driver;
}
}



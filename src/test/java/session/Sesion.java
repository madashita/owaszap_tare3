package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Sesion {
    private static  Sesion sesion=null;
    private WebDriver driver;
    private Sesion(){
        driver = FactoryBrowser.make("proxy").create();
    }

    public static Sesion getInstance(){
        if(sesion == null)
                sesion = new Sesion();
        return sesion;
    }

    public void closeSesion(){
        driver.quit();
        sesion=null;
    }

    public WebDriver getDriver(){
        return driver;
    }

}

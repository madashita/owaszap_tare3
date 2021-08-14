package pageObject;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//div[1]/header/nav/div/ul[2]/li[1]/a"));
}

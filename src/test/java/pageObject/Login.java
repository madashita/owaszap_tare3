package pageObject;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class Login {
    public Button emailTextBox = new Button(By.id("email"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public TextBox loginButton = new TextBox(By.xpath("//*[@id=\"login_form\"]/button"));
}

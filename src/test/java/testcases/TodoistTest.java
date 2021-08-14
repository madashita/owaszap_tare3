package testcases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pageObject.Login;
import pageObject.MainPage;
import session.Sesion;

public class TodoistTest {

    MainPage mainPage = new MainPage();
    Login login = new Login();

    @BeforeEach
    public void before(){
        Sesion.getInstance().getDriver().get("http://todoist.com/");
    }

    @Test
    public void verifyProjectIsLogged(){
        mainPage.loginButton.click();
        login.emailTextBox.setValue("correo@prueba.com");
        login.passwordTextBox.setValue("123456");
        login.loginButton.click();

    }

    @AfterEach
    public void after(){
        Sesion.getInstance().closeSesion();
    }
}

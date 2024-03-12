package steps;

import io.cucumber.java.en.Given;
import pages.LoginPage;
public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    @Given("^Открыта страница авторизации: вводим логин \"([^\"]*)\", пароль \"([^\"]*)\"$")
    public void login(String login, String password) {
        loginPage.enterLoginAndPassword(login, password);
        loginPage.submitClick();
    }
}

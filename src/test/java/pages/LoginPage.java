package pages;

import base.Element;
import base.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final By loginInputLocator = By.xpath("//label[text()='Логин']/following-sibling::input");
    private final By passwordInputLocator = By.xpath("//label[text()='Пароль']/following-sibling::input");
    private final By headerLocator = By.xpath("//span[text()='Учебные материалы и тестирование']");
    private final By loginButtonLocator = By.xpath("//button[text()='Войти']");
    private final By registerButtonLocator = By.xpath("//a[text()='Регистрация']");
    private final int timeout = 5000;

    public LoginPage(String url) {
        Selenide.open(url);
    }

    public LoginPage() {

    }

    public MainPage login(String login, String password) {
        Input loginInput = new Input($(loginInputLocator));
        loginInput.shouldBe(Condition.visible, timeout);
        loginInput.setValue(login);
        Input passwordInput = new Input($(passwordInputLocator));
        passwordInput.shouldBe(Condition.visible, timeout);
        passwordInput.setValue(password);
        Selenide.sleep(timeout);
        Element loginBtn = new Element($(loginButtonLocator));
        loginBtn.click();
        Element lkLabel = new Element($(headerLocator));
        lkLabel.shouldBe(Condition.visible, timeout);
        return new MainPage();
    }

    public RegisterPage goToRegisterTab() {
        Input registerInput = new Input($(registerButtonLocator));
        registerInput.shouldBe(Condition.visible, timeout);
        registerInput.click();
        return new RegisterPage();
    }
}

package pages;

import base.Element;
import base.Input;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class RegisterPage {

    private final By nameInputLocator = By.xpath("//label[text()='Имя']/following-sibling::input");
    private final By loginInputLocator = By.xpath("//label[text()='Логин']/following-sibling::input");
    private final By passwordInputLocator = By.xpath("//label[text()='Пароль']/following-sibling::input");
    private final By roleDropdownLocator = By.xpath("//select[@id='role']");
    private final By headerLocator = By.xpath("//span[text()='Учебные материалы и тестирование']");
    private final By registerButtonLocator = By.xpath("//button[text()='Зарегистрироваться']");
    private final int timeout = 5000;

    public RegisterPage() {

    }

    public MainPage register(String name, String login, String password, String role) {
        Input nameInput = new Input($(nameInputLocator));
        nameInput.shouldBe(Condition.visible, timeout);
        nameInput.setValue(name);
        Input loginInput = new Input($(loginInputLocator));
        loginInput.shouldBe(Condition.visible, timeout);
        loginInput.setValue(login);
        Input passwordInput = new Input($(passwordInputLocator));
        passwordInput.shouldBe(Condition.visible, timeout);
        passwordInput.setValue(password);
        Element roleDropdown = new Element($(roleDropdownLocator));
        roleDropdown.click();
        sleep(2000);
        Element spinnerItem = new Element($(By.xpath(String.format("//option[text()='%s']", role))));
        spinnerItem.shouldBe(Condition.visible, timeout);
        spinnerItem.click();
        Selenide.sleep(timeout);
        Element registerBtn = new Element($(registerButtonLocator));
        registerBtn.click();
        Element lkLabel = new Element($(headerLocator));
        lkLabel.shouldBe(Condition.visible, timeout);
        return new MainPage();
    }
}

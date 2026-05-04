package pages;

import base.Element;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {

    private final By userDataLocator = By.xpath("//header//span[text()='Учебные материалы и тестирование']/following-sibling::span");
    private final By logoutLocator = By.xpath("//button[text()='Выйти']");
    private final By loginButtonLocator = By.xpath("//button[text()='Войти']");
    private final int timeout = 5000;

    public MainPage() {

    }

    public MainPage checkUserData(String name, String role) {
        String userData = new Element($(userDataLocator)).getInnerText();
        assertEquals(userData, String.format("%s · %s", name, role));
        return new MainPage();
    }

    public LoginPage logout() {
        Element logout = new Element($(logoutLocator));
        logout.shouldBe(Condition.visible, timeout);
        logout.click();
        Element yesBtn = new Element($(By.xpath("//button[text()='Да']")));
        yesBtn.shouldBe(Condition.visible, timeout);
        yesBtn.click();
        yesBtn.shouldBe(Condition.hidden, timeout);
        Element loginBtn = new Element($(loginButtonLocator));
        loginBtn.shouldBe(Condition.visible, timeout);
        return new LoginPage();
    }
}

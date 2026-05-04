package base;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebElementCondition;
import org.openqa.selenium.By;

import java.time.Duration;

public class Element {

    SelenideElement rootElement;

    public Element(SelenideElement selenideElement) {
        this.rootElement = selenideElement;
    }

    public String getInnerText() {
        return rootElement.getAttribute("innerText");
    }

    public String getAttribute(String attribute) {
        return rootElement.getAttribute(attribute);
    }

    public SelenideElement getRootElement() {
        return rootElement;
    }

    public SelenideElement findInternal(By locator, int index) {
        return rootElement.find(locator, index);
    }

    public SelenideElement findInternal(By locator) {
        return rootElement.find(locator);
    }

    public void click() {
        rootElement.click();
    }

    public void shouldBe(WebElementCondition condition, int timeout) {
        rootElement.shouldBe(condition, Duration.ofMillis(timeout));
    }
}
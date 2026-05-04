package base;

import com.codeborne.selenide.SelenideElement;

public class Input extends Element {

    public Input(SelenideElement selenideElement) {
        super(selenideElement);
    }

    public void setValue(String inputValue) {
        this.rootElement.clear();
        this.rootElement.sendKeys(inputValue);
    }
}
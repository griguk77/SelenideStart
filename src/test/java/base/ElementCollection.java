package base;

import com.codeborne.selenide.ElementsCollection;

public class ElementCollection {

    private ElementsCollection rootElement;

    public ElementCollection(ElementsCollection elementsCollection) {
        this.rootElement = elementsCollection;
    }

    public ElementsCollection getRootElement() {
        return rootElement;
    }
}
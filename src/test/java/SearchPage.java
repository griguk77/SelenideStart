import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

/**
 * Страница поиска Appleinsider.ru
 */
public class SearchPage {

    private final ElementsCollection articleTitles = $$x("//h2/a");

    public String getHref() {
        return articleTitles.first().getAttribute("href");
    }
}

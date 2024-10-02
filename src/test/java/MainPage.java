import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {

    private final SelenideElement searchInput = $x("//input");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public SearchPage search(String searchString) {
        searchInput.setValue(searchString);
        searchInput.sendKeys(Keys.ENTER);
        return new  SearchPage();
    }
}

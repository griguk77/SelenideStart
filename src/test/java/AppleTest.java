import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppleTest extends BaseTest {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";

    @Test
    public void checkHref() {
        assertTrue(
                new MainPage(BASE_URL)
                        .search(SEARCH_STRING)
                        .getHref()
                        .contains("iphone-13"));
    }
}

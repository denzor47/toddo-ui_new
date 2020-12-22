package todo.tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import todo.config.Config;

import static com.codeborne.selenide.Selenide.open;

public abstract class Base {
    @BeforeTest
    public void setup() {
        open(Config.baseUrl);
    }

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }
}
 
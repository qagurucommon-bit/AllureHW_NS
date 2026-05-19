import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static io.qameta.allure.Allure.attachment;

public class AttachmentsTest {

    @Test

    public void testLambdaAttachments() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу проекта AllureHW_NS", () -> {
            open("https://github.com/qagurucommon-bit/AllureHW_NS");
            attachment("Source", webdriver().driver().source());
        });

    }

    @Test
    public void testAnnotatedAttachments() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openProjectPage();
        steps.makeScreenShot();

    }
}

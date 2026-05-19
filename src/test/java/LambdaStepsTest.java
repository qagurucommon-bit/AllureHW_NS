import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class LambdaStepsTest {

    @Test
    public void testLambdaStep() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем страницу проекта AllureHW_NS", () -> {
            open("https://github.com/qagurucommon-bit/AllureHW_NS");
        });
        step("Нажимаем на таб Issue", () -> {
            $("#issues-tab").click();
        });
        step("Проверяем наличие New issue", () -> {
            $(withText("New issue")).should(Condition.exist);
        });
    }

    @Test
    public void testAnnotatedSteps() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openProjectPage();
        steps.clickTabIssue();
        steps.newIssueShouldBeVisible();
    }
}

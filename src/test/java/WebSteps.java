import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Открываем страницу проекта AllureHW_NS")
    public void openProjectPage() {
        open("https://github.com/qagurucommon-bit/AllureHW_NS");
    }

    @Step("Нажимаем на таб Issue")
    public void clickTabIssue() {
        $("#issues-tab").click();
    }

    @Step("Проверяем наличие New issue")
    public void newIssueShouldBeVisible() {
        $(withText("New issue")).should(Condition.exist);
    }

    @Attachment(value = "Скриншот", type = "image/png", fileExtension = "png")
    public byte[] makeScreenShot() {
        return ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }


}

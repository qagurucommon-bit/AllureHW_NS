import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LabelsTest {

    @Test
    @Feature("New Issue в проекте")
    @Story("Проверка наличия New Issue")
    @Owner("nelliS")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Github", url = "https://github.com/qagurucommon-bit/AllureHW_NS")
    @DisplayName("Проверка наличия New Issue для авторизованного пользователя")
    public void testStaticLabels() {

    }

    @Test
    public void testDynamicLabels() {
        Allure.getLifecycle().updateTestCase(t -> t.setName("Проверка наличия New Issue для авторизованного пользователя"));
        Allure.feature("New Issue в проекте");
        Allure.story("Проверка наличия New Issue");
        Allure.label("owner", "nelliS");
        Allure.label("severity", SeverityLevel.BLOCKER.value());
        Allure.link("Github", "https://github.com/qagurucommon-bit/AllureHW_NS");
    }
}

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideListener {

    @Test

    public void testIssueSearch() {

        open("https://github.com/qagurucommon-bit/AllureHW_NS");
        $("#issues-tab").click();
        $(withText("New issue")).should(Condition.exist);

    }
}

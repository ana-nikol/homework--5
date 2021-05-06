import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class homework {
    @Test
    public void homework1() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "files/chromedriver.exe");
        Configuration.startMaximized = true;
        Selenide.open("https://www.facebook.com/");
        $("._6ltg",1).click();
        $(byName("firstname")).setValue("ანა");
        $(byName("lastname")).setValue("ნიკოლაიშვილი");
        $(byName("reg_email__")).setValue("595280828");
        $(byName("reg_passwd__")).setValue("270691");
        $("#year").selectOption("1991");
        $("#day").selectOption("27");
        $("#month").selectOption("Jun");
        $("._58mt",2).click();
        $(byName("preferred_pronoun")).shouldBe(Condition.visible);
        $(byName("preferred_pronoun")).click();
        $(byName("preferred_pronoun")).selectOption("She: \"Wish her a happy birthday!\"");
        $(byText("Female")).click();
        $(byName("preferred_pronoun")).shouldBe(Condition.disappear);
        sleep(5000);
    }
}

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import com.codeborne.selenide.testng.TextReport;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.testng.ScreenShooter;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;

@Listeners({TextReport.class, ScreenShooter.class})
public class Test2 {
    @BeforeMethod
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
        ScreenShooter.captureSuccessfulTests = true;
    }
    @Test
    public void test2() throws Exception {
        //Configuration.browser = "chrome";
        open("https://www.yandex.ru");
        $(".input__control").setValue("test").pressEnter();
        screenshot("test2");

        Selenide.sleep(3000);
    }
}
import com.codeborne.selenide.logevents.SelenideLogger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.testng.ScreenShooter;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.testng.TextReport;

@Listeners({TextReport.class, ScreenShooter.class})
public class Setup {
    @BeforeMethod
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(true)
        );
        ScreenShooter.captureSuccessfulTests = true;
        /*Configuration.remote = "http://ppodsvcselenoid:zaq1XSWW@ggr01.dev.bench2.ppod.cbr.ru:4444/wd/hub";
        Configuration.driverManagerEnabled = false;*/
    }
}

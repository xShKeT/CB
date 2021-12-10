import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.testng.ScreenShooter;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.testng.TextReport;

@Listeners({TextReport.class, ScreenShooter.class})
public class CBTest extends Setup {
    @Test
    public void testSB() throws Exception {
        //Configuration.browser = "chrome";
        open("https://www.yandex.ru");
        $(By.xpath("//*[@id='text']")).setValue("сбербанк").pressEnter();
        //$(".input__control").setValue("test").pressEnter();
        $(By.xpath("//div/a[@href='https://online.sberbank.ru/']/following::div")).shouldBe(cssClass("VerifiedList"));
        $(By.xpath("//div/a[@href='https://online.sberbank.ru/']/following::div")).hover();
        $(By.xpath("//div[contains(@class, 'Popup2')]")).shouldBe(cssClass("Popup2"));
        screenshot("test1");
        Selenide.sleep(3000);
    }
}

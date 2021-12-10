import com.codeborne.selenide.Configuration;
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

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.FileDownloadMode.PROXY;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.testng.TextReport;

@Listeners({TextReport.class, ScreenShooter.class})
public class Test1 extends Setup{
    @Test
    public void test1() throws Exception {
        //Configuration.browser = "chrome";
        open("https://www.yandex.ru");
        $(By.xpath("//*[@id='text']")).setValue("test").pressEnter();
        //$(".input__control").setValue("test").pressEnter();
        screenshot("test1");
        Selenide.sleep(3000);
    }
}


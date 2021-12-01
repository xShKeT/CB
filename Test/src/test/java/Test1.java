import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test1 {
    @Test
    public void test1() throws Exception {
        open("https://www.yandex.ru");
        $(".input__control").setValue("test").pressEnter();
        TimeUnit.SECONDS.sleep(5);
    }
}

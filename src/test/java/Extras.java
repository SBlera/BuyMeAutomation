import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Extras extends BasePage {

    @Test
    public void ChooseGiftScrollPrtSc()  {
        try {
            StartAndNavigate.RunStartAndNavigate();
            Login.RunLoginOldUser();
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor) SingeltonDriver.getDriverInstance();
            js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            TakeScrShot("C:\\Users\\Lera\\Desktop\\BottomPage.png");
            SingeltonDriver.getDriverInstance().close();
        } catch (Exception e) {
            System.out.println("ChooseGiftScrollPrtSc failed" + e.getMessage());

        }
    }

    @Test

    public void TestMissingEmailError() {
            try {
            StartAndNavigate.RunStartAndNavigate();
            SingeltonDriver.getDriverInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember714\"]/div/ul[1]/li[3]/a/span[1]");
            InsertXpathAndClickScreenShotOnFail("//*[@id=\"ember1197\"]/button");
            WebElement MissingEmailError = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"parsley-id-12\"]"));
            String MissingEmailErrorUpadetd = MissingEmailError.getText();
            Assert.assertEquals("כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה", MissingEmailErrorUpadetd);
            WebElement MissingPasslError = SingeltonDriver.getDriverInstance().findElement(By.xpath("//*[@id=\"parsley-id-14\"]"));
            String MissingPasslErrorUpadetd = MissingPasslError.getText();
            Assert.assertEquals("כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה", MissingPasslErrorUpadetd);
            SingeltonDriver.getDriverInstance().close();
                System.out.println("TestMissingEmailError Passed");
            } catch (Exception e) {
            System.out.println("TestMissingEmailError failed" + e.getMessage());

            }
    }
}







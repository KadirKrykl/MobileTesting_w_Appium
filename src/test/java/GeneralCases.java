import com.thoughtworks.gauge.Step;

import java.util.concurrent.TimeUnit;

public class GeneralCases extends BaseTest{
    @Step("Sayfa güncellemesi için <second> sn bekle")
    public void acceptById(int second) {
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import org.openqa.selenium.By;

import java.util.HashSet;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class HomePage extends BaseTest {
    @Step("<key> id'li elemana tıkla ve izni kabul et")
    public void acceptById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("<key> id'li elemana tıkla ve bilet al sayfasına git")
    public void goToBookFlightById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

}

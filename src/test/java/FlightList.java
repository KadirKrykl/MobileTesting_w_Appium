import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FlightList extends  BaseTest{
    @Step("<key> xpath ile uçuşların listelendiği kontrol edilir")
    public void checkFlyList(String key){
        List<MobileElement> flyList = appiumDriver.findElements(By.xpath(key));
        assertTrue("Uçuşlar listesi", flyList.size()>0);
    }

    @Step("<key> xpath ile uçuşu veya tipini seç")
    public void selectFlyByXpath(String key) {
        appiumDriver.findElement(By.xpath(key)).click();
    }

    @Step("<key> id'li elemana devam etmek için tıkla")
    public void clickContinueById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }
}

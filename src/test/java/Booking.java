import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class Booking extends BaseTest{
    @Step("<key> id'li elemana tıkla ve tek gidiş seç")
    public void selectOneWayById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("<key> id'li elemana tıkla")
    public void clickById(String key) {
        appiumDriver.findElement(By.id(key)).click();
    }

    @Step("<key> id'li arama bölümüne <search> verisini gönder")
    public void searchById(String key, String search) {
        appiumDriver.findElement(By.id(key)).sendKeys(search);
    }

    @Step("<key> xpath'li elemanı seç")
    public void selectByXpath(String key) {
        appiumDriver.findElement(By.xpath(key)).click();
    }

    @Step("<key> xpath ile şu an seçili günü al ve <day> gün sonraki tarihi <target> ile seç")
    public void getDayByXpath(String key, int day, String target) {
        int CurrentDay = Integer.parseInt(appiumDriver.findElement(By.xpath(key)).getText());
        target = String.format(target, CurrentDay+day);
        appiumDriver.findElement(By.xpath(target)).click();
    }

    @Step("<key> xpath'li elemana <n> defa tıklanır ve yetişkin sayısı arttırılır")
    public void getDayByXpath(String key, int n) {
        for (int i = 0; i < n; i++) {
            appiumDriver.findElement(By.xpath(key)).click();
        }
    }
}

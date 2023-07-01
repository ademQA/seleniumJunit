package tests.day08_iFrame_windows_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q06 extends TestBase {
    @Test
    public void test01() {
        //1- Bir Class olusturalim KeyboardActions1
        //2- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        //3- Arama kutusuna actions method’larini kullanarak Samsung A71 yazdirin ve
        // Enter’a basarak arama yaptirin
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions=new Actions(driver);
        actions.moveToElement(aramaKutusuElementi).click().sendKeys("Samsung A71"+ Keys.ENTER).perform();
        //4- aramanin gerceklestigini test edin
        WebElement sonucElementi= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        Assert.assertFalse(sonucElementi.getText().isEmpty());
    }
}
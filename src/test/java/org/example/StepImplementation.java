package org.example;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest {
    @Step("<time> saniye bekle")
    public void waitTime(int time) throws InterruptedException {
        Thread.sleep(1000 * time);
    }

    @Step("<Element> Id'li elemente tıkla")
    public void clickElementById(String Element){
        appiumDriver.findElement(By.id(Element)).click();
        System.out.println(Element+" elementine tiklandi.");
    }

    @Step("<Element> CssSelector'lu elemente tıkla")
    public void clickElementByCssSelector(String Element){
        appiumDriver.findElement(By.cssSelector(Element)).click();
        System.out.println(Element+" elementine tiklandi.");
    }

    @Step("<Element> Xpath'li elemente tıkla.")
    public void clickElementByXpath(String Element){
        appiumDriver.findElement(By.xpath(Element)).click();
        System.out.println(Element+" elementine tiklandi.");
    }
    @Step("<Element> xpath'li elemente <Gönderi> değerini yaz")
    public void SendkeyElementByxpath(String Element,String Gönderi){
        appiumDriver.findElement(By.xpath(Element)).sendKeys(Gönderi);
        System.out.println(Element+" SendKey alanina gönderildi");
    }
    @Step("<Element> id'li elemente <Gönderi> değerini yaz")
    public void SendkeyElementByid(String Element,String Gönderi){
        appiumDriver.findElement(By.id(Element)).sendKeys(Gönderi);
        System.out.println(Element+" Elementine tıklandı");
    }
    @Step("<Element> kere scroll yap")
    public void ScrollThePage(int Element){
        while(Element>0){
            TouchAction scroll = new TouchAction(appiumDriver);
            scroll.press(400, 2500).moveTo(400, 500).release().perform();
            Element--;
        }
    }

}


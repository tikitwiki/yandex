package pages;

import com.codeborne.selenide.impl.WebElementSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collection;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BasicPage {


    public void clickElectronic() {
        $(By.xpath("//span[contains(text(), 'Электроника')]")).waitUntil(visible, 5 * 1000).click();
    }

    public void clickPhone() {
        $(By.xpath("//a[text() ='Мобильные телефоны']")).waitUntil(visible, 5 * 1000).click();
    }

    public void SalesScrollTo() {
        $(By.xpath("//span[@class = 'NVoaOvqe58 _1gAodJU0Dw' and text() ='В продаже']")).scrollTo().click();
    }

    public void XiaomiClick() {
        $(By.xpath(" //span[@class = 'NVoaOvqe58' and text() ='Xiaomi']")).scrollTo().click();

    }

    public void Xiaomivisible() {
        $(By.xpath(" //span[@class = 'NVoaOvqe58' and text() ='Xiaomi']")).waitUntil(visible, 5 * 1000);

    }

    public void HeaderScroll() {
        $(By.xpath("//h1[@title ='Мобильные телефоны']")).waitUntil(visible, 5 * 1000).scrollTo();
    }



    public void RamClick() {
        $(By.xpath("//span[@class = 'NVoaOvqe58' and text() ='64 ГБ']")).scrollTo().waitUntil(visible, 5 * 1000).click();
    }

    public void RampClick() {
        $(By.xpath("//span[@class = 'NVoaOvqe58' and text() ='6 Гб']")).scrollTo().waitUntil(visible, 5 * 1000).click();
    }

    public void ScreenClick() {
        $(By.xpath("//span[@class = 'NVoaOvqe58 _17C4Le-0TB' and text() ='1920×1080 (Full HD)']")).waitUntil(visible, 5 * 1000).click();
    }

    public void SizeClick() {
        $(By.xpath(" //legend[@class = 'ShXb4FpS5R' and text() ='Разрешение экрана']")).click();
    }

    public void Pickout() {
        $(By.xpath("/html//div[@id='search-prepack']//div[@class='uSBwpmLzLQ']/div[3]/div//div[@class='_178jz2CyDL']/div[15]/div/div[@class='_2Hue1bCg-N']/fieldset[@class='_3M70uokkTS']//button[@class='_1YeOF5Jcfi _2Wg9rE1HzR']")).click();
    }

    public void Input() {
        $(By.xpath("//input[@class = '_1JYTt02WxW' and @name ='Поле поиска']")).setValue("1920×1080").pressEnter();
    }

    public void XiaomiMiClick() {
        $(By.xpath("//img[@class= 'image' and @title= 'Смартфон Xiaomi Mi 6 6/64GB']")).scrollTo().waitUntil(visible, 5 * 1000).click();
    }

    public void Description() {
        $(By.xpath(" //a[@class= '_2qvOOvezty _19m_jhLgZR _2AJHXnAK2E' and  text() ='Все характеристики']")).click();
    }

    public void ScrAlt() {
        $(By.xpath("//div[@data-tid= '11be0d4a']/following-sibling::li[9]")).scrollTo().waitUntil(visible, 5 * 1000).scrollTo();
    }


    public void Processor() {
        $(By.xpath("//dd[@class= '_3PnEmnK2Ss'  and text() ='Adreno 540']")).scrollTo().isDisplayed();
    }

    public void Usb() {
        $(By.xpath("//dd[@class= '_3PnEmnK2Ss'  and text() ='USB Type-C']")).scrollTo().isDisplayed();
    }

}
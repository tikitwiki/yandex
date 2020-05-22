package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public void ModelClick(String text) {

        //модель
        $(By.xpath(" //span[@class = 'NVoaOvqe58' and text() ='" + text + "']")).scrollTo().click();

    }

    public void OperatClick(String text) {

        //оперативка
        $(By.xpath("//span[@class = 'NVoaOvqe58' and text() ='" + text + "']")).scrollTo().click();
    }

    public void MemoryClick(String text) {

        $(By.xpath("//span[@class = 'NVoaOvqe58' and text() ='" + text + "']")).scrollTo().click();
    }

    public void ExpansionClick(String text) {
        $(By.xpath("//span[@class = 'NVoaOvqe58 _17C4Le-0TB' and text() ='" + text + "']")).click();
    }

    public void InputClick(String text) {
        $(By.xpath("//input[@class = '_1JYTt02WxW' and @name ='Поле поиска']")).setValue(" + text + ").pressEnter();
    }
}

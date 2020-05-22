package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class BasePageTest {
    BasicPage basicPage = new BasicPage();

    @When("^clickElectronic$")
    public void ClickElectronic() {
        basicPage.clickElectronic();
        sleep(1000);
    }

    @When("^clickPhone$")
    public void clickPhone() {
        basicPage.clickPhone();
    }


    @When("^TimeoutClick$")
    public void timeout() {
        basicPage.clickElectronic();
        sleep(1000);
    }

    @When("^SalesScrollTo$")
    public void SalesScrollTo() {
        basicPage.SalesScrollTo();
    }

    @When("^XiaomiClickparameter$")
    public void xiaomiclick() {
        basicPage.XiaomiClick();

    }

    @When("^HeaderScroll$")
    public void HeagerScroll() {
        basicPage.HeaderScroll();

    }

    @Then("^Xiaomivisible$")
    public void Xiaomivisible() {
        basicPage.Xiaomivisible();
    }

    @When("^RamClickparameter$")
    public void ramclick() {
        basicPage.RamClick();
    }

    @When("RampClickparameter")
    public void RampClick() {
        basicPage.RampClick();
        sleep(800);
    }

    @When("^ScreenClick$")
    public void screenclick() {
        basicPage.ScreenClick();
    }

    @When("^SizeClick$")
    public void scrheaderclick() {
        basicPage.SizeClick();
    }

    @When("^ChooseExtension$")
    public void pickout() {
        basicPage.Pickout();
    }

    @When("^InputParameter$")
    public void input() {
        basicPage.Input();
    }

    @When("^XiaomiMiClick$")
    public void xiaomimiclick() {
        basicPage.XiaomiMiClick();
    }

    @When("^DescriptionParameter$")
    public void description() {
        basicPage.Description();
    }

    @When("^ProcessorParameter$")
    public void processor() {
        basicPage.Processor();


    }

    @When("^XiaomiClickc$")
    public void xiaomiclickc() {
        basicPage.XiaomiClick();
    }

    @Then("^Xiaomivisibleu$")
    public void xiaomivisibleu() {
        basicPage.Xiaomivisible();
    }

    @Then("^Usbparameter$")
    public void usb() {
        basicPage.Usb();
    }


    @Then("ScrAlt")
    public void scralt() {
        basicPage.ScrAlt();
    }
}

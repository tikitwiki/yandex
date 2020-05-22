package steps;

import cucumber.api.java.en.When;
import pages.SearchPage;

public class ParamSteps {

    SearchPage searhPage = new SearchPage();

    @When("Model {string} Click")
    public void modelClick(String arg0) {
        searhPage.ModelClick(arg0);
    }

    @When("Operat {string} Click")
    public void operatClick(String arg0) {
        searhPage.OperatClick(arg0);

    }

    @When("Memory {string} Click")
    public void memoryClick(String arg0) {
        searhPage.MemoryClick(arg0);
    }


    @When("Expansion {string} Click")
    public void expansionClick(String arg0) {
        searhPage.ExpansionClick(arg0);
    }
}

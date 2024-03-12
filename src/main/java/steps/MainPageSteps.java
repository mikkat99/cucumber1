package steps;

import io.cucumber.java.en.And;
import pages.MainPage;

public class MainPageSteps {
    final MainPage mainPage = new MainPage();
    @And("^Открываем страницу оформления заявки на новую командировку$")
    public void filterByAssignment(){
        mainPage.costsClick();
        mainPage.assignmentClick();
        mainPage.assignmentCreate();
    }
}

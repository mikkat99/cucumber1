package steps;

import io.cucumber.java.en.And;
import pages.FillingInTheFieldsAssertPage;
import utils.BasePage;

public class FillingInTheFieldsAssertSteps extends BasePage {
    FillingInTheFieldsAssertPage fillingInTheFieldsAssertPage = new FillingInTheFieldsAssertPage();

    @And("^Проверяем значения заполненных полей: город выбытия \"([^\"]*)\"$")
    public void assertFillingFieldCity(String arrivalCityName)  {
        fillingInTheFieldsAssertPage.assertFillingFieldTheCity(arrivalCityName);
    }

    @And("^Проверяем значения заполненных полей: дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void assertFillingFieldDate(String returnDate, String departureDate)  {
        fillingInTheFieldsAssertPage.assertFillingFieldTheDate(returnDate, departureDate);
    }

    @And("^Проверяем значения заполненных полей: чекбокс, подразделение \"([^\"]*)\"$")
    public void assertFields(String division)  {
        fillingInTheFieldsAssertPage.assertFillingField(division);
    }

    @And("^Проверяем отображение сообщения о наличии незаполненных полей")
    public void assertMessage() {
        fillingInTheFieldsAssertPage.assertMessage();
    }
}

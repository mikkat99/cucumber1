package steps;

import io.cucumber.java.en.And;
import pages.FillingInTheFieldsPage;

public class FillingInTheFieldsSteps {

    @And("^Выбираем подразделение")
    public void fillingFieldDivision() {
        FillingInTheFieldsPage fillingInTheFieldsPage = new FillingInTheFieldsPage();
        fillingInTheFieldsPage.divisionSelect();
    }

    @And("Выбираем организацию  \"([^\"]*)\"$")
    public void fillingFieldCompany(String division) {
        FillingInTheFieldsPage fillingInTheFieldsPage = new FillingInTheFieldsPage();
        fillingInTheFieldsPage.organizationSelect(division);
    }

    @And("Активируем чекбокс Заказ билетов")
    public void fillingFieldTickets() {
        FillingInTheFieldsPage fillingInTheFieldsPage = new FillingInTheFieldsPage();
        fillingInTheFieldsPage.checkBoxSelect();
    }

    @And("^Заполняем поля командировки: город выбытия \"([^\"]*)\", дата выбытия \"([^\"]*)\", дата прибытия \"([^\"]*)\"$")
    public void filledField(String inputArrivalCity, String departureDate, String returnDate) {
        FillingInTheFieldsPage fillingInTheFieldsPage = new FillingInTheFieldsPage();
        fillingInTheFieldsPage.fillingRemagFields(inputArrivalCity, departureDate, returnDate);
    }

    @And("Нажимаем сохранить и закрыть")
    public void saveAndClose() {
        FillingInTheFieldsPage fillingInTheFieldsPage = new FillingInTheFieldsPage();
        fillingInTheFieldsPage.saveAndClose();
    }
}

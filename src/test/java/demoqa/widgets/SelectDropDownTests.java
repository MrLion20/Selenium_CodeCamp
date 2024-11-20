package demoqa.widgets;

import demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropDownTests extends BaseTest {

@Test
    public void testMultiSelectDropDown(){
    var selectMenuPage = homePage.goToWidgets().clickSelectMenuPage();
    selectMenuPage.selectStandardMulti("Volvo");
    selectMenuPage.selectStandardMulti(1);
    selectMenuPage.selectStandardMulti("Audi");
    selectMenuPage.selectStandardMulti(2);
    selectMenuPage.deSelectStandardMulti("saab");

    List<String> actualSelectedOptions =
            selectMenuPage.getAllSelectedStandartOptions();

    Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
    Assert.assertTrue(actualSelectedOptions.contains("Opel"));
    Assert.assertFalse(actualSelectedOptions.contains("Saab"));
    Assert.assertTrue(actualSelectedOptions.contains("Audi"));

}
}

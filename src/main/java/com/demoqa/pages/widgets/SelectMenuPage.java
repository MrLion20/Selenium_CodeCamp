package com.demoqa.pages.widgets;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {
    private By stamdardMultiSelect = By.id("cars");


    public void selectStandardMulti(String text){
        scrollToElementJS(stamdardMultiSelect);
        //Select select = new Select(find(stamdardMultiSelect));
        //select.selectByVisibleText(text);
        selectByVisibleText(stamdardMultiSelect,text);
    }

    public void selectStandardMulti(int index){
        scrollToElementJS(stamdardMultiSelect);
        selectByIndex(stamdardMultiSelect,index);
    }

    public void deSelectStandardMulti(String value){
        scrollToElementJS(stamdardMultiSelect);
        deselectByValue(stamdardMultiSelect, value);
    }

    public List<String> getAllSelectedStandartOptions(){
        return getAllSelectedOptions(stamdardMultiSelect);

    }

}

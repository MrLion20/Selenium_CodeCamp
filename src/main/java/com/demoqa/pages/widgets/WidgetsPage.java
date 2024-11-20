package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {

    // Localizador para identificar el Item de 'Select Menu' en el listado de opciones del menu de Widgets.
    private By selectMenuItem = By.xpath("//li[@id=\"item-8\"]/span[text()='Select Menu']");

    public SelectMenuPage clickSelectMenuPage(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
}

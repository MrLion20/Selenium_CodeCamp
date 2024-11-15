package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    // Localizador para identificar el Item de 'Web Tables' en el listado de opciones del menu de Elements.
    private By webTablesMenuItem = By.xpath("//li[@id=\"item-3\"]/span[text()='Web Tables']");

    public WebTablePage clickWebTables(){
        click(webTablesMenuItem);
        return new WebTablePage();
    }
}


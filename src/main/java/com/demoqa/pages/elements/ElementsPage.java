package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {

    // Localizador para identificar el Item de 'Web Tables' en el listado de opciones del menu de Elements.
    private By webTablesMenuItem = By.xpath("//li[@id=\"item-3\"]/span[text()='Web Tables']");

    // Localizador para identificar el Item de 'Links' en el listado de opciones del menu de Elements.
    private By linksMenuItem = By.xpath("//li[@id=\"item-5\"]/span[text()='Links']");

    /**
     * Método para hacer clic en el ítem 'Web Tables' del menú 'Elements'.
     * Este método encuentra el elemento mediante el localizador 'webTablesMenuItem' y hace clic en él.
     * Luego, retorna una nueva instancia de la página WebTablePage, indicando que la acción ha sido realizada correctamente.
     * @return WebTablePage - Instancia de la página WebTablePage.
     */
    public WebTablePage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablePage();
    }
    /**
     * Método para hacer clic en el ítem 'Links' del menú 'Elements'.
     * Este método encuentra el elemento mediante el localizador 'linksMenuItem' y hace clic en él.
     * Luego, retorna una nueva instancia de la página LinksPage, indicando que la acción ha sido realizada correctamente.
     *
     * @return LinksPage - Instancia de la página LinksPage.
     */
    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}


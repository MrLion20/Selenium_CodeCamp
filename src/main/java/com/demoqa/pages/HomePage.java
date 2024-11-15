package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

// Clase HomePage
// Representa la página principal de la aplicación y contiene métodos para interactuar con sus elementos.
// Extiende de BasePage, lo que le proporciona acceso a métodos y propiedades comunes para las páginas.

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    // Localizador para identificar la tarjeta 'Forms' en la página principal.
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    /**
     * Método para navegar a la sección de Formularios (Forms) desde la página principal.
     * Pasos que realiza el método:
     * 1. Desplaza la vista hacia la tarjeta 'Forms' usando JavaScript para asegurarse de que sea visible.
     * 2. Hace clic en la tarjeta 'Forms' para interactuar con ella.
     * 3. Devuelve una instancia de la clase FormsPage, que representa la página de Formularios.
     *
     * @return FormsPage Una nueva instancia de FormsPage que permite interactuar con la página de Formularios.
     */
    public FormsPage goToForms(){
        // Desplaza la vista hacia el elemento 'Forms' utilizando la utilidad JavaScript.
        scrollToElementJS(formsCard);

        // Hace clic en el elemento 'Forms' para navegar a la página de Formularios.
        click(formsCard);

        // Retorna una nueva instancia de FormsPage, representando la página destino.
        return new FormsPage();

    }
}

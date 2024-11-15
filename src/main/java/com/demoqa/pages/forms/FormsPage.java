package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

// Clase FormsPage
// Representa la página de Formularios (Forms) y proporciona métodos para interactuar con sus elementos.
// Extiende de HomePage, heredando funcionalidades comunes para la navegación y manipulación de elementos.

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    // Localizador para el elemento del menú 'Practice Form' en la página de Formularios.
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");


    /**
     * Método para hacer clic en el elemento 'Practice Form' del menú.
     * Pasos que realiza el método:
     * 1. Desplaza la vista hacia el elemento 'Practice Form' para garantizar que sea visible.
     * 2. Hace clic en el elemento del menú.
     * 3. Devuelve una instancia de la clase PracticeFormPage, que representa la página del formulario de práctica.
     * @return PracticeFormPage Una nueva instancia de PracticeFormPage para interactuar con la página de formulario de práctica.
     */
    public PracticeFormPage clickPracticeForm(){
        // Desplaza la vista hacia el elemento del menú 'Practice Form' utilizando JavaScript.
        scrollToElementJS(practiceFormMenuItem);

        // Hace clic en el elemento del menú 'Practice Form'.
        click(practiceFormMenuItem);

        // Retorna una nueva instancia de PracticeFormPage, representando la página de destino.
        return new PracticeFormPage();
    }
}

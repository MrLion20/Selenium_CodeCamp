package com.demoqa.pages.forms;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

// Clase PracticeFormPage
// Representa la página del formulario de práctica y proporciona métodos para interactuar con sus elementos.
// Extiende de FormsPage, heredando funcionalidades para interactuar con los elementos de la página de Formularios.

public class PracticeFormPage extends FormsPage {

    // Localizador para el botón de opción 'Female' en el formulario.
    private By femaleRadioButtom = By.id("gender-radio-2");


    /**
     * Método para seleccionar la opción 'Female' en el formulario.
     * Pasos que realiza el método:
     * 1. Desplaza la vista hacia el botón de opción 'Female' para garantizar que sea visible.
     * 2. Hace clic en el botón de opción utilizando JavaScript, útil en caso de restricciones de clic convencional.
     */
    public void clickFemaleRadioButton(){
        // Desplaza la vista hacia el botón de opción 'Female' utilizando JavaScript.
        scrollToElementJS(femaleRadioButtom);

        // Hace clic en el botón de opción utilizando un clic con JavaScript.
        clickJS(femaleRadioButtom);
    }

    /**
     * Método para validar que la opción 'Female' en el formulario este seleccionada.
     * Pasos que realiza el método:
     * 1. Valida que el botón de opción 'Female' este seleccionado.
     */
    public boolean isFemaleSelected(){
        return find(femaleRadioButtom).isSelected();
    }

}

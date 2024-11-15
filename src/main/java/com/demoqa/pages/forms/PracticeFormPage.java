package com.demoqa.pages.forms;

import com.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

// Clase PracticeFormPage
// Representa la página del formulario de práctica y proporciona métodos para interactuar con sus elementos.
// Extiende de FormsPage, heredando funcionalidades para interactuar con los elementos de la página de Formularios.

public class PracticeFormPage extends FormsPage {

    // Localizador para el botón de opción 'Male' en el formulario.
    private By maleRadioButtom = By.id("gender-radio-1");

    // Localizador para el botón de opción 'Female' en el formulario.
    private By femaleRadioButtom = By.id("gender-radio-2");

    // Localizador para el botón de opción 'Other' en el formulario.
    private By otherRadioButtom = By.id("gender-radio-3");

    /**
     * Método para seleccionar la opción 'Male' en el formulario.
     * Pasos que realiza el método:
     * 1. Desplaza la vista hacia el botón de opción 'Male' para garantizar que sea visible.
     * 2. Hace clic en el botón de opción utilizando JavaScript, útil en caso de restricciones de clic convencional.
     */
    public void clickMaleRadioButton(){
        // Desplaza la vista hacia el botón de opción 'Male' utilizando JavaScript.
        scrollToElementJS(maleRadioButtom);

        // Hace clic en el botón de opción utilizando un clic con JavaScript.
        clickJS(maleRadioButtom);
    }

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
     * Método para seleccionar la opción 'Other' en el formulario.
     * Pasos que realiza el método:
     * 1. Desplaza la vista hacia el botón de opción 'Other' para garantizar que sea visible.
     * 2. Hace clic en el botón de opción utilizando JavaScript, útil en caso de restricciones de clic convencional.
     */
    public void clickOtherRadioButton(){
        // Desplaza la vista hacia el botón de opción 'Other' utilizando JavaScript.
        scrollToElementJS(otherRadioButtom);

        // Hace clic en el botón de opción utilizando un clic con JavaScript.
        clickJS(otherRadioButtom);
    }

    /**
     * Método para validar que la opción 'Female' en el formulario este seleccionada.
     * Pasos que realiza el método:
     * 1. Valida que el botón de opción 'Female' este seleccionado.
     */
    public boolean isFemaleSelected(){
        return find(femaleRadioButtom).isSelected();
    }
    /**
     * Método para validar que la opción 'Female' en el formulario este seleccionada.
     * Pasos que realiza el método:
     * 1. Valida que el botón de opción 'Female' este seleccionado.
     */
    public boolean isMaleSelected(){
        return find(maleRadioButtom).isSelected();
    }
    /**
     * Método para validar que la opción 'Female' en el formulario este seleccionada.
     * Pasos que realiza el método:
     * 1. Valida que el botón de opción 'Female' este seleccionado.
     */
    public boolean isOtherSelected(){
        return find(otherRadioButtom).isSelected();
    }

}

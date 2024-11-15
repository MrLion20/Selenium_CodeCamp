package demoqa.forms;

import demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

// Clase RadioButtonTests
// Clase de Casos de prueba que valida la funcionalidad de los botones de opción (Radio Buttons) en la página de formulario de práctica.
// Extiende de BaseTest para aprovechar las configuraciones de prueba base, como inicialización del navegador y configuración del entorno.

public class RadioButtonTests extends BaseTest {
    /**
     * TC001 - Verifica la selección del botón de opción 'Female' en el formulario de práctica.
     * Pasos de la prueba:
     * 1. Navega a la página de Formularios desde la página principal.
     * 2. Accede al formulario de práctica.
     * 3. Selecciona el botón de opción 'Female'.
     * 4. Valida que el botón de opción 'Female' este seleccionado.
     * Esta prueba asegura que el botón de opción puede ser interactuado correctamente.
     */
    @Test
    public void testFemaleRadioButton(){
        // Navega a la página de Formularios y luego al formulario de práctica.
        var formsPage = homePage.goToForms().clickPracticeForm();

        // Selecciona el botón de opción 'Female'.
        formsPage.clickFemaleRadioButton();

        // Validacion que el botón de opción 'Female' este seleccionado.
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected," Female RadioButton is Selected");
    }
    /**
     * TC002 - Verifica la selección del botón de opción 'Male' en el formulario de práctica.
     * Pasos de la prueba:
     * 1. Navega a la página de Formularios desde la página principal.
     * 2. Accede al formulario de práctica.
     * 3. Selecciona el botón de opción 'Male'.
     * 4. Valida que el botón de opción 'Male' este seleccionado.
     * Esta prueba asegura que el botón de opción puede ser interactuado correctamente.
     */
    @Test
    public void testMaleRadioButton(){
        // Navega a la página de Formularios y luego al formulario de práctica.
        var formsPage = homePage.goToForms().clickPracticeForm();

        // Selecciona el botón de opción 'Male'.
        formsPage.clickMaleRadioButton();

        // Validacion que el botón de opción 'Male' este seleccionado.
        boolean isMaleRadioButtonSelected = formsPage.isMaleSelected();
        Assert.assertTrue(isMaleRadioButtonSelected," Male RadioButton is Selected");
    }
    /**
     * TC003 - Verifica la selección del botón de opción 'Other' en el formulario de práctica.
     * Pasos de la prueba:
     * 1. Navega a la página de Formularios desde la página principal.
     * 2. Accede al formulario de práctica.
     * 3. Selecciona el botón de opción 'Other'.
     * 4. Valida que el botón de opción 'Other' este seleccionado.
     * Esta prueba asegura que el botón de opción puede ser interactuado correctamente.
     */
    @Test
    public void testOtherRadioButton(){
        // Navega a la página de Formularios y luego al formulario de práctica.
        var formsPage = homePage.goToForms().clickPracticeForm();

        // Selecciona el botón de opción 'Male'.
        formsPage.clickOtherRadioButton();

        // Validacion que el botón de opción 'Male' este seleccionado.
        boolean isOtherRadioButtonSelected = formsPage.isOtherSelected();
        Assert.assertTrue(isOtherRadioButtonSelected," Other RadioButton is Selected");
    }
}


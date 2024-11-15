package demoqa.forms;

import demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

// Clase RadioButtonTests
// Clase de prueba que valida la funcionalidad de los botones de opción (Radio Buttons) en la página de formulario de práctica.
// Extiende de BaseTest para aprovechar las configuraciones de prueba base, como inicialización del navegador y configuración del entorno.

public class RadioButtonTests extends BaseTest {

    /**
     * Prueba que verifica la selección del botón de opción 'Female' en el formulario de práctica.
     * Pasos de la prueba:
     * 1. Navega a la página de Formularios desde la página principal.
     * 2. Accede al formulario de práctica.
     * 3. Selecciona el botón de opción 'Female'.
     * Esta prueba asegura que el botón de opción puede ser interactuado correctamente.
     */
    @Test
    public void testRadioButton(){
        // Navega a la página de Formularios y luego al formulario de práctica.
        var formsPage = homePage.goToForms().clickPracticeForm();

        // Selecciona el botón de opción 'Female'.
        formsPage.clickFemaleRadioButton();

        // Validacion que el botón de opción 'Female' este seleccionado.
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected," Female RadioButton is Selected");
    }
}

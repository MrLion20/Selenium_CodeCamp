package demoqa.forms;

import com.demoqa.pages.forms.PracticeFormPage;
import demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

    /**
     * TC001 - Verifica la funcionalidad de los checkbox en el formulario de práctica.
     * Pasos de la prueba:
     * 1. Navega a la página de Formularios desde la página principal.
     * 2. Accede al formulario de práctica.
     * 3. Selecciona los checkboxes de 'Sports Hobby', 'Reading Hobby' y 'Music Hobby'.
     * 4. Desmarca el checkbox de 'Reading Hobby'.
     * 5. Valida que el checkbox de 'Reading Hobby' esté desmarcado.
     * Esta prueba asegura que los checkboxes pueden ser seleccionados y desmarcados correctamente.
     */
    @Test
    public void testCheckbox(){
        // Navega a la página de formularios y abre el formulario de práctica.
        var formsPage = homePage.goToForms().clickPracticeForm();

        // Selecciona los checkboxes de 'Sports Hobby', 'Reading Hobby' y 'Music Hobby'.
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();

        // Desmarca el checkbox de 'Reading Hobby'.
        formsPage.unclickReadingHobbyCheckbox();

        // Verifica si el checkbox de 'Reading Hobby' está desmarcado.
        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"El checkbox de 'Reading Hobby' debería estar desmarcado, pero está seleccionado.");
    }
}

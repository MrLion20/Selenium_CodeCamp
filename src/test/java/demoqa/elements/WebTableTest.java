package demoqa.elements;

import demoqa.base.BaseTest;
import org.testng.annotations.Test;
/**
 * Clase de prueba para la funcionalidad de la tabla web.
 * Verifica las operaciones básicas como edición de un registro.
 */
public class WebTableTest extends BaseTest {
    /**
     * TC001 - Verifica la funcionalidad de edición de un registro en la tabla web.
     * Pasos de la prueba:
     * 1. Navega a la página de elementos desde la página principal.
     * 2. Accede a la página de tabla web.
     * 3. Edita un registro con el email "alden@example.com".
     * 4. Cambia la edad del registro a "45".
     * 5. Envía los cambios realizados.
     * Esta prueba asegura que el flujo de edición de un registro funciona correctamente.
     */
    @Test
    public void testWebTable(){
        // Navega a la página de elementos y accede a la página de tabla web.
        var webTablePage = homePage.goToElementsPage().clickWebTables();

        // Edita el registro identificado por el email "alden@example.com".
        webTablePage.clickEdit("alden@example.com");

        // Cambia la edad a "45".
        webTablePage.setAge("80");

        // Guarda los cambios realizados en el registro.
        webTablePage.clickSubmitButton();

    }
}

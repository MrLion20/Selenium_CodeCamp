package demoqa.elements;

import com.demoqa.pages.HomePage;
import demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    /**
     * TC001 -Verificar el comportamiento de los enlaces en la página de Links.
     * Este método simula el clic en el enlace 'Bad Request', obtiene la respuesta del servidor
     * y valida que la respuesta contenga el código '400' y el mensaje 'Bad Request'.
     * Pasos:
     * 1. Navegar a la página de 'Elements' y hacer clic en el enlace 'Links'.
     * 2. Hacer clic en el enlace 'Bad Request'.
     * 3. Obtener la respuesta generada al hacer clic en el enlace.
     * 4. Verificar que la respuesta contiene '400' y 'Bad Request'.
     */
    @Test
    public void testLinks(){
        // 1. Navegar a la página de 'Elements' y hacer clic en el enlace 'Links'.
        var linksPage = homePage.goToElementsPage().clickLinks();

        // 2. Hacer clic en el enlace 'Bad Request'.
        linksPage.clickBadRequestLink();

        // 3. Obtener la respuesta generada al hacer clic en el enlace.
        String actualResponse = linksPage.getResponse();

        // 4. Verificar que la respuesta contiene '400' y 'Bad Request'.
        Assert.assertTrue(actualResponse.contains("400")&& actualResponse.contains("Bad Request"), "Actual Response("+actualResponse+") Does not Contain 400 and Bad Request");
    }
}

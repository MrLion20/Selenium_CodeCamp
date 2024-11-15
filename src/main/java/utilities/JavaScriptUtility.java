package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

// Clase JavaScriptUtility que extiende de la clase Utility
// Proporciona utilidades específicas para interactuar con elementos en una página web usando JavaScript.

public class JavaScriptUtility extends Utility{

    /**
     * Método estático que utiliza JavaScript para desplazar la vista hasta un elemento web específico.
     * @param locator Localizador del elemento web (By) al que se desea desplazar la vista.
     * El método:
     * 1. Encuentra el elemento web basado en el localizador proporcionado.
     * 2. Usa un script JavaScript para hacer que ese elemento sea visible en la vista actual.
     */

    public static void scrollToElementJS(By locator){
        // Encuentra el elemento web usando el localizador proporcionado.
        WebElement element = driver.findElement(locator);

        // Script JavaScript para desplazar la vista hasta el elemento web.
        String jsScript = "arguments[0].scrollIntoView();";

        // Ejecuta el script JavaScript en el navegador.
        ((JavascriptExecutor)driver).executeScript(jsScript, element);
    }

}

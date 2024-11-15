package utilities;

import com.base.BasePage;
import org.openqa.selenium.WebDriver;

// Clase Utility
// Proporciona funcionalidades generales que pueden ser reutilizadas en diferentes partes del proyecto.
// Actúa como una clase de soporte para gestionar el controlador WebDriver.

public class Utility {

    // Declaración de una variable estática para almacenar la instancia de WebDriver.
    public static WebDriver driver;

    /**
     * Método estático para inicializar el controlador WebDriver de esta clase.
     * Este método toma el controlador WebDriver de la clase BasePage y lo asigna
     * a la variable estática 'driver' de esta clase, haciendo que el controlador
     * esté disponible para otros métodos en Utility.
     */
    public static void setUtilityDriver(){
        // Asigna la instancia de WebDriver de la clase BasePage a esta clase.
        driver = BasePage.driver;
    }
}

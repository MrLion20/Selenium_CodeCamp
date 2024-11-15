package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// Clase BasePage
// Proporciona métodos comunes y reutilizables para interactuar con elementos web en una página.
// Sirve como clase base para todas las páginas del framework, ofreciendo funcionalidades básicas como encontrar, hacer clic y escribir en elementos web.

public class BasePage {
    // Instancia estática del controlador WebDriver para ser utilizada en todas las páginas.
    public static WebDriver driver;

    /**
     * Método para asignar un controlador WebDriver a la clase BasePage.
     * @param driver Instancia de WebDriver proporcionada para inicializar la clase.
     */
    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }

    /**
     * Método protegido para encontrar un elemento web en la página.
     * @param locator Localizador del elemento (By) que se desea encontrar.
     * @return WebElement El elemento web localizado.
     */
    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    /**
     * Método protegido para limpiar un campo de texto y escribir en él.
     * @param locator Localizador del elemento (By) donde se escribirá el texto.
     * @param text Texto que se desea escribir en el elemento.
     */
    protected void set(By locator, String text){
        // Limpia el contenido del campo antes de escribir el nuevo texto.
        find(locator).clear();
        // Escribe el texto en el elemento localizado.
        find(locator).sendKeys(text);
    }

    /**
     * Método protegido para hacer clic en un elemento web.
     * @param locator Localizador del elemento (By) que se desea hacer clic.
     */
    protected void click(By locator){
        find(locator).click();
    }

    /**
     * Método estático para pausar la ejecución por un tiempo determinado.
     * @param milliseconds Tiempo en milisegundos que se desea pausar.
     */
    public static void delay(int milliseconds){
        try {
            // Pausa la ejecución del hilo por el tiempo especificado.
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc){
            // Imprime la traza de la excepción si ocurre un error.
            exc.printStackTrace();
        }
    }
}

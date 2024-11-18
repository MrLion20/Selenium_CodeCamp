package com.demoqa.pages.elements;
import org.openqa.selenium.By;

/**
 * Página de la tabla web que extiende de ElementsPage.
 * Contiene elementos y acciones relacionadas con la interacción en la página de tabla web.
 */

public class WebTablePage extends ElementsPage {
    // Selector para el campo de edad en el formulario de registro.
    private By registrationAgeField = By.id("age");

    // Selector para el botón de envío en el formulario.
    private By submitButtom = By.id("submit");
    /**
     * Método para hacer clic en el botón de edición asociado a un registro basado en el email proporcionado.
     * Pasos que realiza el método:
     * 1. Ubica el botón de edición basado en el email en la tabla.
     * 2. Hace clic en el botón de edición correspondiente.
     * @param email el email que identifica el registro a editar.
     */
    public void clickEdit(String email){
        By edit = By.xpath("//div[text()='"+ email +"']//following::span[@title='Edit']");
        click(edit);
    }
    /**
     * Método para establecer un valor en el campo de edad en el formulario de registro.
     * Pasos que realiza el método:
     * 1. Encuentra el campo de edad por su selector.
     * 2. Ingresa el valor proporcionado.
     * @param age la edad que se desea establecer en el campo.
     */
    public void setAge(String age){
        set(registrationAgeField, age);
    }
    /**
     * Método para hacer clic en el botón de envío en el formulario.
     * Pasos que realiza el método:
     * 1. Encuentra el botón de envío por su selector.
     * 2. Hace clic en el botón para enviar el formulario.
     */
    public void clickSubmitButton(){
        click(submitButtom);
    }

    public String getTableAge(String email){
        By tableAge = By.xpath("//div[text()='"+ email +"']//preceding::div[1]");
        return find(tableAge).getText();
    }


}

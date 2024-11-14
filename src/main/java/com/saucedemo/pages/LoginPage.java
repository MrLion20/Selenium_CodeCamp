package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    // Aquí se seleccionan los elementos de la página que se necesitan para el proceso de Login
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login_button");
    private By errorMessage = By.xpath("//*[@id='login_button_container']/h3");

    /**
     * Método para ingresar texto en el campo de usuario en la pantalla de Login.
     * @param userName El nombre de usuario que se va a ingresar.
     */
    public void setUserName(String userName){
        set(usernameField, userName);
    }

    /**
     * Método para ingresar contraseña en el campo de password en la pantalla de Login.
     * @param password la contraseña del usuario que se va a ingresar.
     */
    public void setPassword(String password){
        set(passwordField, password);
    }

    /**
     * Método para darle clic al boton de Login
     */
    public void clicLoginButton(){
        click(loginButton);
    }





}

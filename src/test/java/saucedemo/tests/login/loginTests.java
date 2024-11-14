package saucedemo.tests.login;
import org.testng.Assert;
import org.testng.annotations.Test;
import saucedemo.base.BaseTest;

public class loginTests extends BaseTest {
    /**
     * Caso de prueba para verificar el mensaje de error mostrado en un intento fallido de inicio de sesión.
     * Pasos:
     * 1. Ingresar un nombre de usuario correcto y una contraseña incorrecta.
     * 2. Intentar iniciar sesión.
     * 3. Capturar el mensaje de error y validar que contenga el texto esperado.
     */
    @Test
    public void testLoginErrorMessage(){

        // Ingresar un nombre de usuario correcto y una contraseña incorrecta
        loginPage.setUserName("standard_user");
        loginPage.setPassword("ywjehu234");

        // Hacer clic en el botón de login para enviar la solicitud de inicio de sesión
        loginPage.clickLoginButton();

        // Obtener el mensaje de error y validar su contenido
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualMessage.contains("Epic sadface"), "El mensaje de error no coincide con el texto esperado.");
    }
}

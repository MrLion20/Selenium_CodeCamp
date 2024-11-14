package saucedemo.tests.products;

import com.saucedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {
    /**
     * Caso de prueba para verificar que el título de la página de productos se muestra correctamente
     * después de un inicio de sesión exitoso.
     * Pasos:
     * 1. Ingresar un nombre de usuario y una contraseña válidos.
     * 2. Iniciar sesión en la aplicación.
     * 3. Validar que el título "Products" sea visible en la pantalla.
     */
    @Test
    public void testProductsHeaderIsDisplayed(){
        // Ingresar las credenciales correctas usando el método de login en LoginPage.java
        ProductsPage productsPage = loginPage.
        logInToAplication("standard_user","secret_sauce");

        // Validar que el encabezado "Products" sea visible en la página
        assertTrue(productsPage.isProductsHeaderDisplayed(),"El encabezado de 'Products' no se muestra.");
    }
}

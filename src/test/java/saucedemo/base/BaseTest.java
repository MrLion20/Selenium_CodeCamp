package saucedemo.base;

import com.saucedemo.pages.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    // Variables utilizadas como base para todos los tests
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com/";

    // Configuración previa al inicio de las pruebas
    @BeforeTest
    public void setUp(){
        // Inicializa el driver de Chrome, maximiza la ventana y abre la URL base
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        // Instancia de las páginas base y login, asignando el driver a basePage
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }
    // Cierra el navegador después de finalizar todas las pruebas
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}

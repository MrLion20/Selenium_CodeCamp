package demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String demoqa_url = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        // Inicializa el driver de Chrome, maximiza la ventana
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        //Abre la URL
        driver.get(demoqa_url);

        // Instancia de las páginas base y login, asignando el driver a basePage
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }
    // Cierra el navegador después de finalizar todas las pruebas
    @AfterTest
    public void tearDown(){
        delay(3000);
        driver.quit();
    }
}

package Test;

import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;


import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClassExample {

    public static WindowsDriver CalculatorSession = null;
    public static WebElement CalculatorResult = null;

    @BeforeClass
    public static void Setup()
    {
        try {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("app","Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

        CalculatorSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);

        CalculatorSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        CalculatorResult = CalculatorSession.findElementByAccessibilityId("CalculatorResults");

        Assert.assertNotNull(CalculatorResult);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void Suma()
    {
        CalculatorSession.findElementByName("Uno").click();
        CalculatorSession.findElementByName("Más").click();
        CalculatorSession.findElementByName("Siete").click();
        CalculatorSession.findElementByName("Es igual a").click();

        Assert.assertEquals("8", GetCalculatorResult());

    }

    @Test
    public void Resta()
    {

        CalculatorSession.findElementByName("Nueve").click();
        CalculatorSession.findElementByName("Menos").click();
        CalculatorSession.findElementByName("Dos").click();
        CalculatorSession.findElementByName("Es igual a").click();

        Assert.assertEquals("7", GetCalculatorResult());


    }

    public String GetCalculatorResult()
    {
        return CalculatorResult.getText().replace("La pantalla muestra", "").trim();
    }

}

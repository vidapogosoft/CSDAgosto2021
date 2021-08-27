package Test;

import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.windows.WindowsDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClassWinForm {

    public static WindowsDriver NewSessionExe = null;

    @Test
    public void RegistroDatos()
    {

        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("app",
                    "E:\\Cursos\\2021\\SINERGIASS\\TestingBA\\AppWinForm1.exe");

            NewSessionExe = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);

            NewSessionExe.findElementByAccessibilityId("TxtDireccion").click();
                NewSessionExe.findElementByAccessibilityId("TxtDireccion").sendKeys("Miraflores");

            NewSessionExe.findElementByAccessibilityId("TxtIdentificacion").click();;
            NewSessionExe.findElementByAccessibilityId("TxtIdentificacion").sendKeys("0919172551001");

            NewSessionExe.findElementByAccessibilityId("TxtNombres").click();
            NewSessionExe.findElementByAccessibilityId("TxtNombres").sendKeys("Victor Daniel Portugal");

            NewSessionExe.findElementByAccessibilityId("RdCasado").click();

            NewSessionExe.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            NewSessionExe.findElementByName("Confirmar Datos").click();

            NewSessionExe.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            String TextIdentificacion = NewSessionExe.findElementByAccessibilityId("LblIdentificacion").getText();
            String TextNombres = NewSessionExe.findElementByAccessibilityId("LblNombres").getText();
            String TextDireccion = NewSessionExe.findElementByAccessibilityId("LblDireccion").getText();

            System.out.println(TextIdentificacion);
            System.out.println(TextNombres);
            System.out.println(TextDireccion);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @AfterClass
    public static void Cerrar()
    {
        if (NewSessionExe != null)
        {
            NewSessionExe.quit();
        }

        NewSessionExe = null;
    }

}

package Test;

import org.junit.*;
import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class TestClassMobile1 {

    public static RemoteWebDriver driver = null;

    @Test
    public void TestApp()
    {
        try {

            // la ruta de mi app a testear
            File app = new File("C:\\vidapogosoft\\cursos\\2021\\CSD\\"
                    ,"ContactManager.apk");


            DesiredCapabilities capability = new DesiredCapabilities();


            //OS Nombre

            capability.setCapability("platformName","Android");

            //nombre del devices

            capability.setCapability("device","RQ300729UE");
            capability.setCapability("deviceName","G3223");

            //Permisos del app
            capability.setCapability("autoGrantPermissions", true);
            capability.setCapability("allowTestPackages", true);

            //el path y nombre del app
            capability.setCapability("app",app.getAbsolutePath());

            //ruta del driver de appium para elaborar el start session
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capability);


            System.out.println("App Iniciada");
            System.out.println("Click Add Contact");

            //las manipulacione de los controles

            //click del boton

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Add Contact\"]")).click();


            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.EditText"))
                    .click();
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[4]/android.widget.EditText"))
                    .sendKeys("Vpr test Appium");



            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.EditText"))
                    .click();
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[6]/android.widget.EditText"))
                    .sendKeys("0960574445");


            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[8]/android.widget.EditText"))
                    .click();
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.TableLayout/android.widget.TableRow[8]/android.widget.EditText"))
                    .sendKeys("vidapogosoft@gmail.com");


            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Save\"]")).click();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}

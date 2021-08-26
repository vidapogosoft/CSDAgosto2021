package test;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_before_after_class {

    private static WebDriver driver = null;

    @BeforeClass
    public static void openbrowser()
    {
        System.out.print("Browser Open - 1 sola vez al inicio");

        System.setProperty("webdriver.chrome.driver"
                , "D://vidapogosoft//cursos//2021//SINERGIASS//CSD//herramientas//chromedriver.exe");

        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.sysnnovasolutions.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
    }


    @AfterClass
    public static void closebrowser()
    {
        System.out.print("\nBrowser close - 1 sola vez al final");
        System.out.print("\nFinaliza todo el proceso");

        driver.quit();
    }

    @Test
    public void TestHardAssert1()
    {
        System.out.println("Ejecuto test hard assert - 1");

        String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Browser App test";
        String ExpectedTitle = "Sysnnova Solutions";

        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

    @Test
    public void TestHardAssert2()
    {
        System.out.println("Ejecuto test hard assert - 2");

        String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Browser App test";
        String ExpectedTitle = "Sysnnova Solutions";

        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

}

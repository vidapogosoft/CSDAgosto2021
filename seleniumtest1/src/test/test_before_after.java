package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_before_after {

    private static WebDriver driver = null;

    @Test
    public void TestHardAssert1()
    {
        System.out.println("Ejecuto test hard assert 1");

        String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Browser App test";
        String ExpectedTitle = "Sysnnova Solutions";

        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }

    @Test
    public void TestHardAssert2()
    {
        System.out.println("Ejecuto test hard assert 2");

        String ActualTitle = driver.getTitle();
        //String ExpectedTitle = "Browser App test";
        String ExpectedTitle = "Sysnnova Solutions";

        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }

    @Before
    public void openbrowser()
    {

        System.out.print("Browser Open");

        System.setProperty("webdriver.chrome.driver"
                , "D://vidapogosoft//cursos//2021//SINERGIASS//CSD//herramientas//chromedriver.exe");

        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.sysnnovasolutions.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }

    @After
    public void closebrowser()
    {
        System.out.print("\nBrowser close");
        System.out.print("\nFinaliza todo el proceso");

        driver.quit();
    }

}

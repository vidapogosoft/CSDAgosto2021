package test_suite;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestForm {

    private static WebDriver driver = null;

    @BeforeClass
    public static void AbrirBrowser()
    {

        System.setProperty("webdriver.chrome.driver"
                ,"D://vidapogosoft//cursos//2021//SINERGIASS//CSD//herramientas//chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/automation-practice-form");
        
    }


    @Test
    public void ControlesNombres()
    {
        try {

        driver.findElement(By.id("firstName")).sendKeys("VPR");

        //gender-radio-2
        //radio button
        WebElement radioBtnMale = driver.findElement(By.id("gender-radio-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioBtnMale);

        //checkbox
        //hobbies-checkbox-1
        //hobbies-checkbox-3

        WebElement ChkHobbie1 = driver.findElement(By.id("hobbies-checkbox-1"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", ChkHobbie1);


        WebElement ChkHobbie3 = driver.findElement(By.id("hobbies-checkbox-3"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", ChkHobbie3);


        // //*[@id='dateOfBirthInput']dateOfBirthInput"]
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath("//*[@id='dateOfBirthInput']")));
        actions.click();

        actions.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE);

        Thread.sleep(3000);

        actions.sendKeys("12-10-1980");
        actions.sendKeys(Keys.ESCAPE);
        actions.build().perform();

        WebElement updElement = driver.findElement(By.id("uploadPicture"));
        updElement.sendKeys("D:\\vidapogosoft\\cursos\\2021\\SINERGIASS\\CSD\\Tallerdia3\\image001 (4).png");


        WebElement Select1 = driver.findElement(By.id("react-select-3-input"));
            Select1.sendKeys("NCR");
            Select1.sendKeys(Keys.TAB);


        WebElement Select2 = driver.findElement(By.id("react-select-4-input"));
            Select2.sendKeys("Delhi");
            Select2.sendKeys(Keys.TAB);


            Thread.sleep(3000);

        driver.findElement(By.id("submit")).click();

    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    }

    @Test
    public void ControlesDireccion()
    {
        driver.findElement(By.id("currentAddress")).sendKeys("GYE - AVENIDA MIRAFLORES");
        driver.findElement(By.id("userNumber")).sendKeys("0960578556");
        driver.findElement(By.id("lastName")).sendKeys("Portugal");
    }


    @AfterClass
    public static void CierreBrowser()
    {
        System.out.println("cerrar");

        driver.close(); //Cierra todas las ventanas

    }

}

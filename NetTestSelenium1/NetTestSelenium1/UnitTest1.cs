using Microsoft.VisualStudio.TestTools.UnitTesting;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;

using System;

namespace NetTestSelenium1
{
    [TestClass]
    public class UnitTest1
    {
        //public ChromeDriver driver = new ChromeDriver();

        public IWebDriver driver = new ChromeDriver(@"C:\vidapogosoft\Cursos\2021\SINERGIASS\TestingBA\");

        //defino el url del test
        public string url = "https://demoqa.com/automation-practice-form";


        [TestMethod]
        public void TestMethod1()
        {

            try
            {

                //defino ruta
                driver.Navigate().GoToUrl(url);
                driver.Manage().Window.Maximize();

                //Enventos hacia los controles de la pagina

                driver.FindElement(By.Id("firstName"));
                driver.FindElement(By.Id("firstName")).Click();
                driver.FindElement(By.Id("firstName")).SendKeys("Victor");

                driver.FindElement(By.Id("lastName")).SendKeys("Portugal");
                driver.FindElement(By.Id("userEmail")).SendKeys("victor.portugal@snergiass.com");
                driver.FindElement(By.Id("currentAddress")).SendKeys("GYE- Nor Oeste");


                //wait
                WebDriverWait wait = new WebDriverWait(driver, new TimeSpan(0, 0, 5));


                //Click al boton


                //driver.FindElement(By.Id("submit")).Click();

       
                driver.FindElement(By.CssSelector("#submit")).Click();


                //driver.Close();

            }
            catch (Exception ex)
            {

                ITakesScreenshot ScreenShotDrive = driver as ITakesScreenshot;

                Screenshot screenshot = ScreenShotDrive.GetScreenshot();

                screenshot.SaveAsFile("C:/vidapogosoft/Cursos/2021/SINERGIASS/TestingBA/"
                    + ex.Message + ".png");


                driver.Close();

            }

            
        }

       

    }
}

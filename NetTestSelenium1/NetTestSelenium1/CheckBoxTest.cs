
using NUnit.Framework;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

using System.Threading;


namespace NetTestSelenium1
{

   public class CheckBoxTest
    {


        [Test]
        public void TestMethod1()
        {

            // Create a new instance of the Firefox driver

            IWebDriver driver = new ChromeDriver(@"C:\vidapogosoft\Cursos\2021\SINERGIASS\TestingBA\");

           

            // Launch the URL
            driver.Url = "http://demo.guru99.com/test/radio.html";
            driver.Manage().Window.Maximize();

            Thread.Sleep(4000);


            // Se localiza el primer radio button por su id
            IWebElement radio1 = driver.FindElement(By.Id("vfb-7-1"));

            // Se localiza el segundo radio button por su id
            IWebElement radio2 = driver.FindElement(By.Id("vfb-7-2"));
            //Seleccionar el primer radio button
            radio1.Click();

            Thread.Sleep(6000);
            //El radio button 1 es deseleccionado y el segundo es seleccionado
            radio2.Click();


            IWebElement Check1 = driver.FindElement(By.Id("vfb-6-0"));

            // Se localiza el segundo radio button por su id
            IWebElement Check2 = driver.FindElement(By.Id("vfb-6-2"));

            Check1.Click();

            Thread.Sleep(6000);
            //El radio button 1 es deseleccionado y el segundo es seleccionado
            Check2.Click();

            // Kill the browser

            //driver.Quit();


        }
   }
}

using System;
using System.Collections.Generic;
using System.Text;
using System.Threading;
using NUnit.Framework;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

namespace NetSelenium1
{
    public class NUnittest
    {

        [Test]
        public void TestMethod1()
        {
            IWebDriver driver = new ChromeDriver(@"D:\vidapogosoft\cursos\2021\SINERGIASS\CSD\herramientas\");

            // Launch the URL
            driver.Url = "http://demo.guru99.com/test/radio.html";
            driver.Manage().Window.Maximize();

            Thread.Sleep(4000);

            // Se localiza el primer radio button por su id
            IWebElement radio1 = driver.FindElement(By.Id("vfb-7-1"));
            //Seleccionar el primer radio button
            radio1.Click();


        }

    }
}

using Microsoft.VisualStudio.TestTools.UnitTesting;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.Support.UI;

using System;
using System.Threading;

namespace NetSelenium1
{
    [TestClass]
    public class UnitTest1
    {
        public IWebDriver driver = new ChromeDriver(@"D:\vidapogosoft\cursos\2021\SINERGIASS\CSD\herramientas\");
        public string url = "https://demoqa.com/automation-practice-form";


        [TestMethod]
        public void TestMethod1()
        {
            //defino la ruta
            driver.Navigate().GoToUrl(url);
            driver.Manage().Window.Maximize();

            driver.FindElement(By.Id("firstName"));
            driver.FindElement(By.Id("firstName")).Click();
            driver.FindElement(By.Id("firstName")).SendKeys("Victor");

            //wait
            WebDriverWait wait = new WebDriverWait(driver, new TimeSpan(0, 0, 5));

            //Thread.Sleep(5000);

            
        }

        [TestMethod]
        public void TestMethod2()
        {
            //wait
            //WebDriverWait wait = new WebDriverWait(driver, new TimeSpan(0, 0, 5));

            //driver.Close();

            //driver.FindElement(By.Id("submit")).Click();

            //driver.FindElement(By.CssSelector("#submit")).Click();
        }
    }
}

﻿using NUnit.Framework;

using OpenQA.Selenium.Appium;
using OpenQA.Selenium.Appium.Windows;

using System;

namespace NetWinAppDriver1
{
    public class UnitTest3
    {

        private WindowsDriver<WindowsElement> _driver;

        [SetUp]
        public void TestInit()
        {

            var options = new AppiumOptions();
            options.AddAdditionalCapability("app", "C:\\vidapogosoft\\cursos\\2021\\CSD\\TesForm\\AppWinForm1.exe");
            options.AddAdditionalCapability("deviceName", "PORTUGALASUS");

            _driver = new WindowsDriver<WindowsElement>(new Uri("http://127.0.0.1:4723"), options);

            _driver.Manage().Timeouts().ImplicitWait = TimeSpan.FromSeconds(5);

        }

        [TearDown]
        public void TestCleanup()
        {
            if (_driver != null)
            {
                _driver.Quit();
                _driver = null;
            }
        }

        [Test]
        public void TestWIndows()
        {
            _driver.FindElementByAccessibilityId("TxtDireccion").Click();
            _driver.FindElementByAccessibilityId("TxtDireccion").SendKeys("GYE Nor Oeste");

            _driver.FindElementByAccessibilityId("TxtIdentificacion").Click();
            _driver.FindElementByAccessibilityId("TxtIdentificacion").SendKeys("0919172551");


            _driver.FindElementByName("Confirmar Datos").Click();

        }

    }
}

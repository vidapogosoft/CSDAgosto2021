using System;
using System.Threading;

using Xunit;
using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;


namespace NetXUnit1
{
    public class UnitTestSelenium : IDisposable
    {

        private IWebDriver _driver;

        public UnitTestSelenium()
        {

            _driver = new ChromeDriver(@"D:\vidapogosoft\cursos\2021\SINERGIASS\CSD\herramientas\");

            _driver.Navigate().GoToUrl("https://demoqa.com/login");

            _driver.Manage().Window.Maximize();

        }

        public void Dispose()
        {
            _driver.Quit();

        }

        [Theory]
        [InlineData("testuser_1", "Test@123")]
        [InlineData("testuser_2", "Test@153")]
        [InlineData("vpr", "vpr123")]
        public void Login(string u, string p)
        {
            IniciarSesion login = new IniciarSesion(_driver);

            login.IngresarUsuario(u);
            login.IngresarPassword(p);

            Thread.Sleep(5000);
            login.Iniciar();


            Thread.Sleep(5000);

            var actual = _driver.Url;

            Assert.Equal("https://demoqa.com/profile", actual);


        }


    }
}

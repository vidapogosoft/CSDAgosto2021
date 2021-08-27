using System;
using System.Collections.Generic;
using System.Text;

using OpenQA.Selenium;


namespace NetXUnit1
{
    public class IniciarSesion
    {
        private readonly string UserName = "userName";
        private readonly string Password = "password";
        private readonly string Login = "login";

        private IWebDriver _driver;

        public IniciarSesion(IWebDriver driver)
        {

            _driver = driver;
        }

        public void IngresarUsuario(string user)
        {
            var txtuser = _driver.FindElement(By.Id(UserName));

            txtuser.SendKeys(user);

        }

        public void IngresarPassword(string pwd)
        {
            var txtpwd = _driver.FindElement(By.Id(Password));

            txtpwd.SendKeys(pwd);
        }

        public void Iniciar()
        {
            var iniciarSesionElement = _driver.FindElement(By.Id(Login));

            iniciarSesionElement.Click();

        }

    }
}

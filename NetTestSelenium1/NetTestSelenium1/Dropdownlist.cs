using NUnit.Framework;

using OpenQA.Selenium;
using OpenQA.Selenium.Chrome;

using OpenQA.Selenium.Support.UI;

using System.Threading;

namespace NetTestSelenium1
{
    public class Dropdownlist
    {

        [Test]
        public void TestMethod1()
        {

            // Create a new instance of the Firefox driver

            IWebDriver driver = new ChromeDriver(@"C:\vidapogosoft\Cursos\2021\SINERGIASS\TestingBA\");



            driver.Navigate().GoToUrl("http://www.tizag.com/phpT/examples/formex.php");

            driver.Manage().Window.Maximize();

            IWebElement query = driver.FindElement(By.Name("Fname"));
            query.SendKeys("vpr");
            driver.FindElement(By.Name("Lname")).SendKeys("vidapogosoft");
            driver.FindElement(By.XPath("//input[@name='gender' and @value='Male']")).Click();
            driver.FindElement(By.XPath("//input[@name='food[]' and @value='Chicken']")).Click();
            driver.FindElement(By.Name("quote")).Clear();
            driver.FindElement(By.Name("quote")).SendKeys("Be Present!");


            // select the drop down list
            var education = driver.FindElement(By.Name("education"));
            //create select element object 
            var selectElement = new SelectElement(education);

            //select by value
            selectElement.SelectByValue("Jr.High");

            Thread.Sleep(5000);

            // select by text
            selectElement.SelectByText("HighSchool");

        }

    }
}

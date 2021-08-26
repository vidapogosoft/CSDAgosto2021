package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class testselenium {

    public static void main(String[] args) {

        try
        {

        System.setProperty("webdriver.chrome.driver"
                , "D://vidapogosoft//cursos//2021//SINERGIASS//CSD//herramientas//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.openfactapp.com");

        driver.findElement(By.id("LoginUser_UserName")).sendKeys("demo");
        driver.findElement(By.id("LoginUser_Password")).sendKeys("0430");

        Thread.sleep(5000);

        driver.findElement(By.id("LoginUser_LoginButton")).click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        Thread.sleep(5000);

        driver.get("https://admin-sysnnova.com/OpenFact/FastFactEmisor/DocumentosEmitidos.aspx");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

package org.example;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Main {
    WebDriver driver = new ChromeDriver();

    @Test
    public void Mymethod(){
        driver.get("https://www.travelsincoimbatore.com/");
        String s= driver.getTitle();
        System.out.print(s);
    }
    @Test
    public void login() {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("karthik");
        driver.findElement(By.name("inputPassword")).sendKeys("karthik");
        driver.findElement(By.className("signInBtn")).click();

    }
}

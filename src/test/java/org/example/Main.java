package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getTitle(),"Google","Title isn't match");
    }
}
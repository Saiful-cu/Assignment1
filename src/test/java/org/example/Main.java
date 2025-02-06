package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webDriver.chrome.driver","src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://www.google.com/");
        String Title = driver.getTitle();
        System.out.println(Title);
        if(Title.equals("Google")){
            System.out.println("Title Match");
        }else {
            System.out.println("Title MisMatch");
        }
        Assert.assertEquals(Title,"Google","Title isn't match");
        driver.quit();
    }
}
package homeworkS4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Hw2:
//goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
//1. u need to write down the code that can select  1 check box out of 4 mentioned,
//e.g option1 , option2 , option 3, option 4
//
//Note write down the logic in dynamic way i.e one change in if else condition can change ur selection
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.findElement(By.id("continue-with-click")).click();
        driver.manage().window().maximize();

        List<WebElement> webElements=driver.findElements(By.cssSelector("input.cb1-element"));
        for (WebElement webElement1:webElements){String options =webElement1.getAttribute("value");
            if (options.equalsIgnoreCase("Option-1")){webElement1.click();}}

        Thread.sleep(2000);
        driver.quit();




    }
}

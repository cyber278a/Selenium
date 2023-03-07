package homeworkS4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1:
//goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
//check if the checkbox    "click on this check box" is Selected
//if no  Select the checkbox
//check again if the checkbox is Selected or not
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        driver.findElement(By.id("continue-with-click")).click();
        driver.manage().window().maximize();

       WebElement webElement= driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean check1=webElement.isSelected();
        System.out.println("Before: "+check1);
        if(!webElement.isSelected()){webElement.click();}
      check1=webElement.isSelected();
        System.out.println("Now: "+check1);



    }
}

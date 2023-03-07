package homeworkS3;

//HW
//use xpath to complete this
//go to http://practice.syntaxtechs.net/basic-first-form-demo.php

//enter the message in the text box
//click on show message
//Enter value of a (edited)
//Enter value of B
//click on the button get total
//also please print the value of the attribute type of the button GET TOTAL
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.id("continue-with-click")).click();
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Please enter your ')]")).sendKeys("Good afternoon");
        driver.findElement(By.xpath("//button[@onclick='showInput();']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("7");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        WebElement gTotal=  driver.findElement(By.xpath("//button[text()='Get Total']"));
        System.out.println(gTotal.getAttribute("type"));



    }
}

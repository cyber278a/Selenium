package classS2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        // send in a username
        driver.findElement(By.id("email")).sendKeys("moazzam");
        // send the password
        driver.findElement(By.name("pass")).sendKeys("lalala");
// find forgotten password

        driver.findElement(By.partialLinkText("password")).click();

        //driver.findElement(By.linkText("Create new account")).click();
        driver.quit();


    }
}

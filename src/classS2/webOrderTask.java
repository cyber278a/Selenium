package classS2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //better always maximize the window
        driver.manage().window().maximize();
        //using different locators so we dont duplicate
        //id here
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //neme here
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //className here
        driver.findElement(By.className("button")).click();
    }
}

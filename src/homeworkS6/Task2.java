package homeworkS6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

//HW2
//1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
//2.Switch to the iframe on the page
//3.Clear the existing text in the  editor inside the iframe
//4.Enter the text "Hello World!" in the editor inside the iframe
//5.Switch back to the main page
public class Task2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        WebElement frame1=driver.findElement(By.cssSelector("iframe.tox-edit-area__iframe"));
        driver.switchTo().frame(frame1);

        WebElement textBox=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        textBox.clear();
        textBox.sendKeys("Hello World!");
         driver.switchTo().defaultContent();


    }
}

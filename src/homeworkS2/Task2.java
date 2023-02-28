package homeworkS2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//HW2
//navigate to fb.com
//click on create new account
//fill up all the textboxes
//click on sign up button
//close the pop up
//close the browser
//TIP for HW2:
//just fill in text boxes or button, no need to deal with other webElements
//also u will need a Thread.sleep after clcikng on create new account
//we will discuss "WHY" in future
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();
       Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("Sergey");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("923-666-9999");
        driver.findElement(By.id("password_step_input")).sendKeys("1234567");

        driver.findElement(By.id("birthday_month")).sendKeys("Jun");
        driver.findElement(By.id("birthday_day")).sendKeys("6");
        driver.findElement(By.id("birthday_year")).sendKeys("1978");

        driver.findElement(By.name("sex")).sendKeys("Male");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}

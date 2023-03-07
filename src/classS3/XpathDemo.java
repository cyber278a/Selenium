package classS3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();

        //find the username
       WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
        username.sendKeys("Tester");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

       // clear the username box using method clear
        username.clear();
// to get the name Username which is stored beside left to the username box
         WebElement usernameText=driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

       // get the name Password which is stored beside left to the password box

        WebElement passwordText=driver.findElement(By.xpath("//label[text()='Password:']"));
        String passText=passwordText.getText();
        System.out.println(passText);
    }
}

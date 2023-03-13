package classS5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        driver.findElement(By.id("continue-with-click")).click();

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //            use select class becuase this drop down has a select tag
        Select sel = new Select(dropDown);
//            using select class we have differnt methods to select the desired option
//            Select by index
        sel.selectByIndex(2);
        Thread.sleep(2000);

//            select by Value
        sel.selectByValue("Tuesday");
        Thread.sleep(2000);
//            select by visible text
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
    }
}

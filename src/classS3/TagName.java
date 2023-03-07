package classS3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

       // get all the links
        ////        we know that all links are in tag <a> which is also called anchor tag
        ////        lets use the locator By tagName for this purpose
        List <WebElement>tags=driver.findElements(By.tagName("a"));

        //   in order to print
      // we need to iterator
        for(WebElement tag:tags){
            String link = tag.getAttribute("href");
            System.out.println(link);
        }



    }
}

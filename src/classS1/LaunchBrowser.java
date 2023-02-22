package classS1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       // driver.get("https://www.google.com/");
        driver.get("https://www.facebook.com/");
        String URL=driver.getCurrentUrl();
// print out url

        System.out.println(URL);

        // get the title
        String title=driver.getTitle();
        System.out.println(title);

//make it sleep for 3 seconds
       // ALT-ENTER to make an exception
        Thread.sleep(3000);

        //close thw browser
        driver.quit();
    }
}
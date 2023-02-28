package classS1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
//maximize window
            driver.manage().window().maximize();
            //full screen
            driver.manage().window().fullscreen();

            driver.close();






        }}



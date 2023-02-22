package homeworkS1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    // * 1. launch the browser
    //     * 2. navigate to amazon website
    //     * 3. print out the title and the url in the console
    //     * 4. close the browser
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        String title=driver.getTitle();
        System.out.println(title);
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
        driver.close();
    }
}

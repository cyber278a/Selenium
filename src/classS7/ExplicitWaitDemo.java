package classS7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.findElement(By.id("continue-with-click")).click();
        //click on the start button
        driver.findElement(By.xpath("//button[@id='startButton']")).click();
//         as the element that contains text becomes visible after some
//        time, so first we need to implement the Explicit wait and then get the text

        WebDriverWait wait= new WebDriverWait(driver,20);
//        for selenium 4 only
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

//        once the element is visivle then get the text

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();
        System.out.println(WelcomeText);




    }
}

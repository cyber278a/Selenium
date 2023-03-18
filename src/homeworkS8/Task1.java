package homeworkS8;
//1.go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//username=Admin
//password=Hum@nhrm123
//2. click on PIM option
//3. from the table select Any  value of id and click the check box associated with it
//make sure that ur code is dynamic i.e
//changing the id doesnt effect the logic or xpath

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("continue-with-click")).click();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

       driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
       driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
       driver.findElement(By.cssSelector("input#btnLogin")).click();

       driver.findElement(By.xpath("//b[text()='PIM']")).click();
       List <WebElement> column=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i <column.size() ; i++) {
            String name=column.get(i).getText();
            if (name.equalsIgnoreCase("52384A")){
            System.out.println(name);
            System.out.println("Row for 52384A is "+(i+1));
             driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr["+(i+1)+"]/td[1]")).click();
        }}


}}

package homeworkS2;
//HW1:
//navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
//fill out the form
//click on register
//close the browser
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sergey");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("1 Main street");
        driver.findElement(By.id("customer.address.city")).sendKeys("New York");
        driver.findElement(By.id("customer.address.state")).sendKeys("NY");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11111");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("111-111-1111");
        driver.findElement(By.id("customer.ssn")).sendKeys("111-11-1111");

        driver.findElement(By.name("customer.username")).sendKeys("SergeyK");
        driver.findElement(By.name("customer.password")).sendKeys("55555");
        driver.findElement(By.name("repeatedPassword")).sendKeys("55555");

        driver.findElement(By.className("button")).click();

        driver.quit();
    }
}

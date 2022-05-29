import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        lastNameInput.sendKeys("Elkayal");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("last-name")).click();
        driver.findElement(By.id("job-title")).click();
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

        }
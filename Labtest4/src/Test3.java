import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Test
public void test3() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        WebElement jobTitleInput = driver.findElement(By.id("job-title"));
        firstNameInput.sendKeys("Omar");
        jobTitleInput.sendKeys("Engineer");
        driver.findElement(By.id("first-name")).click();
        driver.findElement(By.id("job-title")).click();

        }
        }

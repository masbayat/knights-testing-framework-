package tek.tdd.playgroundd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity1 {

     private WebDriver driver;

         @BeforeMethod
         public void initialBrowser(){
             driver = new ChromeDriver();
             driver.get("https://qa.insurance.tekschool-students.com/");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     }
     @Test
    public void testPageHeader(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
         WebElement pageHeaderElement = wait.until(ExpectedConditions.visibilityOfElementLocated
                 (By.xpath("//mat-toolbar/span[1]")));
         String actualPageHeader = pageHeaderElement.getText();
         Assert.assertEquals(actualPageHeader,"TEK Insurance Portal",
                 "Validate page header");
     }
     @AfterMethod
    public void closeBrowser(){
             driver.quit();
     }
}

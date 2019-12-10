package belajar;

import java.awt.Robot;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author devan
 */
public class Belajar {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver=null;
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.setProperty("webdriver.chrome.driver", 
                "E:\\data D\\KELAS 3\\PPL\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.1crmcloud.com/login.php");
      //  driver.get("http://10.10.20.2/ac_portal/default/pc.html?template=default&tabs=pwd&vlanid=0");
//      driver.get("http://10.10.20.2/ac_portal/default/pc.html?template=default&tabs=pwd&vlanid=0&ID=0&switch_url=&url=http://10.10.20.2/homepage/index.html&controller_type=&mac=00-01-e8-d7-d4-84");
        
        WebElement une = driver.findElement(By.name("user_name"));
        une.sendKeys("admin");
        une.sendKeys(Keys.TAB);
        WebElement pass = driver.findElement(By.name("user_password"));
        pass.sendKeys("admin");
        pass.sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        driver.findElement(By.className("default-avatar")).click();
        
        
        
    }
}
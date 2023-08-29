import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class HW_leumi {

    WebDriver wd;


    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/");
    }

    @Test
    public void testCss() throws UnsupportedEncodingException {

        WebElement we =wd.findElement(By.cssSelector(".first"));
        String str=we.findElement(By.cssSelector("span")).getText();

        System.out.println("Text leumi="+str);


    }




    @AfterMethod
    public void postcondition(){
//        wd.close();
//        wd.quit();
    }


}

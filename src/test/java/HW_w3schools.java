import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HW_w3schools {

    WebDriver wd;


    @BeforeMethod
    public void precondition(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }

    @Test
    public void testCss(){

           WebElement we =wd.findElement(By.cssSelector("#customers"));
        // print amount of table rows
           String str=we.findElement(By.cssSelector("tbody")).getAttribute("childElementCount");
          System.out.println("Row="+str);
        // print amount of table columns
        str=we.findElement(By.cssSelector("tr")).getAttribute("childElementCount");
        System.out.println("Columns="+str);
        int columns=Integer.parseInt(str);
        // find locator for the last column
        String test= wd.findElement(By.cssSelector("#customers tr:nth-child(2) td:last-child")).getText();
        System.out.println("Last column="+test);
        // find locator for the row3
        wd.findElement(By.cssSelector("#customers tr:nth-child(3) ")).getText();


    }




    @AfterMethod
    public void postcondition(){
//        wd.close();
//        wd.quit();
    }



}

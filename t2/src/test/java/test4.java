import org.example.SingInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test4
{
    public void test4()
    {
        //Вход стандартным пользователем
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        SingInPage pageSingIn=new SingInPage();
        pageSingIn.standartInput(driver);
        driver.quit();
    }
}

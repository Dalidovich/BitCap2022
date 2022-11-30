import org.example.InventoryPage;
import org.example.SingInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test2
{
    public void test2()
    {
        //Вход стандартным пользователем и добавление товаров корзину
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        SingInPage pageSingIn=new SingInPage();
        pageSingIn.standartInput(driver);



        InventoryPage pageInv=new InventoryPage();
        pageInv.addToBug(3,driver);
        driver.quit();
    }
}

import org.example.CartPage;
import org.example.InventoryPage;
import org.example.SingInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test3
{
    public void test3()
    {
        //Вход стандартным пользователем и добавление товаров корзину
        //Удаление товаров из корзины
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        SingInPage pageSingIn=new SingInPage();
        pageSingIn.standartInput(driver);

        InventoryPage pageInv=new InventoryPage();
        pageInv.addToBug(3,driver);
        pageInv.toCart(driver);

        CartPage pageCart=new CartPage();
        pageCart.removeProduct(2,driver);
        driver.quit();
    }
}

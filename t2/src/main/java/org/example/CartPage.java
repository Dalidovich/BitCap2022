package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage
{
     public void removeProduct(int count, WebDriver driver)
     {
         var items = driver.findElements(By.className("cart_item"));
         System.out.println(items);
         for (var i = 0; i < items.size(); i += 1)
         {
             if(count==0)
             {
                 break;
             }
             items.get(i).findElement(By.className("cart_button")).click();

             count-=1;
         }
     }
}

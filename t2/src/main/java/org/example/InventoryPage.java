package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class InventoryPage {
    public InventoryPage() {
    }

    public void addToBug(int count, WebDriver driver) {

        var items = driver.findElements(By.className("inventory_item"));
        for (var i = 0; i < items.size(); i += 1)
        {
            if(count==0)
            {
                break;
            }
            items.get(i).findElement(By.className("btn_inventory")).click();

            count-=1;
        }
    }
    public void toCart(WebDriver driver)
    {
        driver.findElement(By.id("shopping_cart_container")).click();
    }
}
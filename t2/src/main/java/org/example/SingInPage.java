package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SingInPage
{
    public SingInPage(){}
    public void standartInput(WebDriver driver)
    {
        var login="standard_user";
        var password="secret_sauce";
        inputLogin(login,driver);
        inputPassword(password,driver);
        submitButttonAct(driver);
    }
    public void lockedInput(WebDriver driver)
    {
        var login="locked_out_user";
        var password="secret_sauce";
        inputLogin(login,driver);
        inputPassword(password,driver);
        submitButttonAct(driver);
    }
    private void submitButttonAct(WebDriver driver)
    {
        var loginButton =driver.findElement(By.id("login-button"));
        loginButton.submit();
    }
    private void inputLogin(String login,WebDriver driver)
    {
        var loginInput =driver.findElement(By.id("user-name"));
        loginInput.sendKeys(login);
    }
    private void inputPassword(String password,WebDriver driver)
    {
        var passwordInput =driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }
}

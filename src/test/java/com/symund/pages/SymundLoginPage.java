package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SymundLoginPage {
    public SymundLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath="//input[@id='user']")
    public WebElement usernameInputBox;
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath="//input[@id='submit-form']")
    public WebElement loginBtn;


    @FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement wrongMessage;

    @FindBy(name="username")
    public  WebElement fillOutMessage;

    @FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")
    public WebElement eyeImg;

    @FindBy(id = "lost-password")
    public WebElement forgotPasswordLink;

    @FindBy(id = "reset-password-submit")
    public WebElement resetPasswordBtn;

}

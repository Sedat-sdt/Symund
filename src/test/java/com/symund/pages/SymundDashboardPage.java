package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SymundDashboardPage {
    public SymundDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//h2[@class='icon-files-dark']")
    public WebElement recommendedFiles;

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement usernameInitialLink;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logOutBtn;



}

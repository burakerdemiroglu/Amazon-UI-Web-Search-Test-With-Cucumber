package Amazon.Pages;

import Amazon.utils.Driver;
import Amazon.utils.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Helper {
    public Homepage (){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy (id="nav-logo-sprites")
    public WebElement homePageOpened;
    @FindBy (id="sp-cc-accept")
    public WebElement cookieBtn ;
    @FindBy (id="twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(id="nav-search-submit-button")
    public WebElement searchBtn;
    @FindBy(css=".a-color-state.a-text-bold")
    public  WebElement checksearch ;

    public void checkHomePagOpen(){
        Assert.assertTrue(homePageOpened.isDisplayed());
    }
    public void clickCookiebtn (){
        clickElement(cookieBtn);
    }
    public void clickSearchBox (String searchKeyword){
        sendKeysElement(searchBox,searchKeyword);
    }
    public void clickSearchBtn(){
        clickElement(searchBtn);
    }
    public void checksearchKeyword(String searchKeyword){
    Assert.assertEquals("\"" + searchKeyword + "\"",getText(checksearch));
    }
}

package ui_Layer;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.Utils.*;

public class SocialControllsPage {
    private final String G_EMAIL_FLD = "Email";
    private final String G_PASS_FLD = "Passwd";

    private WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @FindBy(css="a[onmousedown]")
    private WebElement yaEnterLink;

    @FindBy(name = "email")
    //@FindBy(css = "input.form_input[name=email]")
    private WebElement vkLoginFld;

    //@FindBy(id = "email")
    @FindBy(css = "#email")
    private WebElement fLoginFld;



    @FindBy(id = G_EMAIL_FLD)
    private WebElement gEmailFld;

    @FindBy (id = "login")
    private WebElement mLoginFld;

    //@FindBy (xpath = "//input[@id='b-domik_popup-username']")
    //@FindBy (css = "input.b-form-input__input[name=login]")
    @FindBy (css = "input[name=login]")
    private WebElement yaLoginFld;

    @FindBy (id = "field_email")
    private WebElement okLoginFld;

    @FindBy (id = "username_or_email")
    private WebElement tLoginFld;

    @FindBy(name = "pass")
    //@FindBy(css = "input.form_input[name=pass]")
    private WebElement vkPassFld;

    //@FindBy(id = "pass")
    @FindBy(css = "#pass")
    private WebElement fPassFld;

    @FindBy(css = "#Passwd")
    private WebElement gPassFld;

    @FindBy (id = "password")
    private WebElement mPassFld;

    //@FindBy (id = "b-domik_popup-password")
    @FindBy (css = "input[name=passwd]")
    private WebElement yaPassFld;

    @FindBy (id = "field_password")
    private WebElement okPassFld;

    @FindBy(id = "install_allow")
    private WebElement vkEnterBtn;

    @FindBy(css = "#next")
    private WebElement gNextBtn;

    @FindBy(css = "#signIn")
    private WebElement gEnterBtn;

    @FindBy (css = ".ui-button-main")
    private WebElement mEnterBtn;

    //@FindBy (xpath = "//input[@class='b-form-button__input'][@type='submit']")
    @FindBy (css = "button[type='submit']")
    private WebElement yaEnterBtn;

    @FindBy (xpath = "//input[@class='button-pro']")
    private WebElement okEnterBtn;

    @FindBy (id = "u_0_2")
    private WebElement fEnterBtn;

    //@FindBy (id = "allow")
    @FindBy (css = "#allow")
    private  WebElement tEnterBtn;

    public SocialControllsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void stepVkontakte(String login, String pass) {
        waitSleep(800);
        setTextAllJS(vkLoginFld, login);
        waitSleep(300);
        //*setTextJS(vkLoginFld, login);
        setTextJS(vkPassFld, pass);
        waitSleep(300);
        clickJS(vkEnterBtn);
    }

    public void stepGoogle(String login, String pass) {

        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(500);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(G_EMAIL_FLD)));
        setTextAllJS(gEmailFld, login);
        waitSleep(300);
        clickJS(gNextBtn);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(G_PASS_FLD)));
        setTextAllJS(gPassFld, pass);
        waitSleep(300);
        clickJS(gEnterBtn);
    }

    public void stepMailRu(String login, String pass) {
        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(800);
        setTextAllJS(mLoginFld, login);
        waitSleep(300);
        setTextAllJS(mPassFld, pass);
        waitSleep(300);
        clickJS(mEnterBtn);
    }

    public void stepYandex(String login, String pass) {
        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(800);
        //*clickJS(yaEnterLink);
        setTextAllJS(yaLoginFld, login);
        waitSleep(300);
        setTextAllJS(yaPassFld, pass);
        waitSleep(300);
        clickJS(yaEnterBtn);
    }

    public void stepOdnoklasniki(String login, String pass) {
        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(800);
        setTextAllJS(okLoginFld, login);
        waitSleep(300);
        setTextAllJS(okPassFld, pass);
        waitSleep(300);
        clickJS(okEnterBtn);
    }

    public void stepFacebook(String login, String pass) {
        //wait.until(ExpectedConditions.visibilityOf(fLoginFld));
        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(800);
        setTextAllJS(fLoginFld, login);
        waitSleep(300);
        setTextAllJS(fPassFld, pass);
        waitSleep(300);
        clickJS(fEnterBtn);
    }

    public void stepTwitter(String login, String pass) {
        //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
        waitSleep(800);
        setTextAllJS(tLoginFld, login);
        waitSleep(300);
        setTextAllJS(mPassFld, pass);
        waitSleep(700);
        //clickJS(tEnterBtn);
       //if (isElementPresent(By.id("allow"))) {
            clickJS(tEnterBtn);
        //}
        //System.out.println("Twitter auth clicked");
    }
}
package ui_Layer.blocks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Block;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import static core.Utils.clickJS;
import static core.Utils.clickJSAll;

@Block(@FindBy(css = ".globologin-box"))
@Name("Блок иконок GloboLogin Box\n")
public class GloboLoginForm extends HtmlElement {

    @FindBy (css = ".globologin-vk")
    @Name("Иконка 'vkontakte'\n")
    private WebElement vkIcon;

    @FindBy (css = ".globologin-fb")
    @Name("Иконка 'facebook'\n")
    private WebElement facebookIcon;

    @FindBy (css = ".globologin-mr")
    @Name("Иконка 'mailru'\n")
    private WebElement mailruIcon;

    @FindBy (css = ".globologin-tw")
    @Name("Иконка 'twitter'\n")
    private WebElement twitterIcon;

    @FindBy (css = ".globologin-ok")
    @Name("Иконка 'odnoklasniki'\n")
    private WebElement odnoklasnikiIcon;

    @FindBy (css = ".globologin-ya")
    @Name("Иконка 'yandex'\n")
    private WebElement yandexIcon;

    @FindBy (css = ".globologin-gg")
    @Name("Иконка 'google'\n")
    private WebElement googleIcon;

    @FindBy (css = ".globologin_more")
    @Name("Иконка 'больше соцсетей'\n")
    private  WebElement moreSS;

    public void clickVkIcon() {
        //clickJS(vkIcon);
        //System.out.println(vkIcon.isDisplayed());
        vkIcon.click();
        //? clickJSAll(vkIcon);
        //System.out.println("clicked JS");
    }

    public void clickFbIcon() {
        //clickJS(facebookIcon);
        facebookIcon.click();
    }

    public void clickMrIcon() {
        //clickJS(mailruIcon);
        mailruIcon.click();
    }

    public void clickOkIcon() {
        //clickJS(moreSS);
        //clickJS(odnoklasnikiIcon);
        odnoklasnikiIcon.click();
    }

    public void clickYaIcon() {
        //clickJS(moreSS);
        //clickJS(yandexIcon);
        yandexIcon.click();
    }

    public void clickGgIcon() {
        //clickJS(moreSS);
        //clickJS(googleIcon);
        googleIcon.click();
    }

    public void clickTwIcon() {
        //clickJS(moreSS);
        //clickJS(twitterIcon);
        twitterIcon.click();
    }
}

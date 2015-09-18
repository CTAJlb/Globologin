package assert_Layer;

import core.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import ui_Layer.BasePage;

import java.util.Set;

public class Check extends BasePage {

    private WebDriverWait wait = new WebDriverWait(Driver.get(), 10);

    @FindBy (css = "html>body>pre")
    private WebElement glLoggedText;

    public void checkUserLoggedViaGloboLogin(String expText, String mainWindowHandle) {

        wait.until(ExpectedConditions.visibilityOf(glLoggedText));
        //*wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("pre")));
        //waitSleep(250);
        Set<String> handles = Driver.get().getWindowHandles();
        if (handles.size() > 1) {
            System.out.println("Size Window handles more than ONE!");
            Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
            Driver.get().close();
            Driver.get().switchTo().window(mainWindowHandle);
        }
        //*wait.until(ExpectedConditions.visibilityOf(glLoggedText));
        //*System.out.println(glLoggedText.getText());
        Assert.assertEquals(glLoggedText.getText(), expText, "Wrong expected text\n");
        //*Assert.assertTrue(glLoggedText.getText().contains(expText), "Wrong expected text\n");
        System.out.print('*');
    }
}
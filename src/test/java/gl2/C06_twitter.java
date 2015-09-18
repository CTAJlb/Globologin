package gl2;

import TDP.TestDataProvider;
import assert_Layer.Check;
import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ui_Layer.HomePage;

public class C06_twitter extends BaseTest {

    private HomePage homePage;
    private Check check;

    @Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "C44576", dataProviderClass = TestDataProvider.class)
    public void loginViaGoogle(String socNetwork, String login, String pass, String expID) {

        Reporter.log("<br> 1) В форме авторизации справа вверху (#authorization_block) нажали на иконку 'Twitter'");
        homePage = new HomePage();

        String mainWindow = homePage.clickGlIcon(socNetwork);

        check = homePage.runStepAuthorization(socNetwork, login, pass, mainWindow);
        check.checkUserLoggedViaGloboLogin(expID, mainWindow);
    }
}

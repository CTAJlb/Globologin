package gl2;

import TDP.TestDataProvider;
import assert_Layer.Check;
import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ui_Layer.HomePage;

public class C07_mailRu extends BaseTest {

    private HomePage homePage;
    private Check check;

    @Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "C44572", dataProviderClass = TestDataProvider.class)
    public void loginViaMailRu(String socNetwork, String login, String pass, String expID) {

        Reporter.log("P1. TEST CASE name = <b>Авторизация под аккаунтом MailRu</b>");
        homePage = new HomePage();

        String mainWindow = homePage.clickGlIcon(socNetwork);

        check = homePage.runStepAuthorization(socNetwork, login, pass, mainWindow);
        check.checkUserLoggedViaGloboLogin(expID, mainWindow);
    }
}

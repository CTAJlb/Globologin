package gl2;

import TDP.TestDataProvider;
import assert_Layer.Check;
import core.BaseTest;
import core.RetryAnalyzer;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ui_Layer.HomePage;

public class C03_odnoklasniki extends BaseTest {

    private HomePage homePage;
    private Check check;

    @Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "C44573", dataProviderClass = TestDataProvider.class)
    public void loginViaOdnoklasniki(String socNetwork, String login, String pass, String expID) {

        Reporter.log("P1. TEST CASE name = <b>Авторизация под аккаунтом Однокласники</b>");
        homePage = new HomePage();

        String mainWindow = homePage.clickGlIcon(socNetwork);

        check = homePage.runStepAuthorization(socNetwork, login, pass, mainWindow);
        check.checkUserLoggedViaGloboLogin(expID, mainWindow);
    }
}

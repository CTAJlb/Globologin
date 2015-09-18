package ui_Layer;

import assert_Layer.Check;
import core.Config;
import core.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;
import ui_Layer.blocks.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

import static core.Utils.waitSleep;

public class HomePage extends BasePage {

    private GloboLoginForm gl;
    private SocialControllsPage sc;

    public static void open() {
        Driver.get().get(Config.getProperty("test.baseURL"));
        //#Driver.get().get(System.getProperty("test.baseURL"));
        waitSleep(3000);
    }

    public String clickGlIcon(String socNetwork) {
        switch (socNetwork) {
            case "vkontakte":
                gl.clickVkIcon();
                break;
            case "facebook":
                gl.clickFbIcon();
                break;
            case "mailru":
                gl.clickMrIcon();
                break;
            case "odnoklassniki":
                gl.clickOkIcon();
                break;
            case "yandex":
                gl.clickYaIcon();
                break;
            case "google":
                gl.clickGgIcon();
                break;
            case "twitter":
                gl.clickTwIcon();
                break;
            default:
                throw new AssertionError("unsupported social network identifier");
        }
        return Driver.get().getWindowHandle();
    }

    public Check runStepAuthorization(String socNetwork, String loginInput, String passInput, String mainWindow) {
        sc = new SocialControllsPage();
        waitSleep(800);
        //waitSleep(5000);
        //System.out.println("------------------------------------------------------------------------------");
        //System.out.println();
        //System.out.println("MAIN Window HANDLE:" + mainWindow);

        Set<String> handles = Driver.get().getWindowHandles();
//        System.out.println("HANDLES size: " + handles.size());

/*      Ожидание загрузки формы авторизации через соц. сеть или пока не выйдет время
        k - параметр времени, задавать в с(к = 10 == 10с)
  */
        int k = 0;
        while (handles.size() < 2){
            if (k > 35){
                break;
            }
            waitSleep(1000);
            k++;
        }
        String window1 = handles.toArray(new String[handles.size()])[0];
        String window2 = handles.toArray(new String[handles.size()])[1];
//        System.out.println("HANDLES size: " + handles.size());
//        System.out.println("window1:" + window1);
//        System.out.println("window2:" + window2);

        //System.out.println("HANDLES 1:");
        //System.out.println("Window count=" + handles.size());
        //System.out.println("  " + handles.toString());
        try {
            //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[1]);
            if (mainWindow.equals(window1)) {
                //Driver.get().switchTo().window(window2);
                //System.out.println("Windows IS equals");
            } else {
                System.out.println("Windows NOT equals");
                //***System.out.println("W1 " + window1);
                //***System.out.println("W2 " + window2);
                String tmp = window1;
                window1 = window2;
                window2 = tmp;
                //***System.out.println("W1 " + window1);
                //***System.out.println("W2 " + window2);
                //Driver.get().switchTo().window(window2);
            }
            Driver.get().switchTo().window(window2);
            //System.out.println("Window switched");
            try {
                switch (socNetwork) {
                    case "vkontakte":
                        sc.stepVkontakte(loginInput, passInput);
                        break;
                    case "google":
                        sc.stepGoogle(loginInput, passInput);
                        break;
                    case "mailru":
                        sc.stepMailRu(loginInput, passInput);
                        break;
                    case "yandex":
                        sc.stepYandex(loginInput, passInput);
                        break;
                    case "odnoklassniki":
                        sc.stepOdnoklasniki(loginInput, passInput);
                        break;
                    case "facebook":
                        sc.stepFacebook(loginInput, passInput);
                        break;
                    case "twitter":
                        sc.stepTwitter(loginInput, passInput);
                        break;
                    default:
                        throw new AssertionError("unsupported social network identifier");
                }
            } catch (RuntimeException re) {

                String filename = "PopUp_" + socNetwork + "_" + (System.currentTimeMillis()/1000) + ".png";
                File screenshot = new File("screenshots" + File.separator + filename);
                if (!screenshot.exists()) {
                    new File(screenshot.getParent()).mkdirs();
                    try {
                        screenshot.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    new FileOutputStream(screenshot).write(((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Written screenshot to: http://qatest-int-v.globo-tech.vpn/vulkan-cash/" + filename);
                Reporter.log("<br> Written screenshot to: <a target=\"_blank\" href=\"http://qatest-int-v.globo-tech.vpn/vulkan-cash/" + filename + "\">click to see this screenshot</a>");

                throw re;
            }
            //*System.out.println("USER LOGGED?");
        } catch (org.openqa.selenium.NoSuchWindowException noWinEx) {
            System.out.println("org.openqa.selenium.NoSuchWindowException!!!");

        } catch (NoSuchElementException noElEx) {
            System.out.println("org.openqa.selenium: No Such Element Exception!");
            System.out.println("Can not switch to need window");
            //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
            //*Driver.get().switchTo().window(window1);
            Driver.get().close();
        } catch (Exception e) {
            System.out.println();
            System.out.println("EXCEPTION:" + e.toString());
            /*
            String filename = "SocNetworkFail_" + (System.currentTimeMillis()/1000) + ".png";
            File screenshot = new File("screenshots" + File.separator + filename);
            if (!screenshot.exists()) {
                new File(screenshot.getParent()).mkdirs();
                try {
                    screenshot.createNewFile();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }
            try {
                new FileOutputStream(screenshot).write(((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES));
            } catch (FileNotFoundException fnfe) {
                fnfe.printStackTrace();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            System.out.println("Written screenshot to: http://qatest-int-v.globo-tech.vpn/vulkan-cash/" + filename);
            Reporter.log("<br> Written screenshot to: <a target=\"_blank\" href=\"http://qatest-int-v.globo-tech.vpn/vulkan-cash/" + filename + "\">click to see this screenshot</a>");
            */
            Driver.get().close();
        } finally {
            //*handles = Driver.get().getWindowHandles();
            //*System.out.println("f)[" + handles.toArray(new String[handles.size()])[0] + ",");
            //*System.out.println("  " + handles.toString());
            //*System.out.println("W1 " + window1);
            //*System.out.println("W2 " + window2);
            //Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
            Driver.get().switchTo().window(window1);
            //System.out.println("2) FINALLY");
            return new Check();
        }
        /*
        finally {
            Driver.get().switchTo().window(handles.toArray(new String[handles.size()])[0]);
            System.out.println("1) " + handles.toArray(new String[handles.size()])[0]);
            System.out.println("2) FINALLY");
            return new Check();
        } */
    }
}
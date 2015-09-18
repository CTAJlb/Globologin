package TDP;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataProvider {

    //Registration-Authorization with social network account
    @DataProvider(name = "C44570", parallel = false)
    public static Iterator<Object[]> createDataC44570() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"vkontakte", "+380685266123", "34hp9erio3h", "Array\n" +
                "(\n" +
                "    [network] => vkontakte\n" +
                "    [uid] => 215683971\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [profile] => http://vk.com/id215683971\n" +
                "    [identity] => http://vk.com/id215683971\n" +
                "    [email] => \n" +
                ")"});
        //*data.add(new Object[] {"C01_vkontakte", "+380685266123", "34hp9erio3h", Config.getProperty("test.currency"), "1404404857321"});
        return data.iterator();
    }

    @DataProvider(name = "C44571", parallel = false)
    public static Iterator<Object[]> createDataC44571() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"facebook", "alxttrv@yandex.ru", "34hkjdf23", "Array\n" +
                "(\n" +
                "    [network] => facebook\n" +
                "    [uid] => 100007170060104\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [profile] => http://www.facebook.com/100007170060104\n" +
                "    [identity] => http://www.facebook.com/100007170060104\n" +
                "    [email] => alxttrv@yandex.ru\n" +
                ")"});
        //*data.add(new Object[] {"C02_facebook", "alxttrv@yandex.ru", "34hkjdf23", Config.getProperty("test.currency"), "1404404895824"});
        return data.iterator();
    }

    @DataProvider(name = "C44572", parallel = false)
    public static Iterator<Object[]> createDataC44572() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"mailru", "alxttrv", "34hkjdf23", "Array\n" +
                "(\n" +
                "    [network] => mailru\n" +
                "    [uid] => 1581823648142294670\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [profile] => http://my.mail.ru/mail/alxttrv/\n" +
                "    [identity] => http://my.mail.ru/mail/alxttrv/\n" +
                "    [email] => alxttrv@mail.ru\n" +
                ")"});
        //*data.add(new Object[] {"mailru", "alxttrv", "34hkjdf23", Config.getProperty("test.currency"), "1404465788572"});
        return data.iterator();
    }

    @DataProvider(name = "C44573", parallel = false)
    public static Iterator<Object[]> createDataC44573() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"odnoklassniki", "alxttrv@gmail.com", "33esd4r21", "Array\n" +
                "(\n" +
                "    [network] => odnoklassniki\n" +
                "    [uid] => 555701172047\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [profile] => http://www.odnoklassniki.ru/profile/555701172047\n" +
                "    [identity] => http://www.odnoklassniki.ru/profile/555701172047\n" +
                "    [email] => \n" +
                ")"});
        //*data.add(new Object[] {"odnoklassniki", "alxttrv@gmail.com", "33esd4r21", Config.getProperty("test.currency"), "140440499851"});
        return data.iterator();
    }

    @DataProvider(name = "C44574", parallel = false)
    public static Iterator<Object[]> createDataC44574() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"yandex", "alxttrv", "34hkjdf23", "Array\n" +
                "(\n" +
                "    [network] => yandex\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [login] => alxttrv\n" +
                "    [email] => alxttrv@yandex.ua\n" +
                "    [gender] => M\n" +
                "    [identity] => http://openid.yandex.ru/alxttrv/\n" +
                "    [uid] => 81acef1d0ff3aed865ee77f586332383\n" +
                ")"});
        //*data.add(new Object[] {"yandex", "alxttrv", "34hkjdf23", Config.getProperty("test.currency"), "1404465788572"});
        return data.iterator();
    }

    @DataProvider(name = "C44575", parallel = false)
    public static Iterator<Object[]> createDataC44575() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"google", "alxttrv@gmail.com", "329hfw321", "Array\n" +
                "(\n" +
                "    [network] => google\n" +
                "    [uid] => 117725056410413536497\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => Tatarnikov\n" +
                "    [profile] => https://plus.google.com/117725056410413536497\n" +
                "    [identity] => https://plus.google.com/117725056410413536497\n" +
                "    [email] => alxttrv@gmail.com\n" +
                ")"});
        //*data.add(new Object[] {"google", "alxttrv@gmail.com", "329hfw321", Config.getProperty("test.currency"), "1404405101852"});
        return data.iterator();
    }

    @DataProvider(name = "C44576", parallel = false)
    public static Iterator<Object[]> createDataC44576() {
        List<Object[]> data = new ArrayList<Object[]>();
        data.add(new Object[]{"twitter", "alxttrv@gmail.com", "34hkjdf23", "Array\n" +
                "(\n" +
                "    [network] => twitter\n" +
                "    [uid] => 1548301658\n" +
                "    [first_name] => Alexandr\n" +
                "    [last_name] => \n" +
                "    [profile] => http://twitter.com/alxttrv\n" +
                "    [identity] => http://twitter.com/alxttrv\n" +
                "    [email] => \n" +
                ")"});
        //*data.add(new Object[] {"twitter", "alxttrv@gmail.com", "34hkjdf23", Config.getProperty("test.currency"), "1404404252270"});
        return data.iterator();
    }
}
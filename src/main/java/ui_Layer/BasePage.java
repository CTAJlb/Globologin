package ui_Layer;

import core.Driver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

public abstract class BasePage {

    protected BasePage() {
        HtmlElementLoader.populatePageObject(this, Driver.get());
    }
}

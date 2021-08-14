package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String typeBrowser) {
        IBrowser browser;
        switch (typeBrowser) {
            case "chrome":
                browser = new Chrome();
                break;
            case "proxy":
                browser = new ChromeProxy();
                break;
            case "firefox":
                browser = new Firefox();
                break;
            default:
                browser = new Chrome();
                break;
        }
        return  browser;
    }
}

public class BrowserConfig {
    // Câmpuri private
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // Constructor 1
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor 2 - browser & version
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // Constructor 3 - doar browser
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }

    // Metoda factory
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de afișare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}
// TestConfigRunner.java
public class TestConfigRunner {
    public static void main(String[] args) {
        // toti parametrii
        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX, "120.0", true);

        // browser și versiune
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "118.5");

        // doar browser
        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME);

        // metoda statică
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        // Afișare pentru fiecare obiect
        config1.afiseazaConfig();
        config2.afiseazaConfig();
        config3.afiseazaConfig();
        config4.afiseazaConfig();
    }
}

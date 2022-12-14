package br.com.codetalker.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import br.com.codetalker.settings.Settings;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {
    Settings settings = new Settings();

    public WebDriver getDriver(String browser) throws Exception {
        switch (browser) {
            case "chrome":
                return this.getChromeDriver();
            case "firefox":
                return this.getFirefoxDriver();
            default:
                throw new Exception("No browser found!");
        }
    }

    private WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.setBinary(this.settings.chromeBrowserPath());
        return new ChromeDriver(options);
    }

    private WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        FirefoxBinary binary = new FirefoxBinary(
                this.settings.firefoxBrowserPath());
        options.setBinary(binary);
        return new FirefoxDriver(options);
    }
}

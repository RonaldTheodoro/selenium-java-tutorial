package br.com.codetalker;

import org.openqa.selenium.WebDriver;

import br.com.codetalker.drivers.Drivers;

public class App {

    public static void main(String[] args) throws Exception {
        Drivers drivers = new Drivers();

        WebDriver driver = drivers.getDriver("firefox");

        driver.get("https://www.google.com");

        driver.quit();
    }
}

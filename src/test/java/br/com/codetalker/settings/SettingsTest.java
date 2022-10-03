package br.com.codetalker.settings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SettingsTest {

    @Test
    public void testChromedriver() {
        Settings settings = new Settings();
        assertEquals(
            settings.chromedriver(),
            "/home/ronaldtheodoro/.local/bin/chromedriver"
        );
    }

    @Test
    public void testGeckodriver() {
        Settings settings = new Settings();
        assertEquals(
            settings.geckodriver(),
            "/home/ronaldtheodoro/.local/bin/geckodriver"
        );
    }
}
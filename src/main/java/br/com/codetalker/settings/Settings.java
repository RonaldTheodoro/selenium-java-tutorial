package br.com.codetalker.settings;

import java.io.File;

public class Settings {
    public String chromedriver() {
        return "/home/ronaldtheodoro/.local/bin/chromedriver";
    }

    public String geckodriver() {
        return "/home/ronaldtheodoro/.local/bin/geckodriver";
    }

    public File chromeBrowserPath() {
        return new File("/usr/bin/google-chrome-stable");
    }

    public File firefoxBrowserPath() {
        return new File("/usr/bin/firefox");
    }
}
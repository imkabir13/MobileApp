package demo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Cloud
{
    public static String userName = "imrankabir1";
    public static String accessKey = "XDw4BznEpfkFaWtJSUFX";

    public static void main(String args[]) throws MalformedURLException, InterruptedException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy Note 10 Plus");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "Mobilitas Self-service App");
        caps.setCapability("build", "Build: 02");
        caps.setCapability("name", "Sample Test");
        caps.setCapability("app", "bs://08ac32e9b2431ceb76fa2336aea55a1a47e61fef");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        /* Write your Custom code here */

        Thread.sleep(7000);

        driver.quit();
    }
}

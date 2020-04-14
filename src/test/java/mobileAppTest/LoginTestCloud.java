package mobileAppTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTestCloud
{
    public static String userName = "imrankabir1";
    public static String accessKey = "XDw4BznEpfkFaWtJSUFX";

    @Test
    public void loginTestCloud() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "Mobilitas Self-service app");
        caps.setCapability("build", "Build 3");
        caps.setCapability("name", "Sample Test");
        caps.setCapability("app", "bs://e15dec892d38cda8d852d11ea367d93136153e77");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        System.out.println("Application launch...!!");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // android.view.View[@attribute=""]

        driver.findElement(By.xpath("//android.widget.EditText[@text='Username']")).setValue("username");
        System.out.println("Entered username...");
        driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).setValue("fhdhsdgh");
        System.out.println("Entered password....");
        driver.findElement(By.xpath("//android.widget.Button[@text='Login']")).click();
        System.out.println("Click on the Login button.....");
        Thread.sleep(2000);
        String text = driver.findElement(By.xpath("//android.widget.TextView[@text='Invalid username or password!']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//android.widget.Button[@text='Close']")).click();

        Thread.sleep(5000);

        driver.quit();
        System.out.println("App session is killed.");
    }
}

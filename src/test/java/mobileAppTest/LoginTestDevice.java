package mobileAppTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginTestDevice
{
    @Test
    public void loginTest() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        AppiumDriver<MobileElement> driver = null;
        final String APP_PATH = "/Users/imrankabir/IdeaProjects/Appium_project/src/main/resources/app-debug.apk";

        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
        capabilities.setCapability(MobileCapabilityType.APP, APP_PATH);

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

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

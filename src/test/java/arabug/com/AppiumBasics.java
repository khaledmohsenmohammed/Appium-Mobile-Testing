package arabug.com;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class AppiumBasics {
    @Test
    public void AppTest() throws URISyntaxException, MalformedURLException {
        //Android driver & IOS driver
        //add the appium driver will be used it
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Pixel7Pro");
        String appURL = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "res"
                + File.separator + "ApiDemos-debug.apk";
        System.getProperty(">>>>>>>>>>>>>>>>>>>>>>>>>>>" + appURL);
        options.setApp(appURL);

        AndroidDriver driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(),options);
        //driver.quit();
    }


}

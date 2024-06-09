import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class Module1 {


        private AndroidDriver driver;

        @Before
        public void setUp() throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("ensureWebviewsHavePages", true);

            URL remoteUrl = new URL("http://localhost:4723/wd/hub");

            driver = new AndroidDriver(remoteUrl, desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }

        @Test
        public void sampleTest() {
            MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.Button[2]");
            el1.click();
            MobileElement btnSubmit = (MobileElement) driver.findElementById("com.anydog.t2m.test:id/btnSubmit");
            btnSubmit.isDisplayed();

        }

        @After
        public void tearDown() {
            driver.quit();
        }


}

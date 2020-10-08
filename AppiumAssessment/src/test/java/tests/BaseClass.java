package tests;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDRIOD");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		caps.setCapability(MobileCapabilityType.UDID, "");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability(MobileCapabilityType.APP, "https://github.com/niche-tester/gk-assessment-qa-engineer/releases/download/1.0.0/UAMPMusicPlayerApp.apk");
	}
	
	@AfterTest
	public void teardown() {
		
	}
}

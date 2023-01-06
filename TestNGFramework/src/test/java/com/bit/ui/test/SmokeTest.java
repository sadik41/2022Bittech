package com.bit.ui.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{

	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
    @Test
    public void test3() throws MalformedURLException {
        DesiredCapabilities cap = DesiredCapabilities.chrome();

        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
    }

}

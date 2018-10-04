package com.qa.gridSelnium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
	
	public void main(String[] args) throws MalformedURLException
	{
		//Define Desired Capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN10);
		//chrome option definition
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);
		String gridHub="http://localhost:4444/grid/console";
		WebDriver driver=new RemoteWebDriver(new URL(gridHub),options);
		driver.get("https://www.freecrm.com/index.html");
		System.out.println(driver.getTitle());
	}

}

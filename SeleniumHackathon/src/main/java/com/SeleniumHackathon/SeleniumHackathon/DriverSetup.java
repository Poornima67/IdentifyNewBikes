package com.SeleniumHackathon.SeleniumHackathon;

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	

	public class DriverSetup {
		//Declaring the static variable
		private static WebDriver driver;
		
		//Crating invokeDriver method which will take browserName as a parameter
		public static WebDriver invokeDriver(String browserName) {
			
			//Invoking Chrome Driver in WindowsOS
			if (browserName.equalsIgnoreCase("ChromeDriver_WindowsOS")) {
				String chromeDriverPath = "\\Drivers\\chromedriver.exe";
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path+chromeDriverPath);
				
				driver= new ChromeDriver();	
			}
			//Invoking Firefox Driver in WindowsOS
			else if (browserName.equalsIgnoreCase("FirefoxDriver_WindowsOS")) {
				String firefoxDriverPath="\\Drivers\\geckodriver.exe";
				String path= System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver", path+firefoxDriverPath);
				
				driver= new FirefoxDriver();	
			}
			
			//Returning the Driver
			return driver;
		}
		
	}


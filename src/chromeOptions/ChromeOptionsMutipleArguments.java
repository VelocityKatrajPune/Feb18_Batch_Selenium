package chromeOptions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMutipleArguments 
{
	public static void main(String[] args) 
	{
		
		ChromeOptions opt= new ChromeOptions();
		ArrayList<String>al= new ArrayList<>();
		al.add("incognito");
		al.add("start-maximized");
		al.add("disable-notifications");
		
		opt.addArguments(al);
		
		WebDriver driver= new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		
	}

}

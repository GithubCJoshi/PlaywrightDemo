package PlaywrightDemo.PlaywrightDemo;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BasicPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright play=Playwright.create();
		Browser browser=play.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page= browser.newPage();
		page.navigate("https://www.amazon.com");
		
		String url=page.url();
		System.out.println("url is "+url);
		browser.close();
		play.close();
		
	}

}

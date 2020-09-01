package qa.selenium.sessions;

public class GooglePage {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		
		String browser="chrome";
		
		br.launchBrowser(browser);
		br.launchURL("https://www.google.com");
		
		String title=br.getPageTitle();
		
		if (title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		String currentUrl = br.getPageURL();
		System.out.println(currentUrl);
		
		br.closeBrowser();

	}

}

package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pages.Ana_kontakt;
import pages.Ana_oNama;
import pages.Ana_pocetna;

public class Ana_Tests {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Ana_pocetna.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		for(int i = 0; i <= 2; i++) {
			Ana_pocetna.clickSlajdDesno(driver);
			Thread.sleep(4000);
		}
 		
		Ana_pocetna.clickONama(driver);
		Ana_oNama.clickLogo(driver);
		
		Thread.sleep(2000);
		for(int i = 0; i <= 2; i++) {
			Ana_pocetna.clickSlajdLevo(driver);
			Thread.sleep(4000);
		}
//		Ana_pocetna.clickKontakt(driver);
//		
//		Ana_kontakt.clickLogo(driver);
		
		Actions acs = new Actions(driver);
		Action a = acs.build();
		a.perform();
		Thread.sleep(3000);
		driver.quit();
	}

}

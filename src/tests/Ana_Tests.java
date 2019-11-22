package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pages.Ana_galerija;
import pages.Ana_kontakt;
import pages.Ana_oNama;
import pages.Ana_pocetna;
import pages.Ana_usluge;

public class Ana_Tests {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(Ana_pocetna.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String usluge = "//a[@class='sf-with-ul']//span[contains(text(),'Usluge')]";

		Thread.sleep(2000);
		Ana_pocetna.clickSlajdDesno(driver);
		Thread.sleep(3000);

		Ana_pocetna.clickONama(driver);
		Ana_oNama.clickToTop(driver);
		Ana_oNama.clickLogo(driver);

		Thread.sleep(2000);
		Ana_pocetna.clickSlajdLevo(driver);
		Thread.sleep(3000);

		Ana_pocetna.clickSlajdT1(driver);
		Thread.sleep(2000);
		Ana_pocetna.clickSlajdT3(driver);
		Thread.sleep(2000);
		Ana_pocetna.clickSlajdT2(driver);
		Thread.sleep(2000);
		Ana_pocetna.clickSlajdT4(driver);

		Ana_pocetna.clickSlikaFrizer(driver);
		Thread.sleep(3000);
		driver.get(Ana_pocetna.URL);
		Ana_pocetna.clickSlikaSminka(driver);
		Thread.sleep(3000);
		Ana_usluge.clickFootPocetna(driver);
		Ana_pocetna.clickSlikaTrepavice(driver);
		Thread.sleep(1500);
		Ana_usluge.clickFootPocetna(driver);
		Ana_pocetna.clickSlikaManikir(driver);
		Thread.sleep(1500);
		Ana_usluge.clickFootPocetna(driver);
		Ana_pocetna.clickSlikaDepilacija(driver);
		Thread.sleep(1500);
		Ana_usluge.clickFootPocetna(driver);
		Ana_pocetna.clickSlikaMasaza(driver);
		Thread.sleep(1500);
		Ana_usluge.clickFootPocetna(driver);
		Thread.sleep(3000);

		Actions hoverUsluge = new Actions(driver);
		WebElement dropUsluge = driver.findElement(By.xpath(usluge));
		hoverUsluge.moveToElement(dropUsluge).perform();
		Ana_usluge.clickMeniFrizer(driver);
		Ana_usluge.clickUsluge(driver);
		Ana_usluge.clickMeniSminka(driver);
		Ana_usluge.clickUsluge(driver);
		Ana_usluge.clickMeniTrepavice(driver);
		Ana_usluge.clickUsluge(driver);
		Ana_usluge.clickMeniManikir(driver);
		Ana_usluge.clickUsluge(driver);
		Ana_usluge.clickMeniDepilacija(driver);
		Ana_usluge.clickUsluge(driver);
		Ana_usluge.clickMeniMasaza(driver);
		Thread.sleep(2000);

		driver.get(Ana_pocetna.URL);
		Ana_pocetna.clickGalerija(driver);
		Ana_galerija.clickSlika1(driver);
		for(int i = 0; i<=8; i++) {
			Ana_galerija.clickSledecaSlika(driver);
			Thread.sleep(1500);
		}
		Thread.sleep(1500);
		Ana_galerija.clickZatvoriGaleriju(driver);
		Ana_galerija.clickIzadjiIzGalerije(driver);
		Thread.sleep(1500);
		Ana_galerija.clickSlika20(driver);
		for(int i = 0; i<=8; i++) {
			Ana_galerija.clickPrethodnaSlika(driver);
			Thread.sleep(1500);
		}
		Thread.sleep(1500);
		Ana_galerija.clickZatvoriGaleriju(driver);
		Ana_galerija.clickIzadjiIzGalerije(driver);
		Thread.sleep(2000);
		driver.get(Ana_pocetna.URL);

		Ana_pocetna.clickKontakt(driver);
		Ana_kontakt.clickFacebook(driver);
		Thread.sleep(5000);
		Ana_kontakt.clickInstagram(driver);
		Thread.sleep(5000);

		Actions acs = new Actions(driver);
		Action a = acs.build();
		a.perform();
		Thread.sleep(2000);
		driver.quit();
	}

}

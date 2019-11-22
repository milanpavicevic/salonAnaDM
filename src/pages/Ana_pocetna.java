package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_pocetna {
	public static final String URL = "https://www.salonana-dm.com";
	public static final String oNama = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'O nama')]";
	public static final String meniFrizer = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Frizer')]";
	public static final String galerija = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Galerija')]";
	public static final String kontakt = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Kontakt')]";
	public static final String slajdDesno = "//a[@class='flex-next']";
	public static final String slajdLevo = "//a[@class='flex-prev']";
	public static final String slajdT1 = "//a[contains(text(),'1')]";
	public static final String slajdT2 = "//a[contains(text(),'2')]";
	public static final String slajdT3 = "//a[contains(text(),'3')]";
	public static final String slajdT4 = "//a[contains(text(),'4')]";
	public static final String slikaFrizer = "//div[@class='elementor-element elementor-element-643e84e elementor-widget elementor-widget-image']//img";
	public static final String slikaSminka = "//div[@class='elementor-element elementor-element-2eaaf0e elementor-widget elementor-widget-image']//img";
	public static final String slikaTrepavice = "//div[@class='elementor-element elementor-element-b21ee4b elementor-widget elementor-widget-image']//img";
	public static final String slikaManikir = "//div[@class='elementor-element elementor-element-501cae9 elementor-widget elementor-widget-image']//img";
	public static final String slikaDepilacija = "//div[@class='elementor-element elementor-element-072d632 elementor-widget elementor-widget-image']//img";
	public static final String slikaMasaza = "//div[@class='elementor-element elementor-element-8e0c825 elementor-widget elementor-widget-image']//img";
	public static final String toTop = "//*[@id=\"topcontrol\"]/div/div";

	// Slajd desno:
	public static WebElement getSlajdDesno(WebDriver driver) {
		return driver.findElement(By.xpath(slajdDesno));
	}

	public static void clickSlajdDesno(WebDriver driver) {
		getSlajdDesno(driver).click();
	}

	// Slajd levo:
	public static WebElement getSlajdLevo(WebDriver driver) {
		return driver.findElement(By.xpath(slajdLevo));
	}

	public static void clickSlajdLevo(WebDriver driver) {
		getSlajdLevo(driver).click();
	}

	// Slajd T1:
	public static WebElement getSlajdT1(WebDriver driver) {
		return driver.findElement(By.xpath(slajdT1));
	}

	public static void clickSlajdT1(WebDriver driver) {
		getSlajdT1(driver).click();
	}

	// Slajd T2:
	public static WebElement getSlajdT2(WebDriver driver) {
		return driver.findElement(By.xpath(slajdT2));
	}

	public static void clickSlajdT2(WebDriver driver) {
		getSlajdT2(driver).click();
	}

	// Slajd T3:
	public static WebElement getSlajdT3(WebDriver driver) {
		return driver.findElement(By.xpath(slajdT3));
	}

	public static void clickSlajdT3(WebDriver driver) {
		getSlajdT3(driver).click();
	}

	// Slajd T4:
	public static WebElement getSlajdT4(WebDriver driver) {
		return driver.findElement(By.xpath(slajdT4));
	}

	public static void clickSlajdT4(WebDriver driver) {
		getSlajdT4(driver).click();
	}

	// Slika frizer:
	public static WebElement getSlikaFrizer(WebDriver driver) {
		return driver.findElement(By.xpath(slikaFrizer));
	}

	public static void clickSlikaFrizer(WebDriver driver) {
		getSlikaFrizer(driver).click();
	}

	// Slika sminka:
	public static WebElement getSlikaSminka(WebDriver driver) {
		return driver.findElement(By.xpath(slikaSminka));
	}

	public static void clickSlikaSminka(WebDriver driver) {
		getSlikaSminka(driver).click();
	}

	// Slika Trepavice:
	public static WebElement getSlikaTrepavice(WebDriver driver) {
		return driver.findElement(By.xpath(slikaTrepavice));
	}

	public static void clickSlikaTrepavice(WebDriver driver) {
		getSlikaTrepavice(driver).click();
	}

	// Slika Manikir:
	public static WebElement getSlikaManikir(WebDriver driver) {
		return driver.findElement(By.xpath(slikaManikir));
	}

	public static void clickSlikaManikir(WebDriver driver) {
		getSlikaManikir(driver).click();
	}

	// Slika Depilacija:
	public static WebElement getSlikaDepilacija(WebDriver driver) {
		return driver.findElement(By.xpath(slikaDepilacija));
	}

	public static void clickSlikaDepilacija(WebDriver driver) {
		getSlikaDepilacija(driver).click();
	}

	// Slika Masaza:
	public static WebElement getSlikaMasaza(WebDriver driver) {
		return driver.findElement(By.xpath(slikaMasaza));
	}

	public static void clickSlikaMasaza(WebDriver driver) {
		getSlikaMasaza(driver).click();
	}

	// O nama:
	public static WebElement getONama(WebDriver driver) {
		return driver.findElement(By.xpath(oNama));
	}

	public static void clickONama(WebDriver driver) {
		getONama(driver).click();
	}

	// Galerija:
	public static WebElement getGalerija(WebDriver driver) {
		return driver.findElement(By.xpath(galerija));
	}

	public static void clickGalerija(WebDriver driver) {
		getGalerija(driver).click();
	}

	// Kontakt:
	public static WebElement getKontakt(WebDriver driver) {
		return driver.findElement(By.xpath(kontakt));
	}

	public static void clickKontakt(WebDriver driver) {
		getKontakt(driver).click();
	}
}

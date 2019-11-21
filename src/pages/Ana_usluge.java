package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ana_usluge {
	public static final String usluge = "//a[@class='sf-with-ul']//span[contains(text(),'Usluge')]";
	public static final String meniSminka = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'minka')]";
	public static final String meniTrepavice = "//ul[@id='menu-glavni-meni-1']//li[@class='menu-trepavice menu-item-26']";
	public static final String meniManikir = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Manikir')]";
	public static final String meniDepilacija = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Depilacija')]";
	public static final String meniMasaza = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'Masa')]";
	public static final String footPocetna = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'etna')]";
	public static final String footONama = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'O nama')]";
	public static final String footFrizer = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Frizer')]";
	public static final String footSminka = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'minka')]";
	public static final String footTrepavice = "//ul[@id='menu-glavni-meni-2']//li[@class='menu-trepavice menu-item-26']//a";
	public static final String footManikir = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Manikir')]";
	public static final String footDepilacija = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Depilacija')]";
	public static final String footMasaza = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Masa')]";
	public static final String footGalerija = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Galerija')]";
	public static final String footKontakt = "//ul[@id='menu-glavni-meni-2']//span[contains(text(),'Kontakt')]";

	// Foot Pocetna
	public static WebElement getFootPocetna(WebDriver driver) {
		return driver.findElement(By.xpath(footPocetna));
	}

	public static void clickFootPocetna(WebDriver driver) {
		getFootPocetna(driver).click();
	}

	// Foot O nama:
	public static WebElement getFootONama(WebDriver driver) {
		return driver.findElement(By.xpath(footONama));
	}

	public static void clickFootONama(WebDriver driver) {
		getFootONama(driver).click();
	}

	// Foot frizer:
	public static WebElement getFootFrizer(WebDriver driver) {
		return driver.findElement(By.xpath(footFrizer));
	}

	public static void clickFootFrizer(WebDriver driver) {
		getFootFrizer(driver).click();
	}

	// Foot sminka:
	public static WebElement getFootSminka(WebDriver driver) {
		return driver.findElement(By.xpath(footSminka));
	}

	public static void clickFootSminka(WebDriver driver) {
		getFootSminka(driver).click();
	}

	// Foot trepavice:
	public static WebElement getFootTrepavice(WebDriver driver) {
		return driver.findElement(By.xpath(footTrepavice));
	}

	public static void clickFootTrepavice(WebDriver driver) {
		getFootTrepavice(driver).click();
	}

	// Foot Manikir:
	public static WebElement getFootManikir(WebDriver driver) {
		return driver.findElement(By.xpath(footManikir));
	}

	public static void clickFootManikir(WebDriver driver) {
		getFootManikir(driver).click();
	}

	// Foot Depilacija:
	public static WebElement getFootDepilacija(WebDriver driver) {
		return driver.findElement(By.xpath(footDepilacija));
	}

	public static void clickFootDepilacija(WebDriver driver) {
		getFootDepilacija(driver).click();
	}

	// Foot Masaza:
	public static WebElement getFootMasaza(WebDriver driver) {
		return driver.findElement(By.xpath(footMasaza));
	}

	public static void clickFootMasaza(WebDriver driver) {
		getFootMasaza(driver).click();
	}

	// Foot Galerija:
	public static WebElement getFootGalerija(WebDriver driver) {
		return driver.findElement(By.xpath(footGalerija));
	}

	public static void clickFootGalerija(WebDriver driver) {
		getFootGalerija(driver).click();
	}

	// Foot Kontakt:
	public static WebElement getFootKontakt(WebDriver driver) {
		return driver.findElement(By.xpath(footKontakt));
	}

	public static void clickFootKontakt(WebDriver driver) {
		getFootKontakt(driver).click();
	}

	// MeniSminka:
	public static WebElement getMeniSminka(WebDriver driver) {
		return driver.findElement(By.xpath(meniSminka));
	}

	public static void clickMeniSminka(WebDriver driver) {
		getMeniSminka(driver).click();
	}

	// MeniTrepavice:
	public static WebElement getMeniTrepavice(WebDriver driver) {
		return driver.findElement(By.xpath(meniTrepavice));
	}

	public static void clickMeniTrepavice(WebDriver driver) {
		getMeniTrepavice(driver).click();
	}

	// MeniManikir:
	public static WebElement getMeniManikir(WebDriver driver) {
		return driver.findElement(By.xpath(meniManikir));
	}

	public static void clickMeniManikir(WebDriver driver) {
		getMeniManikir(driver).click();
	}

	// MeniDepilacija:
	public static WebElement getMeniDepilacija(WebDriver driver) {
		return driver.findElement(By.xpath(meniDepilacija));
	}

	public static void clickMeniDepilacija(WebDriver driver) {
		getMeniDepilacija(driver).click();
	}

	// MeniMasaza:
	public static WebElement getMeniMasaza(WebDriver driver) {
		return driver.findElement(By.xpath(meniMasaza));
	}

	public static void clickMeniMasaza(WebDriver driver) {
		getMeniMasaza(driver).click();
	}
}

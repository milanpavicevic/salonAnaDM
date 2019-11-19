package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_pocetna {
	public static final String URL = "https://www.salonana-dm.com";
	public static final String oNama = "//*[@id=\"menu-glavni-meni-1\"]/li[2]/a/span";
	public static final String usluge = "";
	public static final String galerija = "//*[@id=\"menu-glavni-meni-1\"]/li[4]/a/span";
	public static final String kontakt = "//*[@id=\"menu-glavni-meni-1\"]/li[5]/a/span";
	public static final String slajdDesno = "//*[@id=\"imageslider\"]/div/ul[2]/li[2]/a";
	public static final String slajdLevo = "//*[@id=\"imageslider\"]/div/ul[2]/li[1]/a";
	public static final String slikaFrizer = "//div[@class='elementor-element elementor-element-643e84e elementor-widget elementor-widget-image']//img";
	public static final String slikaSminka = "//div[@class='elementor-element elementor-element-2eaaf0e elementor-widget elementor-widget-image']//img";
	public static final String slikaTrepavice = "//div[@class='elementor-element elementor-element-b21ee4b elementor-widget elementor-widget-image']//img";
	public static final String slikaManikir = "//div[@class='elementor-element elementor-element-501cae9 elementor-widget elementor-widget-image']//img";
	public static final String slikaDepilacija = "//div[@class='elementor-element elementor-element-072d632 elementor-widget elementor-widget-image']//img";
	public static final String slikaMasaza = "//div[@class='elementor-element elementor-element-8e0c825 elementor-widget elementor-widget-image']//img";
	public static final String facebook = "//i[@class='fab fa-facebook']";
	public static final String instagram = "//i[@class='fab fa-instagram']";
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

	// O nama:
	public static WebElement getONama(WebDriver driver) {
		return driver.findElement(By.xpath(oNama));
	}

	public static void clickONama(WebDriver driver) {
		getONama(driver).click();
	}

	// Kontakt:
	public static WebElement getKontakt(WebDriver driver) {
		return driver.findElement(By.xpath(kontakt));
	}

	public static void clickKontakt(WebDriver driver) {
		getKontakt(driver).click();
	}
}

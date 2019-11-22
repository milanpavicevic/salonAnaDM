package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_galerija {
	public static final String slika1 = "//div[@id='ngg-image-0']//img";
	public static final String slika20 = "//div[@id='ngg-image-19']//img";
	public static final String sledecaSlika = "//button[@class='sl-next']";
	public static final String prethodnaSlika = "//button[@class='sl-prev']";
	public static final String zatvoriGaleriju = "//button[@class='sl-close']";
	public static final String izadjiIzGalerije = "//button[@class='mfp-close']";

	// Slika1:
	public static WebElement getSlika1(WebDriver driver) {
		return driver.findElement(By.xpath(slika1));
	}

	public static void clickSlika1(WebDriver driver) {
		getSlika1(driver).click();
	}

	// Slika20:
	public static WebElement getSlika20(WebDriver driver) {
		return driver.findElement(By.xpath(slika20));
	}

	public static void clickSlika20(WebDriver driver) {
		getSlika20(driver).click();
	}

	// sledecaSlika:
	public static WebElement getSledecaSlika(WebDriver driver) {
		return driver.findElement(By.xpath(sledecaSlika));
	}

	public static void clickSledecaSlika(WebDriver driver) {
		getSledecaSlika(driver).click();
	}

	// prethodnaSlika:
	public static WebElement getPrethodnaSlika(WebDriver driver) {
		return driver.findElement(By.xpath(prethodnaSlika));
	}

	public static void clickPrethodnaSlika(WebDriver driver) {
		getPrethodnaSlika(driver).click();
	}

	// ZatvoriGaleriju:
	public static WebElement getZatvoriGaleriju(WebDriver driver) {
		return driver.findElement(By.xpath(zatvoriGaleriju));
	}

	public static void clickZatvoriGaleriju(WebDriver driver) {
		getZatvoriGaleriju(driver).click();
	}

	// IzadjiIzGalerije:
	public static WebElement getIzadjiIzGalerije(WebDriver driver) {
		return driver.findElement(By.xpath(izadjiIzGalerije));
	}

	public static void clickIzadjiIzGalerije(WebDriver driver) {
		getIzadjiIzGalerije(driver).click();
	}
}

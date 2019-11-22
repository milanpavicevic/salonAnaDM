package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_oNama {
	public static final String logo = "//img[@class='kad-standard-logo']";
	public static final String pocetna = "//ul[@id='menu-glavni-meni-1']//span[contains(text(),'etna')]";
	public static final String toTop = "//div[@class='icon-arrow-up']";

	// To top:
	public static WebElement getToTop(WebDriver driver) {
		return driver.findElement(By.xpath(toTop));
	}

	public static void clickToTop(WebDriver driver) {
		getToTop(driver).click();
	}

	// Logo:
	public static WebElement getLogo(WebDriver driver) {
		return driver.findElement(By.xpath(logo));
	}

	public static void clickLogo(WebDriver driver) {
		getLogo(driver).click();
	}
}

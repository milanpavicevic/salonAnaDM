package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_kontakt {
	public static final String logo = "//img[@class='kad-standard-logo']";
	public static final String facebook = "//i[@class='fab fa-facebook']";
	public static final String instagram = "//i[@class='fab fa-instagram']";

	// Logo:
	public static WebElement getLogo(WebDriver driver) {
		return driver.findElement(By.xpath(logo));
	}

	public static void clickLogo(WebDriver driver) {
		getLogo(driver).click();
	}

	// Facebook:
	public static WebElement getFacebook(WebDriver driver) {
		return driver.findElement(By.xpath(facebook));
	}

	public static void clickFacebook(WebDriver driver) {
		getFacebook(driver).click();
	}

	// Instagram:
	public static WebElement getInstagram(WebDriver driver) {
		return driver.findElement(By.xpath(instagram));
	}

	public static void clickInstagram(WebDriver driver) {
		getInstagram(driver).click();
	}
}

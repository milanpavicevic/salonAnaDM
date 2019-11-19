package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ana_kontakt {
	public static final String logo = "//img[@class='kad-standard-logo']";
	public static final String pocetna = "//*[@id=\"menu-glavni-meni-1\"]/li[1]/a/span";
	
	//Logo:
		public static WebElement getLogo(WebDriver driver) {
			return driver.findElement(By.xpath(logo));
		}

		public static void clickLogo(WebDriver driver) {
			getLogo(driver).click();
		}
}

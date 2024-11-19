package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticleConduitPage {
	
	@FindBy(xpath = "//h1[contains (text(), 'Article-2')]")
	WebElement userArticle;
	
	@FindBy(xpath = "//a[contains (text(),  'Edit Article')]")
	WebElement clickEditArticle;
	
	@FindBy(xpath = "//button[contains (text(), 'Update Article')]")
	WebElement clickUpdateArticle;
	
	public EditArticleConduitPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isOnUserArticle() {
		return userArticle.isDisplayed();
	}
	
	public void clickEditArticle() {
		clickEditArticle.click();
	}
	public void clickUpdateArticle() {
		clickUpdateArticle.click();
	}
}

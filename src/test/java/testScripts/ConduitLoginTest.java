package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBasePage;
import pages.EditArticleConduitPage;
import pages.LoginConduitPage;
import pages.NewArticleConduitPage;

public class ConduitLoginTest {
	WebDriver driver;
	LoginConduitPage loginConduitPage;
	NewArticleConduitPage ArticleConduitPage;
	EditArticleConduitPage updateArticle;

	
	

			public ConduitLoginTest() {
				TestBasePage.initDriver();
				driver = TestBasePage.getDriver();
				loginConduitPage = new LoginConduitPage(driver);
				ArticleConduitPage = new NewArticleConduitPage(driver);
				updateArticle = new EditArticleConduitPage(driver);
			}
			@BeforeTest
			public void setup() {
				TestBasePage.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");		
			}
		  @Test
		  public void loginConduitTest() {
			  loginConduitPage.validLogin("pendekantil55@gmail.com", "Sathwik@1994");
		  }
		  
		  @Test(priority =1)
		  public void  newArticleTest() {
			  boolean isOnHomePage = loginConduitPage.isOnHome();
			  Assert.assertTrue(isOnHomePage);
			  loginConduitPage.clickNewArticle();
		  }
		  
		  @Test(priority =2)
		  public void ArticleConduitPageTest() {
			  ArticleConduitPage.enterTitle("Test Article-2");
			  ArticleConduitPage.enterShortDescription("Short Test Description");
			  ArticleConduitPage.enterDescription("Test Description");
			  ArticleConduitPage.enterTags("Testtag");
		  }
			 @Test(priority =3)
			  public void clickPublishButtonTest() {
				 ArticleConduitPage.clickPublishArticle();
			 
			  
		  }
			 @Test(priority =4)
			 public void  userArticleTest() {
				  boolean isOnUserArticlePage = updateArticle.isOnUserArticle();
				  Assert.assertTrue(isOnUserArticlePage);
				  updateArticle.clickEditArticle();
		}
			 @Test(priority =5)
			 public void updateArticleConduitPageTest() {
				 ArticleConduitPage.enterShortDescription("Short Test Description updated");
				 ArticleConduitPage.enterDescription("Test Description updated");
				 
			 }
			 @Test(priority = 6)
			  public void clickUpdateArticleTest() {
				 updateArticle.clickUpdateArticle();
			 }
}

  


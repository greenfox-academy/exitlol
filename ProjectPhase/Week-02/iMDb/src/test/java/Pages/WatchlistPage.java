package Pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class WatchlistPage {

  public WatchlistPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }

  @FindBy(how = How.XPATH, using = "//*[@id=\"navWatchlistMenu\"]/p/a")
  public WebElement userWatchlist;

  @FindBy(how = How.XPATH, using = "//*[@id=\"center-1-react\"]/div/div[3]/span[2]")
  public WebElement checkWatchlist;

  @FindBy(how = How.XPATH, using = "//a[@href='/chart/top/?ref_=wl_expl_1']")
  public WebElement topRated;

  @FindBy(how = How.CLASS_NAME, using = "desc")
  public WebElement onTopRated;

  @FindBy(how = How.XPATH, using = "//div[@class='wl-ribbon standalone not-inWL']")
  public List<WebElement> addRibbons;

  @FindBy(how = How.XPATH, using = "//*[@id=\"page-1\"]/div")
  public WebElement notEmptyWatchlistChecker;

  @FindBy(how = How.XPATH, using = "//a[@title='Edit']")
  public WebElement btnEdit;

  @FindBy(how = How.XPATH, using = "//button[contains(text(),'Done')]")
  public WebElement btnDone;

  @FindBy(how = How.XPATH, using = "//input[@value='1']")
  public WebElement firstInput;

  @FindBy(how = How.XPATH, using = "//input[@value='3']")
  public WebElement thirdInput;

  @FindBy(how = How.ID, using = "reorderButton")
  public WebElement popUpConfirm;

  public void clickOnWatchlist() {
    userWatchlist.click();
  }

  public void verifyEmptyList() {
    Assert.assertTrue(checkWatchlist.isDisplayed());
  }

  public void clickOnTopRated() {
    topRated.click();
  }

  public void topRatedChecker() {
    Assert.assertTrue(onTopRated.isDisplayed());
  }

  public void addToWatchlist(int numOfMovies) {
    for (int i = 0; i < numOfMovies; i ++) {
      addRibbons.get(i).click();
    }
  }

  public void addChecker() {
    Assert.assertTrue(notEmptyWatchlistChecker.isDisplayed());
  }

  public void clickOnBtnEdit() {
    btnEdit.click();
  }

  public void editRedirectChecker() {
    Assert.assertTrue(btnDone.isDisplayed());
  }

  public void switchElements() {
    firstInput.sendKeys(Keys.BACK_SPACE, "3");
    thirdInput.sendKeys(Keys.BACK_SPACE, "1");
  }

  public void confirmEdit() {
    btnDone.click();
    popUpConfirm.click();
  }

}
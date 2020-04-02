package com.max_international.beauty.po;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.max_international.Helper.Helper;
import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;

public class BeautyPO extends MobileWebViewPage  {
	
	Helper helper = new Helper(session);
	
	public BeautyPO(TestSession session) throws Exception {
		super(session,"/Applications/Max_International/beauty");
		// TODO Auto-generated constructor stub
	}
	
	public boolean selectForBeauty(){
		//element("productButton").
		helper.hooverToMainNSubNClick(element("productButton"),element( "beautyOnTopHoover"));
		return true;
	}
	
	public boolean checkForPage(String title){
		
		return helper.checkForRightPage(title);
	}
	
	public void navigateBack(){
		session.driver.navigate().back();
	}
	
	public void clickForVideo() {
		helper.scrollForElementNClick(element("playVideoButtonBeauty"));
		session.driver.switchTo().frame(0);
		//element("youtubePlayButton").click();
		System.out.println("In click");
		System.out.println(element("youtubePlayButton").getAttribute("aria-label"));
		helper.scrollForElementNClick(element("youtubePlayButton"));
		System.out.println(element("youtubePlayButton").getAttribute("aria-label"));
		//WebDriverWait wait = new WebDriverWait(session.driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(element("youtubePlayButton")));
		
		
	}
	public boolean checkforVideoStatus(String statusOfVideo){
		
		String tt = element("youtubePlayButton").getAttribute("aria-label");
		System.out.println("In status");
		System.out.println(tt);
		return tt.contains("Play (k)")?true:false;
	}
	
	public void pauseTheVideo(){
		//session.driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		js .executeScript("session.driver.getElementById('player_uid_20373699_1').pause()");
		//helper.scrollForElementNClick(element("youtubePlayButton"));
	}
	public String clickForXButton(){
		session.driver.switchTo().defaultContent();
		helper.scrollForElementNClick(element("XButtonVideo"));
		return session.driver.getWindowHandle();
	}
	
	public void scrollForLearmoreNnClick(){
		helper.scrollForElementNClick(element("learnMoreBeauty"));
	}
	
	public void clickForRightArrow(){
		helper.hooverToMainNSubNClick(element("textHeading"), element("rightArrow"));
	}
	
	public void clickForExplore(){
		helper.hooverToMainNSubNClick(element("textHeading"), element("clickExplore"));
	}
	
	public void clickForProduct(){
	
		JavascriptExecutor js = (JavascriptExecutor) session.driver;  

		js.executeScript("arguments[0];", element("textHeading"));
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element("productInScroll")));
		
		helper.scrollForElementNClick(element("productInScroll"));

		System.out.println("Check for window handle:");

	}
	
	public boolean checkForURL(String url){
		return session.driver.getCurrentUrl().contains(url)?true:false;
	}
	
	public void scrollNClickMaxBeauty(){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("maxBeautyLinkForInsta")).perform();
		String url = element("maxBeautyLinkForInsta").getAttribute("href");
		session.driver.navigate().to(url);
	}
	
	public void scrollNClickONInstaRightArrow(){
		
		helper.hooverToMainNSubNClick(element("listOfPhotosOfInsta"),element("rightArrowForInstaPhotos") );
	}
	
	public void scrollNClickOnInstaPhoto(){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("listOfPhotosOfInsta")).perform();
		//WebDriverWait wait=new WebDriverWait(session.driver,30);
		//wait.until(ExpectedConditions.visibilityOf(element("photoInTheListOfInsta")));
		Set<String> before = session.driver.getWindowHandles();
		System.out.println(before);
		JavascriptExecutor js = (JavascriptExecutor) session.driver;  

		js.executeScript("arguments[0].click();", element("photoInTheListOfInsta"));
		Set<String>  after = session.driver.getWindowHandles();
		
		
		System.out.println(after);
		System.out.println(before.contains(after));
		System.out.println(session.driver.getTitle());
		//System.out.println(session.driver.);
		
	}
	
	public void checkForHooverOnInstaPhoto(){
		Actions actions = new Actions(session.driver);
		//actions.moveToElement(element("listOfPhotosOfInsta")).perform();
		String color = element("photoInTheListOfInsta").getAttribute("transition");
		/*JavascriptExecutor js = (JavascriptExecutor) session.driver;  

		js.executeScript("arguments[0];", element("photoInTheListOfInsta"));*/
		//actions.moveToElement(element("photoInTheListOfInsta"));
		
		actions.moveToElement(element("photoInTheListOfInsta")).perform();
		String colorAfter = element("photoInTheListOfInsta").getAttribute("transition");
		System.out.println("Style");
		System.out.println(color);
		System.out.println(colorAfter);
	}
	
	public void selectBlogFromWhyMax(){
		helper.hooverToMainNSubNClick(element("buttonForWhyMax"), element("buttonForBlog"));
	}
	
	public void selectFromBeautyListOPtions(String OptionToBeSelected){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("productButton")).perform();
		
		List<WebElement> listOfOptions = elements("listOfBeautyOptions");
		for(WebElement option: listOfOptions){
			if(option.getText().contains(OptionToBeSelected)){
				
			    actions.moveToElement(option);
			    actions.click().perform();
			    break;
			}
		}
		
	}
	
	public void clickForBuyNow(){
		helper.scrollForElementNClick(element("buttonForBuyNow"));
	}
	
	public boolean buyNowIncorrectWindow(){
		return element("popedWindowForBuyNow").isDisplayed()?true:false;
	}
	
	public boolean checkingForAllShades() {
		Actions actions = new Actions(session.driver);
		
		List<WebElement> listOfOptions = elements("listOfShades");
		for(WebElement option: listOfOptions){
			actions.moveToElement(option).click().perform();
			
			if(!option.getText().equalsIgnoreCase(element("dispalyOfShadeSelected").getText())){
				return false;
			}

		}
		return true;
	}
	
	public void scrollNClickForTutorialVideo(){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("tutorialBox")).perform();
		helper.scrollForElementNClick(element("tutorialPlayButton"));
		session.driver.switchTo().frame(0);
		System.out.println(element("youtubePlayButton").getAttribute("aria-label"));
		element("youtubePlayButton").click();
		System.out.println(element("youtubePlayButton").getAttribute("aria-label"));
		
	}
	
	public void scrollTheVideoForward(){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("tutorialBox")).perform();
		helper.scrollForElementNClick(element("tutorialPlayButton"));
		session.driver.switchTo().frame(0);
		System.out.println(element("youtubePlayButton").getAttribute("aria-label"));
		element("youtubePlayButton").click();
	}
	
	public boolean clickOnDropDown(){
		Select drpShade = new Select(element("dropDownFacePalette"));
		helper.scrollForElementNClick(element("dropDownFacePalette"));
		drpShade.selectByIndex(2);
		String[] options = {"GLOW GETTER.DEEP DARK","GLOW GETTER.MEDIUM DARK","GLOW GETTER.LIGHT MEDIUM"};
		
		drpShade.getOptions();
		int i = 0;
		for(WebElement shade:drpShade.getOptions()){
			
			if(!shade.getText().contains(options[i])){
				return false;
			}
			i++;
		}
		return true;
		
		
	}
	
	public boolean verifyOptionForSelectedDropDownOption(){
		helper.scrollForElementNClick(element("dropDownFacePalette"));
		Select drpShade = new Select(element("dropDownFacePalette"));
		String[] options = {"https://maxintlmarketing.s3-us-west-2.amazonaws.com/images/beauty/product-pages/glow-getter/deep-dark.png",
				"https://maxintlmarketing.s3-us-west-2.amazonaws.com/images/beauty/product-pages/glow-getter/medium-dark.png",	
				"https://maxintlmarketing.s3-us-west-2.amazonaws.com/images/beauty/product-pages/glow-getter/light-medium.png"
			};
		HashMap<Integer, String> table = new HashMap<>();
		int i = 0;
		
		for(WebElement shade:drpShade.getOptions()){
			shade.click();
			table.put(i, element("highlitedOptionsForDropDown").getAttribute("src"));
			
			if(!table.get(i).contains(options[i])){
				return false;
			}
			
			++i;
		}
		
		return true;
	}
	
	public void selectOptionNClickExplore(String option){
		int i =1;
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("textHeading")).perform();
		List<WebElement> allOptions = elements("scrollOption");
		for(WebElement opt:allOptions){
			if(opt.getText().contains(option)){
				WebDriverWait wait = new WebDriverWait(session.driver, 30);
				wait.until(ExpectedConditions.visibilityOf(opt));
				helper.hooverToMainNSubNClick(element("textHeading"), session.driver.findElement(By.xpath("(//*[text()='EXPLORE'])"+"["+i+"]")));
				break;
			}
			i++;
		}
		
	}
}

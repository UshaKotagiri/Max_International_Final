package com.max_international.login.po;



import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;


/**
 * 
 * @author Nimit Jain
 *
 */

public class LoginPO extends MobileWebViewPage {

	WebDriverWait wait = new WebDriverWait(session.driver, 50);

	public LoginPO(TestSession session) throws Exception {
		super(session, "Applications/Max_International/login");
	}
	
	
	public void checkSite() {
		
		System.out.println("I am on the sign page.");
	}
	public void selectingLanguage(String languageToBeSelected){
		List<WebElement> listOfLanguages = elements("languageSelect");
		for(WebElement language:listOfLanguages){
			if(language.getText().contains(languageToBeSelected)){
				language.click();
			}
		}
		
	}
	
	public void selectLocation(String selectedCountry) throws InterruptedException {
		
		Thread.sleep(2000);
		
		List<WebElement> allCountries = elements("listOfCountries");
		
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
		System.out.println("In country");
		for (WebElement eachCountry : allCountries) {
			System.out.println(eachCountry.getText());

			if(eachCountry.getText().contains(selectedCountry)){
				js.executeScript("arguments[0].scrollIntoView();", eachCountry);
				eachCountry.click();
				break;

			}
		}

	}
	
	public void selectLanguage() {
		System.out.println((element("english") != null));
		    if(element("english")!= null){
			System.out.println("In slect language");
			element("english").click();
		    }

	}

	public void checkNSelectCountry(String country) {
		if((element("australiaLink") != null) == true)
		{
			element("australiaLink").click();
			System.out.println("In select Country");
		}

	}

	
	
	public void clickMaxLogo(){
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element("maxInternationalLogo")));
		element("maxInternationalLogo").click();
		
	}
	
	public void clickMemberLink(){
		WebDriverWait wait = new WebDriverWait(session.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element("memberLogin")));
		element("memberLogin").click();
		
	}
	public void clickUsername(String userName){
		/*WebDriverWait wait=new WebDriverWait(session.driver,20);
		wait.until(ExpectedConditions.visibilityOf(element("userNameTab")));*/
		JavascriptExecutor js = (JavascriptExecutor) session.driver;  

		js.executeScript("arguments[0].click();", element("userNameTab"));
		
		//element("userNameTab").sendKeys(userName);
		
	}
}	

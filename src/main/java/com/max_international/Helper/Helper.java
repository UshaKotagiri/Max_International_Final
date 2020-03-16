package com.max_international.Helper;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;


public class Helper extends MobileWebViewPage {
	

	public Helper(TestSession session) throws Exception {
		super(session,"Applications/Max_International/helper");
		// TODO Auto-generated constructor stub
	}

	public void selectOptionFromBottomOfPage(String OptionToBeSelected) {
		
		List<WebElement> listOfOptions = elements("optionsAtBottom");
		for(WebElement option: listOfOptions){
			//System.out.println(option.getText());
			if(option.getText().contains(OptionToBeSelected)){
				
				Actions actions = new Actions(session.driver);
			    actions.moveToElement(option);
			    actions.click().perform();
			    break;
			}
		}
	}
	
	public boolean checkForRightPage(String titleToBeChecked){
		
		return session.driver.getTitle().contains(titleToBeChecked);
	}


}

package com.max_international.nutritional.po;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.max_international.Helper.Helper;
import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;


public class NutritionalPO extends MobileWebViewPage {

	Helper helper = new Helper(session);
	public NutritionalPO(TestSession session) throws Exception {
		super(session,"/Applications/Max_International/nutritional");
		// TODO Auto-generated constructor stub
	}

	public void selectFromGivenLocation(String optionToBeSelected ,String givenLocation){
		switch (givenLocation) {
		case "fromTopProductHoover":
			selectGiveOptionFromNnutritionnal("productButton","nutritionalHoovertListOnTopOfThePage", optionToBeSelected);
			break;
		case "fromBanner":
			selectGiveOptionFromNnutritionnal("","nutritionalListOnBanner", optionToBeSelected);
			break;
		case "fromNutritionalBottom":
			selectGiveOptionFromNnutritionnal("", "listOfProductsInNutritionalPage", optionToBeSelected);
		default:
			break;
		}
	}
	public void selectGiveOptionFromNnutritionnal(String mainlocation,String location,String option){
		
		Actions actions = new Actions(session.driver);
		if(mainlocation != ""){
		actions.moveToElement(element(mainlocation));
		actions.perform();
		}
		//actions.moveToElement(element("nutritionalHoovertListOnTopOfThePage"));
		//actions.perform();
		List<WebElement> allOptions = elements(location);
		for(WebElement eachOption:allOptions){
			System.out.println(eachOption.getText());
			if(eachOption.getText().contains(option)){
				System.out.println(eachOption.getText());
				actions.moveToElement(eachOption).click().perform();
				//actions.click().perform();
				break;
			}
		}
		
	}
	
	public boolean checkForNutrutionalPageForOption(String option){
		return helper.checkForRightPage(option);
	}
	
	public void nutritionalCheck(){
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element("productButton")).perform();
		List<WebElement> headerList = elements("nutritionalListOnBanner");
		//List<WebElement> listInNutritionalPage = elements("listOfProductsInNutritionalPage");
		//if(headerList.size() == listInNutritionalPage.size()){
			for(WebElement eachHeader:headerList){
				//for(WebElement eachNutrition : listInNutritionalPage){
					System.out.println(eachHeader.getText());
					//System.out.println(eachNutrition.getText());
				}//
			}
		//}
	}
//}

	


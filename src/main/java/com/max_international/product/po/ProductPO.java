package com.max_international.product.po;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.max_international.Helper.Helper;
import com.max_international.automation.framework.TestSession;
import com.max_international.framework.pagefactory.MobileWebViewPage;

public class ProductPO extends MobileWebViewPage {
	Helper helper = new Helper(session);
	public ProductPO(TestSession session) throws Exception {
		super(session, "Applications/Max_International/product");
	}
	
	
	public void clickProductButton(){
		System.out.println("In product");
		
		element("productButton").click();
		
		System.out.println(session.driver.getTitle());
	}
	
	public boolean scrollForElement(String location) throws InterruptedException {
		
		Thread.sleep(2000);
		switch(location) 
		{
		case "nutritionals":
			return(hooverProductForSubOption("nutritionalHeadingForLearnMore","nutritionalsScrollLearnMore"));
			//break;
		case "switchWeight":
			
			if(hooverProductForSubOption("imageBesideSwitchHeadingLearnMore","switchWeightManagementLearnMore"))
			return(helper.checkForRightPage("Max International - Switch"));
			
			
		case "switchFromProduct":
			if(isSwitchExists())
			{
			hooverProductForSubOption("productButton","weightManagementSwitchOption");
			return(helper.checkForRightPage("Max International - Switch"));
			}
		
		case "beautyFoundationFromProduct":
			if(isBeautyFoundationExists()){
				hooverProductForSubOption("productButton", "beautyFoundationOption");
				return(helper.checkForRightPage("Max International - Beauty"));
			}
		
		case "foundationBuyNow":
			if(isBeautyFoundationExists()){
				return hooverProductForSubOption("buyNowButton", "buyNowButton");
			}
		default:
			System.out.println("Have no option for learn more"); 
			return false;
		}
	}
	
	public boolean isBeautyFoundationExists(){
		List<WebElement> dynamicElement = session.driver.findElements(By.xpath("//*[@href='/products/beauty/foundation/' and text() = 'Foundation']"));
		return (dynamicElement.size()!=0)?true:false;
	}
	
	public void clickLearnMore(String ele) throws InterruptedException  {
		
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) session.driver;
        js.executeScript("window.scrollBy(0,-100)", "");
				
		element(ele).click();
	}
	
	
	public boolean checkHoover(String hooverLocation) {
		
		List<WebElement> imageList = elements("hooverImageList");
		for(WebElement eachOption: imageList){
			String beforeHoover = eachOption.getCssValue("transition");
			if(eachOption.getText().contains(hooverLocation))
			{
				Actions actions = new Actions(session.driver);

				actions.moveToElement(eachOption);
				
				String afterHoover = eachOption.getCssValue("transition");

				actions.perform();
				return beforeHoover.contains(afterHoover)?true:false;
			}
		}
		
		return false;
 
	}
	public Boolean isSwitchExists(){
		List<WebElement> dynamicElement = session.driver.findElements(By.xpath("//a[text()='Switch']"));
		return (dynamicElement.size()!=0)?true:false;
	}

	
	
	
	public Boolean hooverProductForSubOption(String mainOption,String subOption) throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("In switch");
		Actions actions = new Actions(session.driver);
		actions.moveToElement(element(mainOption));
		actions.perform();
		List<WebElement> dynamicElement = elements(subOption);
		System.out.println("Size");
		System.out.println(dynamicElement.size());
		if(dynamicElement.size() != 0)
		{
			Thread.sleep(2000);
			System.out.println("INside");
			actions.moveToElement(element(subOption)).perform();
			//actions.perform();
			element(subOption).click();
			return true;
		}
		else{
			System.out.println("country has no option");
			return false;
		}
	}



}

package com.max_international.stepdefs;

import cucumber.api.java.en.And;

import org.junit.Assert;

public class ProductStepDefinition extends StepDefinitionInit{
	
	@And("^From the top menu, Click on the Products tab$")
    public void fromTheTopMenuClickOnTheProductsTab() throws Throwable {
		 productPO.clickProductButton();
	 }
	@And("^Observe the page open Product$")
    public void observeThePageOpenProduct() throws Throwable {
		Assert.assertTrue(helper.checkForRightPage("Max International - Products"));
	}
	
	 @And("^Observe the page open$")
	    public void observeThePageOpen() throws Throwable {
		Assert.assertTrue(helper.checkForRightPage("Max International - Nutritionals"));
	 }
	 
	@And("^Scroll the page down to the NUTRITIONALS$")
    public void scrollThePageDownToTheNUTRITIONALS() throws Throwable {
		 productPO.scrollForElement("nutritionals");
	 }
	 
	 @And("^Scroll the page down towards the bottom of the page$")
	    public void scrollThePageDownTowardsTheBottomOfThePage() throws Throwable {
		 productPO.scrollForElement("oppurtunityHoover");
	 }
	 
	 @And("^Scroll the page down to the NUTRITIONALS, Click on Learnmore$")
	    public void scrollThePageDownToTheNUTRITIONALSClickOnLearnmore() throws Throwable {
		 productPO.scrollForElement("nutritionals");
	 }
	
	 
	 @And("^Hover over the OPPORTUNITY$")
	    public void hoverOverTheOPPORTUNITY() throws Throwable {
		 helper.selectOptionFromBottomOfPage("OPPORTUNITY");
		 
	 }
	 @And("^Observe the page open for Opportunity$")
	    public void observeThePageOpenForOpportunity() throws Throwable {
		 Assert.assertTrue(helper.checkForRightPage("Max International - Join"));
	 }
	 
	 @And("^Scroll the page down and Click on the PRODUCTS WITH PURPOSE$")
	    public void scrollThePageDownAndClickOnThePRODUCTSWITHPURPOSE() throws Throwable {
		 helper.selectOptionFromBottomOfPage("PRODUCTS WITH PURPOSE");
	 }
	 
	 @And("^Scroll the page down and Click on MAX GIVES BACK$")
	    public void scrollThePageDownAndClickOnMAXGIVESBACK() throws Throwable {
		 helper.selectOptionFromBottomOfPage("MAX GIVES BACK");
	 }
	 
	 
	 @And("^Observe the page open of MAX GIVES BACK$")
	    public void observeThePageOpenOfMAXGIVESBACK() throws Throwable {
		 Assert.assertTrue(helper.checkForRightPage("Max International - About"));
	 }
	 
	
	 @And("^Hover the mouse on the product and click on weight management and switch if exists Observe the page redirected to weight management and switch$")
	    public void hoverTheMouseOnTheProductAndClickOnWeightManagementAndSwitchIfExistsObserveThePageRedirectedToWeightManagementAndSwitch() throws Throwable {
		
		 productPO.scrollForElement("switchFromProduct");
	 }
	 
	 @And("^Scroll the page down to the meta switch weight management system and Click on Learn More and Observe the page redirected$")
	    public void scrollThePageDownToTheMetaSwitchWeightManagementSystemAndClickOnLearnMoreAndObserveThePageRedirected() throws Throwable {
		 productPO.scrollForElement("switchWeight");
		 
	 }
	 
	 @And("^Check hoover highlight for oppurtunity$")
	    public void checkHooverHighlightForOppurtunity() throws Throwable {
		 
		Assert.assertTrue(productPO.checkHoover("OPPORTUNITY"));
	 }
	 
	 @And("^Check hoover highlight for products with purpose$")
	    public void checkHooverHighlightForProductsWithPurpose() throws Throwable {
		 Assert.assertTrue(productPO.checkHoover("PRODUCTS WITH PURPOSE"));
	 }
	 
	 @And("^Check hoover highlight for max gives back$")
	    public void checkHooverHighlightForMaxGivesBack() throws Throwable {
		 Assert.assertTrue(productPO.checkHoover("MAX GIVES BACK"));
	 }
	 
	 @And("^Check hoover highlight for help center$")
	    public void checkHooverHighlightForHelpCenter() throws Throwable {
		 Assert.assertTrue(productPO.checkHoover("HELP CENTER"));
	 }
	 
	 
	
	 
	 @And("^Homepage appears and then click on the Product,Beauty and foundation tab$")
	    public void homepageAppearsAndThenClickOnTheProductBeautyAndFoundationTab() throws Throwable {
		 
		 productPO.scrollForElement("beautyFoundationFromProduct");
	 }
	 
	 @And("^Scroll down the foundation page$")
	    public void scrollDownTheFoundationPage() throws Throwable {
		// productPO.scrollForElement("buyNowButton");
		 productPO.scrollForElement("beautyFoundationFromProduct");
	 }
	 @And("^click on Buy now button$")
	    public void clickOnBuyNowButton() throws Throwable {
		 productPO.clickLearnMore("buyNowButton");
	 }
	 @And("^Observe the Page opened$")
	    public void observeThePageOpened() throws Throwable {
		// productPO.checkForProductPage("buyNowOpenWindow");
		 
	 }
	 
	 @And("^Scroll the page down towards the bottom of the page and Click on the HELP CENTER$")
	    public void scrollThePageDownTowardsTheBottomOfThePageAndClickOnTheHELPCENTER() throws Throwable {
		 helper.selectOptionFromBottomOfPage("HELP CENTER");
	 }
	 @And("^Observe the page open for HelpCenter$")
	    public void observeThePageOpenForHelpCenter() throws Throwable {
		 //productPO.checkForProductPage("helpCenterContainer");
		 helper.checkForRightPage("Max International - FAQs");
	 }
}

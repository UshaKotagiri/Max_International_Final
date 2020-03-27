package com.max_international.stepdefs;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BeautyStepDefinition extends StepDefinitionInit{
	
	@Then("^From the top menu, Go to Products and select Beauty$")
    public void fromTheTopMenuGoToProductsAndSelectBeauty() throws Throwable {
		Assert.assertTrue(beautyPO.selectForBeauty());
		
	}

	@And("^Observe the page open for \"([^\"]*)\"$")
    public void observeThePageOpenForSomething(String strArg1) throws Throwable {
     
		Assert.assertTrue(beautyPO.checkForPage(strArg1));
	}
	
	@When("^Clicking on the back button of browser$")
    public void clickingOnTheBackButtonOfBrowser() throws Throwable {
		beautyPO.navigateBack();
	}
	
	
	@When("^Scrolling down and play the header video$")
    public void scrollingDownAndPlayTheHeaderVideo() throws Throwable {
		beautyPO.clickForVideo();
	}
	@And("^Observe the open content of video$")
    public void observeTheOpenContentOfVideo() throws Throwable {
		Assert.assertTrue(beautyPO.checkforVideoStatus("Pause (k)"));
	}
	
	@And("^Click on \"([^\"]*)\" button on the top of the page and Observe$")
    public void clickOnSomethingButtonOnTheTopOfThePageAndObserve(String strArg1) throws Throwable {
		
		Assert.assertTrue(session.driver.getWindowHandle().contains(beautyPO.clickForXButton()));
	}
	@And("^Pause the video$")
    public void pauseTheVideo() throws Throwable {
		beautyPO.pauseTheVideo();
	}
	
	@When("^Scrolling down and click on the learn more$")
    public void scrollingDownAndClickOnTheLearnMore() throws Throwable {
		
	beautyPO.scrollForLearmoreNnClick();
	}
	
	@When("^Scrolling to ENHANCE AND EMPOWER heading and click on left arrow$")
    public void scrollingToENHANCEANDEMPOWERHeadingAndClickOnLeftArrow() throws Throwable {
		beautyPO.clickForRightArrow();
	}
	
	@When("^Scrolling to ENHANCE AND EMPOWER heading and click on EXPLORE$")
    public void scrollingToENHANCEANDEMPOWERHeadingAndClickOnEXPLORE() throws Throwable {
		beautyPO.clickForExplore();
	}
	
	@When("^Scrolling to ENHANCE AND EMPOWER heading and click on product$")
    public void scrollingToENHANCEANDEMPOWERHeadingAndClickOnProduct() throws Throwable {
		beautyPO.clickForProduct();
		
	}
	
	@And("^Observe the page open for the clicked product$")
    public void observeThePageOpenForTheClickedProduct() throws Throwable {
		Assert.assertTrue(beautyPO.checkForURL("http://vo.max.com/products/beauty/eye-palette/"));
	}
	
	@When("^Scrolling to MaxBeauty and click$")
    public void scrollingToMaxBeautyAndClick() throws Throwable {
		beautyPO.scrollNClickMaxBeauty();
		
	}
	
	@When("^Scrolling to RAVES AND REVIEWS Clicking on >$")
    public void scrollingToRAVESANDREVIEWSClickingOn () throws Throwable {
		beautyPO.scrollNClickONInstaRightArrow();
	}
	
	@When("^Scrolling to list of Insta photos and clicking on a photo$")
    public void scrollingToListOfInstaPhotosAndClickingOnAPhoto() throws Throwable {
		beautyPO.scrollNClickOnInstaPhoto();
	}
	 @And("^Scroll to Insta photos and check for hoover$")
	    public void scrollToInstaPhotosAndCheckForHoover() throws Throwable {
		 beautyPO.checkForHooverOnInstaPhoto();
	 }
	 
	 @When("^Selecting Why Max>>Blog$")
	    public void selectingWhyMaxBlog() throws Throwable {
		 beautyPO.selectBlogFromWhyMax();
	 }
	 
	 @When("^Clicking on \"([^\"]*)\"$")
	    public void clickingOnSomething(String strArg1) throws Throwable {
		 beautyPO.selectFromBeautyListOPtions(strArg1);
	 }
	 
	 @When("^Scrolling and Clicking on Buy Now$")
	    public void scrollingAndClickingOnBuyNow() throws Throwable {
		 beautyPO.clickForBuyNow();
	 }
	 
	 @And("^Observe the incorrect page for Buy now$")
	    public void observeTheIncorrectPageForBuyNow() throws Throwable {
		 Assert.assertFalse(beautyPO.buyNowIncorrectWindow());
	 }
	 
	 @Then("^Checking for all shade options getting selected$")
	    public void checkingForAllShadeOptionsGettingSelected() throws Throwable {
		 Assert.assertTrue(beautyPO.checkingForAllShades());
	 }
	 
	 @When("^Scrolling down and clicking on tutorial video$")
	    public void scrollingDownAndClickingOnTutorialVideo() throws Throwable {
		 
		beautyPO.scrollNClickForTutorialVideo();	 
	 }
	 
	 @And("^Check for the slick arrow$")
	    public void checkForTheSlickArrow() throws Throwable {
		 
	 }
}

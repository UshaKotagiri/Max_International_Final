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
		Assert.assertTrue(beautyPO.checkForURL("http://vo.max.com/products/beauty/concealer/"));
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
	 
	 @Then("^Scrolling and Clicking on dropdown below buy button and verifying for all options$")
	    public void scrollingAndClickingOnDropdownBelowBuyButtonAndVerifyingForAllOptions() throws Throwable {
		 Assert.assertTrue(beautyPO.clickOnDropDown());
		 
	 }
	 
	 @Then("^Scrolling and Clicking on dropdown below buy button and verifying for the respective highlighted image$")
	    public void scrollingAndClickingOnDropdownBelowBuyButtonAndVerifyingForTheRespectiveHighlightedImage() throws Throwable {
		 Assert.assertTrue(beautyPO.verifyOptionForSelectedDropDownOption());
	 }
	 
	 @When("^Selecting the \"([^\"]*)\" and click on explore button$")
	    public void selectingTheSomethingAndClickOnExploreButton(String strArg1) throws Throwable {
		 beautyPO.selectOptionNClickExplore(strArg1);
	 }
	 
	 @Then("^Check whether it navigates to the same url$")
	    public void checkWhetherItNavigatesToTheSameUrl() throws Throwable {
		 Assert.assertTrue(session.driver.getCurrentUrl().contains("http://vo.max.com/products/beauty/face-palette/"));
	 }
	 
	 @When("^Clicking on Shop$")
	    public void clickingOnShop() throws Throwable {
		 beautyPO.clickForShop();
	 }
	 
	 @When("^Clicking on \"([^\"]*)\" product's Add to Order$")
	    public void clickingOnSomethingProductsAddToOrder(String strArg1) throws Throwable {
		 
		 beautyPO.clickOnAddTOOrderNCheckout(strArg1);
	 }
	 @When("^Scrolling for I don't have my sponsor's username$")
	    public void scrollingForIDontHaveMySponsorsUsername() throws Throwable {
		 beautyPO.clickForIdontHaveSponsor();
	 }
	 @Then("^Scroll for \"([^\"]*)\" and check for pdf$")
	    public void scrollForSomethingAndCheckForPdf(String strArg1) throws Throwable {
		 Assert.assertTrue(beautyPO.clickONTermsORPrivacy(strArg1));
		 }
}

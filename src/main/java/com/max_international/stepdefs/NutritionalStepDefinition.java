package com.max_international.stepdefs;


import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class NutritionalStepDefinition extends StepDefinitionInit{
	
	@Given("^Select From Products to nutritionnals to Cellgevity from top of the page$")
    public void selectFromProductsToNutritionnalsToCellgevityFromTopOfThePage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("Cellgevity", "fromTopProductHoover");
	}

	@And("^Observe the page open for Cellgevity$")
    public void observeThePageOpenForCellgevity() throws Throwable {
		Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - Cellgevity"));
	}
	
	@And("^Select from products Banner for option Cellgevity$")
    public void selectFromProductsBannerForOptionCellgevity() throws Throwable {
		nutritionalPO.selectFromGivenLocation("CELLGEVITY", "fromBanner");
	}
	
	@And("^Scroll down to Cellgevity at the bottom of Nutritional Page$")
    public void scrollDownToCellgevityAtTheBottomOfNutritionalPage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("Cellgevity", "fromNutritionalBottom");
		
	}
	
	@Given("^Select From Products to nutritionnals to MaxATP from top of the page$")
    public void selectFromProductsToNutritionnalsToMaxATPFromTopOfThePage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("MaxATP", "fromTopProductHoover");
	}
	
	@And("^Observe the page open for MaxATP$")
    public void observeThePageOpenForMaxATP() throws Throwable {
		Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - MaxATP"));
	}
	
	@And("^Select from products Banner for option MaxATP$")
    public void selectFromProductsBannerForOptionMaxATP() throws Throwable {
		nutritionalPO.selectFromGivenLocation("MAXATP", "fromBanner");
	}
	
	@And("^Scroll down to MaxATP at the bottom of Nutritional Page$")
    public void scrollDownToMaxATPAtTheBottomOfNutritionalPage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("MaxATP", "fromNutritionalBottom");
	}
	
	@Given("^Select From Products to nutritionnals to MaxNFuze from top of the page$")
    public void selectFromProductsToNutritionnalsToMaxNFuzeFromTopOfThePage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("Max N-Fuze", "fromTopProductHoover");
	}
	
	@And("^Observe the page open for MaxNFuze$")
    public void observeThePageOpenForMaxNFuze() throws Throwable {
		Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - Max-NFuze"));
	}
	
	@And("^Select from products Banner for option MaxNFuze$")
    public void selectFromProductsBannerForOptionMaxNFuze() throws Throwable {
		nutritionalPO.selectFromGivenLocation("MAX N-FUZE", "fromBanner");
	}
	
	@And("^Scroll down to MaxNFUZE at the bottom of Nutritional Page$")
    public void scrollDownToMaxNFUZEAtTheBottomOfNutritionalPage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("Max N-Fuze", "fromNutritionalBottom");
	}
	
	@Given("^Select From Products to nutritionnals to MaxONE from top of the page$")
    public void selectFromProductsToNutritionnalsToMaxONEFromTopOfThePage() throws Throwable {
		nutritionalPO.selectFromGivenLocation("MaxONE", "fromTopProductHoover");
	}
	
	@And("^Observe the page open for MaxONE$")
    public void observeThePageOpenForMaxONE() throws Throwable {
		Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - MaxOne"));
	}
	
	 @And("^Select from products Banner for option MaxONE$")
	    public void selectFromProductsBannerForOptionMaxONE() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MAXONE", "fromBanner");
	 }
	 
	 @And("^Scroll down to MaxONE at the bottom of Nutritional Page$")
	    public void scrollDownToMaxONEAtTheBottomOfNutritionalPage() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MaxONE", "fromNutritionalBottom");
	 }
	 
	 @Given("^Select From Products to nutritionnals to MaxGXL from top of the page$")
	    public void selectFromProductsToNutritionnalsToMaxGXLFromTopOfThePage() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MaxGXL", "fromTopProductHoover");
	 }
	 
	 @And("^Observe the page open for MaxGXL$")
	    public void observeThePageOpenForMaxGXL() throws Throwable {
		 Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - MaxGXL"));
	 }
	 
	 @And("^Select from products Banner for option MaxGXL$")
	    public void selectFromProductsBannerForOptionMaxGXL() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MAXGXL", "fromBanner");
	 }
	 
	 @And("^Scroll down to MaxGXL at the bottom of Nutritional Page$")
	    public void scrollDownToMaxGXLAtTheBottomOfNutritionalPage() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MaxGXL", "fromNutritionalBottom");
	 }
	 
	 @Given("^Select From Products to nutritionnals to Max357 from top of the page$")
	    public void selectFromProductsToNutritionnalsToMax357FromTopOfThePage() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("Max357", "fromTopProductHoover");
	 }
	 
	 @And("^Observe the page open for Max357$")
	    public void observeThePageOpenForMax357() throws Throwable {
		 Assert.assertTrue(nutritionalPO.checkForNutrutionalPageForOption("Max International - Max357"));
	 }
	 
	 @And("^Select from products Banner for option Max357$")
	    public void selectFromProductsBannerForOptionMax357() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("MAX357", "fromBanner");
	 }
	 @And("^Scroll down to Max357 at the bottom of Nutritional Page$")
	    public void scrollDownToMax357AtTheBottomOfNutritionalPage() throws Throwable {
		 nutritionalPO.selectFromGivenLocation("Max357", "fromNutritionalBottom");
	 }
	    @Given("^check for list$")
	    public void checkForList() throws Throwable {
	    	nutritionalPO.nutritionalCheck();
	    }
}

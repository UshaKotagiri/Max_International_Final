package com.max_international.stepdefs;




import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;






public class LoginStepDefinition extends StepDefinitionInit {


	
	@Given("^I am on the sigin page$")
    public void iAmOnTheSiginPage() throws Throwable {
    	
    	if(loginPO.session.driver.getCurrentUrl().contentEquals("loginPO.session.driver.getCurrentUrl()"))
    	{
    	loginPO.checkSite();
    	}
    	
    }
	@When("^Selecting the language as English$")
    public void selectingTheLanguageAsEnglish() throws Throwable {
		System.out.println("In lang");
		
		if(loginPO.session.driver.getCurrentUrl().contentEquals("http://vo.max.com/home/") == false)
		{
		//loginPO.selectLanguage();
			loginPO.selectingLanguage("English");
		}
	}

	@When("^Selecting the location$")
    public void selectingTheLocation() throws Throwable {
    	if(loginPO.session.driver.getCurrentUrl().contentEquals("http://vo.max.com/home/") == false)
    	{
		//loginPO.checkNSelectCountry("Australia");
    		loginPO.selectLocation("United States");
    	}
	}

	@And("^Click on member login tab on top right$")
	public void clickOnMemberLoginTabOnTopRight() throws Throwable {
		//assertTrue((element("userNameTab").isDisplayed()) == true);
		loginPO.clickMemberLink();
	}
     
	 @Given("^Click on Max Logo$")
	    public void clickOnMaxLogo() throws Throwable {
		 loginPO.clickMaxLogo();
	 }

	 @And("^Clicking on username (.+)$")
	    public void clickingOnUsername(String username) throws Throwable {
		 //Assert.assertTrue(condition);
		// Assert.assertTrue(loginPO.element("userNameTab").isDisplayed() == true);
		 //assertTrue(loginPO.element("userNameTab").isDisplayed() == true);
		 loginPO.clickUsername(username);
	 }
}

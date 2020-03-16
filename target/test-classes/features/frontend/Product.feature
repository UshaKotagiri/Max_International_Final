Feature: Max_International Product Page
@P1
Scenario: [Product_01]To verify that all the elements of the product page load properly
	Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
    And Observe the page open Product
  
 
@P2   
Scenario: [Product_02]To verify that user is able to redirect to the Nutritionals page 
	Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Observe the page open 

@P4
Scenario: [Product_04]To verify that the hovered image should be highlighted properly
	Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
   	And Check hoover highlight for oppurtunity
   	And Check hoover highlight for products with purpose
   	And Check hoover highlight for max gives back 
   	And Check hoover highlight for help center

@P5
Scenario: [Product 05]To verify that user is able to redirect to the OPPORTUNITY page 
	Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
    And Hover over the OPPORTUNITY
    And Observe the page open for Opportunity
    
@P6
Scenario: [Product 06]To verify that user is able to redirect to the
          PRODUCTS WITH PURPOSE page 
   	 Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
    And Scroll the page down and Click on the PRODUCTS WITH PURPOSE
    And Observe the page open Product
    
 @P7
 Scenario: [Product 07]To verify that user is able to redirect to the "MAX GIVES BACK" page 
    Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And From the top menu, Click on the Products tab
    And Scroll the page down and Click on MAX GIVES BACK
    And Observe the page open of MAX GIVES BACK
    
@P9
Scenario: [Product 09]To verify that the user will redirected to the switch page when 
		clicks on the switch learn more option from the products page
    Given I am on the sigin page
	Then Selecting the language as English
	And Check the presence of the location on the page and select 
    And Hover the mouse on the product and click on weight management and switch if exists Observe the page redirected to weight management and switch
   	And From the top menu, Click on the Products tab
    And Scroll the page down to the meta switch weight management system and Click on Learn More and Observe the page redirected
    
    
    
    
  @P10
  Scenario: [Product 10]To verify the user will get redirected to the appropriate page when 
                    the user clicks on the buy now button of the product listed under beauty page  
      Given I am on the sigin page
	 Then Selecting the language as English
	 And Check the presence of the location on the page and select 
	 And Homepage appears and then click on the Product,Beauty and foundation tab
	 And Scroll down the foundation page 
	# And click on Buy now button 
	 And Observe the Page opened
   
    
  @P11
  Scenario: [Product 11]To verify that user is able to redirect to the HELP CENTER page 
  		Given I am on the sigin page
	 	Then Selecting the language as English
	 	And Check the presence of the location on the page and select 
	 	And Scroll the page down towards the bottom of the page and Click on the HELP CENTER
	 	And Observe the page open for HelpCenter
	 
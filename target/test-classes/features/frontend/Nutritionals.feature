Feature: Max_International Nutritional Page

Background: Sigin
	Given I am on the sigin page
	Then Selecting the language as English
	And Check the presence of the location on the page and select
@N1
Scenario: [Nutritionals_1] To verify that user is able to redirect to Cellgevity
	Given Select From Products to nutritionnals to Cellgevity from top of the page
	And Observe the page open for Cellgevity
	And From the top menu, Click on the Products tab
	And Select from products Banner for option Cellgevity
    And Observe the page open for Cellgevity
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to Cellgevity at the bottom of Nutritional Page
    And Observe the page open for Cellgevity
    
@N2
Scenario: [Nutritionals_2] To verify that user is able to redirect to MaxATP
	Given Select From Products to nutritionnals to MaxATP from top of the page
	And Observe the page open for MaxATP
	And From the top menu, Click on the Products tab
	And Select from products Banner for option MaxATP
    And Observe the page open for MaxATP
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to MaxATP at the bottom of Nutritional Page
    And Observe the page open for MaxATP  
    
@N3
Scenario: [Nutritionals_3] To verify that user is able to redirect to MaxN-Fuze
	Given Select From Products to nutritionnals to MaxNFuze from top of the page
	And Observe the page open for MaxNFuze
	And From the top menu, Click on the Products tab
	And Select from products Banner for option MaxNFuze
    And Observe the page open for MaxNFuze
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to MaxNFUZE at the bottom of Nutritional Page
    And Observe the page open for MaxNFuze 
    
@N4
Scenario: [Nutritionals_4] To verify that user is able to redirect to MaxONE
	Given Select From Products to nutritionnals to MaxONE from top of the page
	And Observe the page open for MaxONE
	And From the top menu, Click on the Products tab
	And Select from products Banner for option MaxONE
    And Observe the page open for MaxONE
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to MaxONE at the bottom of Nutritional Page
    And Observe the page open for MaxONE 
    
@N5
Scenario: [Nutritionals_5] To verify that user is able to redirect to MaxGXL
	Given Select From Products to nutritionnals to MaxGXL from top of the page
	And Observe the page open for MaxGXL
	And From the top menu, Click on the Products tab
	And Select from products Banner for option MaxGXL
    And Observe the page open for MaxGXL
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to MaxGXL at the bottom of Nutritional Page
    And Observe the page open for MaxGXL
    
@N6
Scenario: [Nutritionals_6] To verify that user is able to redirect to Max357
	Given Select From Products to nutritionnals to Max357 from top of the page
	And Observe the page open for Max357
	And From the top menu, Click on the Products tab
	And Select from products Banner for option Max357
    And Observe the page open for Max357
    And From the top menu, Click on the Products tab
    And Scroll the page down to the NUTRITIONALS, Click on Learnmore
    And Scroll down to Max357 at the bottom of Nutritional Page
    And Observe the page open for Max357
    
@N7
Scenario: [Nutritionals_7] To verify that all the nutritonal category which appear inside the nutritionals page
 will also appear in the product header menu
 	And From the top menu, Click on the Products tab
    Given check for list
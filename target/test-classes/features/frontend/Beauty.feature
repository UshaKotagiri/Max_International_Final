Feature: Max_International Beauty

Background: Signin and Click on beauty
	Given I am on the sigin page
	When Selecting the language as English
    When Selecting the location
	Then From the top menu, Go to Products and select Beauty
@B1
Scenario: [Beauty_90] To verify that all the elements of the product page load properly
    And Observe the page open for "Max International - Beauty"
    
    
@B2
Scenario: [Beauty_91] To verify that user is able to redirect to the home page by using browser back button
    When Clicking on the back button of browser
    And Observe the page open for "Max International - Home"
    
@B3
Scenario: [Beauty_92] To verify that user is able to open the header video
	When Scrolling down and play the header video
	And Observe the open content of video
	
@B4
Scenario: [Beauty_93] To verify that user is able to close the header video
	When Scrolling down and play the header video
	And Click on "X" button on the top of the page and Observe
	
@B5
Scenario: [Beauty_94] To verify that user is able to play, pause and scrub the header video
	When Scrolling down and play the header video
	#And Pause the video
	
@B8
Scenario: [Beauty_98] To verify that all the elements of the page load properly, when user click on Learn More button
   When Scrolling down and click on the learn more
   And Observe the page open for "Max International - Why Max Beauty"
    
@B9
Scenario: [Beauty_99] To verify that user is able to redirect to the "Beauty" page from
 "Learn More" page, by using browser back button
    When Scrolling down and click on the learn more
	When Clicking on the back button of browser
	And Observe the page open for "Max International - Beauty"

    
    
@B10
Scenario: [Beauty_100] To verify that user can see all other Products on Beauty page
	When Scrolling to ENHANCE AND EMPOWER heading and click on left arrow
	
@B11
Scenario: [Beauty_101] To verify that user is able to click on "Explore" of the products on Beauty page
   When Scrolling to ENHANCE AND EMPOWER heading and click on EXPLORE 

@B12
Scenario: [Beauty_102] To verify that user is able to click on product link of the products on Beauty page
	When Scrolling to ENHANCE AND EMPOWER heading and click on product
	And Observe the page open for the clicked product

@B13
Scenario: [Beauty_103] To verify that user is able to redirect to the Instagram page of Max International 
by clinking on the link "#MaxBeauty"
	When Scrolling to MaxBeauty and click
	And Observe the page open for "Max Intl. Beauty (@maxintlbeauty) • Instagram photos and videos"
	
@B14
Scenario: [Beauty_104] To verify that user can see Instagram feeds on the Beauty page
	When Scrolling to RAVES AND REVIEWS Clicking on >

@B15
Scenario: [Beauty_105] To verify that user can open Instagram feeds on the Beauty page
	When Scrolling to list of Insta photos and clicking on a photo
	
@B17
Scenario: [Beauty_107] To verify that Instagram feeds image changes to content, when user hover over 
the image
	And Scroll to Insta photos and check for hoover

@BF1
Scenario: [Beauty_Foundation_01] To verify that user is able to reach to the "Blog" page through top Menu
    When Selecting Why Max>>Blog
    And Observe the page open for "The Max Life – Your Guide to the Max International Lifestyle"
    
@BF2 @BuyNow
Scenario: [Beauty_Foundation_02] To verify that "Buy Now" link leads to the correct page when user clicks on Foundation
	When Clicking on "Foundation"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
     
@BF3 @BuyNow
Scenario: [Beauty_Concealer_03] To verify that "Buy Now" link leads to the correct page when user clicks on Concealer
	When Clicking on "Concealer"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF4 @BuyNow
Scenario: [Beauty_Face Palette_04] To verify that "Buy Now" link leads to the correct page when user clicks on Face Palette
	When Clicking on "Face Palette"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF5 @BuyNow
Scenario: [Beauty_Eye Palette_05] To verify that "Buy Now" link leads to the correct page when user clicks on Eye Palette
	When Clicking on "Eye Palette"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF6 @BuyNow
Scenario: [Beauty_Mascara_06] To verify that "Buy Now" link leads to the correct page when user clicks on Mascara
	When Clicking on "Mascara"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF7 @BuyNow
Scenario: [Beauty_Lip Treatment_07] To verify that "Buy Now" link leads to the correct page when user clicks on Lip Treatment
	When Clicking on "Lip Treatment"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF8 @BuyNow
Scenario: [Beauty_Lip Color_08] To verify that "Buy Now" link leads to the correct page when user clicks on Lip color
	When Clicking on "Lip Color"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now

@BF9 @BuyNow
Scenario: [Beauty_Primer+Setting Spray_09] To verify that "Buy Now" link leads to the correct page when user clicks on Primer
	When Clicking on "Primer+Setting Spray"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF10 @BuyNow
Scenario: [Beauty_Translucent Powder_10] To verify that "Buy Now" link leads to the correct page when user clicks on Translucent
	When Clicking on "Translucent Powder"
	When Scrolling and Clicking on Buy Now
	And Observe the incorrect page for Buy now
	
@BF11 
Scenario: [Beauty_Why Max Beauty_11] To verify that "Why Max Beauty" link leads to the correct page when user clicks on it
	When Clicking on "Why Max Beauty"
    And Observe the page open for "Max International - Why Max Beauty"

@BF12
Scenario: [Beauty_Foundation_12] To verify user is able to open the header video on foundation page
	When Clicking on "Foundation"
	When Scrolling down and play the header video
	And Observe the open content of video
	
@BF13
Scenario: [Beauty_Foundation_13] To verify user is able to click on the close(x) Icon of header video on foundation page
	When Clicking on "Foundation"
	When Scrolling down and play the header video
	And Click on "X" button on the top of the page and Observe
	
@BF14
Scenario: [Beauty_Foundation_14] To verify user is able to click all options of shade selector and observe the page on 
foundation page
	When Clicking on "Foundation"
	Then Checking for all shade options getting selected

@BF15
Scenario: [Beauty_Foundation_15] To verify user is able to open the video of tutorial on foundation page and 
	observe the page
	When Clicking on "Foundation"
	When Scrolling down and clicking on tutorial video
	And Observe the open content of video
	
@BF16
Scenario: [Beauty_Foundation_16] To verify user is able to click on the close(x) Icon of tutorial video on
 foundation page
	When Clicking on "Foundation"
	When Scrolling down and clicking on tutorial video 
	And Click on "X" button on the top of the page and Observe
	
@BF17
Scenario: [Beauty_Foundation_17] To verify user is able to click forward/backword slick arrow on foundation page 
and observe the page
	When Clicking on "Foundation"
	#When Scrolling down and clicking on tutorial video 
	And Check for the slick arrow
	
@BF18
Scenario: [Beauty_Foundation_18] To verify user is able to click explore button of photo finish foundation on 
foundation page and observe the page[pending]
	When Clicking on "Foundation"
	When Scrolling to ENHANCE AND EMPOWER heading and click on EXPLORE

@BF20
Scenario: [Beauty_Concealer_20] To verify user is able to open the header video on concealer page
	When Clicking on "Concealer"
	When Scrolling down and play the header video
	And Observe the open content of video
	
@BF21
Scenario: [Beauty_Concealer_21] To verify user is able to click on the close(x) Icon of header video on Concealer page
	When Clicking on "Concealer"
	When Scrolling down and play the header video
	And Click on "X" button on the top of the page and Observe

@BF22
Scenario: [Beauty_Concealer_22] To verify user is able to click all options of shade selector and verify the page on
 Concealer page
 	When Clicking on "Concealer"
 	Then Checking for all shade options getting selected
 	
 @BF23
 Scenario: [Beauty_Concealer_23] To verify user is able to open the video of tutorial on concealer page and verify 
 the page
 	When Clicking on "Concealer"
 	When Scrolling down and clicking on tutorial video
	And Observe the open content of video
	
@BF24
Scenario: [Beauty_Concealer_24] To verify user is able to click on the close(x) Icon of tutorial video on concealer page
	When Clicking on "Concealer"
	When Scrolling down and play the header video
	And Click on "X" button on the top of the page and Observe
	
@BF25
Scenario: [Beauty_Concealer_25] To verify user is able to click forward/backword slick arrow on concealer page and 
verify the next page
	When Clicking on "Concealer"



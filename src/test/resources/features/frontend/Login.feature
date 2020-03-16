Feature: Max_International sigin Screen

 	
@sigin
@demo
Scenario Outline:: [Login] To verify the user is able to sigin in the application
   	Given I am on the sigin page
	Then Selecting the language as English
    And Check the presence of the location on the page and select
    And Click on member login tab on top right
	And Clicking on username 
Examples:
	|username|
	||
@L2
Scenario Outline: [Login 02] To click on username on memberlogin page
	#Given Click on Max Logo
	#Then Click on member login tab on top right
	And Clicking on username <username>
Examples:
	|username|
	||
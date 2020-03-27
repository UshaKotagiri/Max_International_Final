Feature: Max_International sigin Screen

 	
@sigin
@demo
Scenario Outline:: [Login] To verify the user is able to sigin in the application
   	Given I am on the sigin page
	When Selecting the language as English
    When Selecting the location
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
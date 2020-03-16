$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Max_International sigin Screen",
  "description": "",
  "id": "max-international-sigin-screen",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": ": [Login] To verify the user is able to sigin in the application",
  "description": "",
  "id": "max-international-sigin-screen;:-[login]-to-verify-the-user-is-able-to-sigin-in-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@sigin"
    },
    {
      "line": 5,
      "name": "@demo"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on member login tab on top right",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicking on username",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "max-international-sigin-screen;:-[login]-to-verify-the-user-is-able-to-sigin-in-the-application;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 13,
      "id": "max-international-sigin-screen;:-[login]-to-verify-the-user-is-able-to-sigin-in-the-application;;1"
    },
    {
      "cells": [
        ""
      ],
      "line": 14,
      "id": "max-international-sigin-screen;:-[login]-to-verify-the-user-is-able-to-sigin-in-the-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 21672938100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": [Login] To verify the user is able to sigin in the application",
  "description": "",
  "id": "max-international-sigin-screen;:-[login]-to-verify-the-user-is-able-to-sigin-in-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@demo"
    },
    {
      "line": 4,
      "name": "@sigin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on member login tab on top right",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Clicking on username",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 311923300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 122709200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 2477208300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clickOnMemberLoginTabOnTopRight()"
});
formatter.result({
  "duration": 4688427200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "[Login 02] To click on username on memberlogin page",
  "description": "",
  "id": "max-international-sigin-screen;[login-02]-to-click-on-username-on-memberlogin-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@L2"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Given Click on Max Logo"
    },
    {
      "line": 18,
      "value": "#Then Click on member login tab on top right"
    }
  ],
  "line": 19,
  "name": "Clicking on username \u003cusername\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "max-international-sigin-screen;[login-02]-to-click-on-username-on-memberlogin-page;",
  "rows": [
    {
      "cells": [
        "username"
      ],
      "line": 21,
      "id": "max-international-sigin-screen;[login-02]-to-click-on-username-on-memberlogin-page;;1"
    },
    {
      "cells": [
        ""
      ],
      "line": 22,
      "id": "max-international-sigin-screen;[login-02]-to-click-on-username-on-memberlogin-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 11885152500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "[Login 02] To click on username on memberlogin page",
  "description": "",
  "id": "max-international-sigin-screen;[login-02]-to-click-on-username-on-memberlogin-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@L2"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Given Click on Max Logo"
    },
    {
      "line": 18,
      "value": "#Then Click on member login tab on top right"
    }
  ],
  "line": 19,
  "name": "Clicking on username ",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Product.feature");
formatter.feature({
  "line": 1,
  "name": "Max_International Product Page",
  "description": "",
  "id": "max-international-product-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11368186400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "[Product_01]To verify that all the elements of the product page load properly",
  "description": "",
  "id": "max-international-product-page;[product-01]to-verify-that-all-the-elements-of-the-product-page-load-properly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Observe the page open Product",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 22470100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 24884000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 22120700,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 2204307100,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpenProduct()"
});
formatter.result({
  "duration": 57213500,
  "status": "passed"
});
formatter.before({
  "duration": 11284412000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "[Product_02]To verify that user is able to redirect to the Nutritionals page",
  "description": "",
  "id": "max-international-product-page;[product-02]to-verify-that-user-is-able-to-redirect-to-the-nutritionals-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@P2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Scroll the page down to the NUTRITIONALS, Click on Learnmore",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Observe the page open",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 31355900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 11640000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 13140700,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1512545900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollThePageDownToTheNUTRITIONALSClickOnLearnmore()"
});
formatter.result({
  "duration": 7710836900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpen()"
});
formatter.result({
  "duration": 16273100,
  "status": "passed"
});
formatter.before({
  "duration": 11239509600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "[Product_04]To verify that the hovered image should be highlighted properly",
  "description": "",
  "id": "max-international-product-page;[product-04]to-verify-that-the-hovered-image-should-be-highlighted-properly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@P4"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Check hoover highlight for oppurtunity",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Check hoover highlight for products with purpose",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Check hoover highlight for max gives back",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Check hoover highlight for help center",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 22119200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 18924500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 27482500,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1550911700,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.checkHooverHighlightForOppurtunity()"
});
formatter.result({
  "duration": 174342500,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.checkHooverHighlightForProductsWithPurpose()"
});
formatter.result({
  "duration": 165212200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.checkHooverHighlightForMaxGivesBack()"
});
formatter.result({
  "duration": 198981200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.checkHooverHighlightForHelpCenter()"
});
formatter.result({
  "duration": 231274000,
  "status": "passed"
});
formatter.before({
  "duration": 11283468800,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "[Product 05]To verify that user is able to redirect to the OPPORTUNITY page",
  "description": "",
  "id": "max-international-product-page;[product-05]to-verify-that-user-is-able-to-redirect-to-the-opportunity-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@P5"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Hover over the OPPORTUNITY",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Observe the page open for Opportunity",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 21421900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 10353200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 12336700,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1408235600,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.hoverOverTheOPPORTUNITY()"
});
formatter.result({
  "duration": 1557245100,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpenForOpportunity()"
});
formatter.result({
  "duration": 12683700,
  "status": "passed"
});
formatter.before({
  "duration": 11193257700,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "[Product 06]To verify that user is able to redirect to the",
  "description": "        PRODUCTS WITH PURPOSE page",
  "id": "max-international-product-page;[product-06]to-verify-that-user-is-able-to-redirect-to-the",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@P6"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Scroll the page down and Click on the PRODUCTS WITH PURPOSE",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Observe the page open Product",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 23597900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 24328500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 25971200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1530745100,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollThePageDownAndClickOnThePRODUCTSWITHPURPOSE()"
});
formatter.result({
  "duration": 1508871000,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpenProduct()"
});
formatter.result({
  "duration": 75112900,
  "status": "passed"
});
formatter.before({
  "duration": 11396905300,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "[Product 07]To verify that user is able to redirect to the \"MAX GIVES BACK\" page",
  "description": "",
  "id": "max-international-product-page;[product-07]to-verify-that-user-is-able-to-redirect-to-the-\"max-gives-back\"-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@P7"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 53,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 54,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Scroll the page down and Click on MAX GIVES BACK",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Observe the page open of MAX GIVES BACK",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 24025500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 18216500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 23065400,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1533518400,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollThePageDownAndClickOnMAXGIVESBACK()"
});
formatter.result({
  "duration": 2591407900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpenOfMAXGIVESBACK()"
});
formatter.result({
  "duration": 13101600,
  "status": "passed"
});
formatter.before({
  "duration": 11155617600,
  "status": "passed"
});
formatter.scenario({
  "line": 60,
  "name": "[Product 09]To verify that the user will redirected to the switch page when",
  "description": "clicks on the switch learn more option from the products page",
  "id": "max-international-product-page;[product-09]to-verify-that-the-user-will-redirected-to-the-switch-page-when",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 59,
      "name": "@P9"
    }
  ]
});
formatter.step({
  "line": 62,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 63,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "Hover the mouse on the product and click on weight management and switch if exists Observe the page redirected to weight management and switch",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "From the top menu, Click on the Products tab",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "Scroll the page down to the meta switch weight management system and Click on Learn More and Observe the page redirected",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 25931800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 16060500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 10389000,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.hoverTheMouseOnTheProductAndClickOnWeightManagementAndSwitchIfExistsObserveThePageRedirectedToWeightManagementAndSwitch()"
});
formatter.result({
  "duration": 2155738500,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.fromTheTopMenuClickOnTheProductsTab()"
});
formatter.result({
  "duration": 1476046700,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollThePageDownToTheMetaSwitchWeightManagementSystemAndClickOnLearnMoreAndObserveThePageRedirected()"
});
formatter.result({
  "duration": 10110540000,
  "status": "passed"
});
formatter.before({
  "duration": 11264736900,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "[Product 10]To verify the user will get redirected to the appropriate page when",
  "description": "                the user clicks on the buy now button of the product listed under beauty page",
  "id": "max-international-product-page;[product-10]to-verify-the-user-will-get-redirected-to-the-appropriate-page-when",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@P10"
    }
  ]
});
formatter.step({
  "line": 75,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 76,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 77,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Homepage appears and then click on the Product,Beauty and foundation tab",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Scroll down the foundation page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 80,
      "value": "# And click on Buy now button"
    }
  ],
  "line": 81,
  "name": "Observe the Page opened",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 24616900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 15029300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 15758900,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.homepageAppearsAndThenClickOnTheProductBeautyAndFoundationTab()"
});
formatter.result({
  "duration": 2068953200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollDownTheFoundationPage()"
});
formatter.result({
  "duration": 2050522200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpened()"
});
formatter.result({
  "duration": 50400,
  "status": "passed"
});
formatter.before({
  "duration": 11478951400,
  "status": "passed"
});
formatter.scenario({
  "line": 85,
  "name": "[Product 11]To verify that user is able to redirect to the HELP CENTER page",
  "description": "",
  "id": "max-international-product-page;[product-11]to-verify-that-user-is-able-to-redirect-to-the-help-center-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 84,
      "name": "@P11"
    }
  ]
});
formatter.step({
  "line": 86,
  "name": "I am on the sigin page",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "Selecting the language as English",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Check the presence of the location on the page and select",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "Scroll the page down towards the bottom of the page and Click on the HELP CENTER",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "Observe the page open for HelpCenter",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.iAmOnTheSiginPage()"
});
formatter.result({
  "duration": 17266900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 21027000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 18264200,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.scrollThePageDownTowardsTheBottomOfThePageAndClickOnTheHELPCENTER()"
});
formatter.result({
  "duration": 1961685100,
  "status": "passed"
});
formatter.match({
  "location": "ProductStepDefinition.observeThePageOpenForHelpCenter()"
});
formatter.result({
  "duration": 17720400,
  "status": "passed"
});
});
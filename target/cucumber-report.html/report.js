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
  "duration": 19921737600,
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
  "duration": 242748900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.selectingTheLanguageAsEnglish()"
});
formatter.result({
  "duration": 105340900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.checkThePresenceOfTheLocationOnThePageAndSelect()"
});
formatter.result({
  "duration": 2529458000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.clickOnMemberLoginTabOnTopRight()"
});
formatter.result({
  "duration": 5071707300,
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

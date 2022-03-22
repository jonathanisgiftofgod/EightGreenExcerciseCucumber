$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Britto/eclipse-workspace/GreenExcerciseCucumber/featureFiles/AdactinBooking.feature");
formatter.feature({
  "name": "Open the url of Adactin",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Validating the all the details for booking a room in adactin url",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "Open the adactin url",
  "keyword": "Given "
});
formatter.step({
  "name": "Enter the login \"\u003cuserId\u003e\" and \"\u003cpassword\u003e\" details",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the next or submit button",
  "keyword": "When "
});
formatter.step({
  "name": "Select the Location Hotel RoomType NoOfRooms",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the NoOf Adults and NoofChilds",
  "keyword": "And "
});
formatter.step({
  "name": "click the search",
  "keyword": "When "
});
formatter.step({
  "name": "Enter the FirstName LastName Address CreditCardNumber",
  "keyword": "When "
});
formatter.step({
  "name": "Select the CardType ExpiryMonth ExpiryYear",
  "keyword": "And "
});
formatter.step({
  "name": "Enter the cvv number",
  "keyword": "And "
});
formatter.step({
  "name": "click the BookNow",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userId",
        "password"
      ]
    },
    {
      "cells": [
        "britto619",
        "SR185Y"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validating the all the details for booking a room in adactin url",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "Open the adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDefinition.open_the_adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the login \"britto619\" and \"SR185Y\" details",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_login_and_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the next or submit button",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_next_or_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the Location Hotel RoomType NoOfRooms",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_Location_Hotel_RoomType_NoOfRooms()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the NoOf Adults and NoofChilds",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_NoOf_Adults_and_NoofChilds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the search",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the FirstName LastName Address CreditCardNumber",
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_FirstName_LastName_Address_CreditCardNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select the CardType ExpiryMonth ExpiryYear",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.select_the_CardType_ExpiryMonth_ExpiryYear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the cvv number",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_cvv_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the BookNow",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.click_the_BookNow()"
});
formatter.result({
  "status": "passed"
});
});
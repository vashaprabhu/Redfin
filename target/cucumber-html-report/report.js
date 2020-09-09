$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("redfinFunct.feature");
formatter.feature({
  "line": 2,
  "name": "RedFin functionality",
  "description": "",
  "id": "redfin-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Redfine",
  "description": "",
  "id": "redfin-functionality;redfine",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Connect to \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open \"url\" website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter \"\u003cplace\u003e\" to search",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Did you mean dialogbox pops up",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select \"\u003ccity\u003e\" you want",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Check the displayedCity is same as entered \"\u003cplace\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter \"\u003cminPrice\u003e\" and \"\u003cmaxPrice\u003e\" in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check listed homes are from the \"\u003cSameCity\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "redfin-functionality;redfine;",
  "rows": [
    {
      "cells": [
        "place",
        "city",
        "minPrice",
        "maxPrice",
        "SameCity"
      ],
      "line": 16,
      "id": "redfin-functionality;redfine;;1"
    },
    {
      "cells": [
        "Sunnyvale",
        "https://www.redfin.com/city/19457/CA/Sunnyvale",
        "25",
        "3",
        "/CA/Sunnyvale/"
      ],
      "line": 17,
      "id": "redfin-functionality;redfine;;2"
    },
    {
      "cells": [
        "Sunnyvale",
        "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
        "21",
        "4",
        "/TX/Dallas/"
      ],
      "line": 18,
      "id": "redfin-functionality;redfine;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Redfine",
  "description": "",
  "id": "redfin-functionality;redfine;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Connect to \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open \"url\" website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter \"Sunnyvale\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Did you mean dialogbox pops up",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select \"https://www.redfin.com/city/19457/CA/Sunnyvale\" you want",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Check the displayedCity is same as entered \"Sunnyvale\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter \"25\" and \"3\" in the list",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check listed homes are from the \"/CA/Sunnyvale/\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 12
    }
  ],
  "location": "redfineSteps.connect_to_something(String)"
});
formatter.result({
  "duration": 6137953300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 6
    }
  ],
  "location": "redfineSteps.open_something_website(String)"
});
formatter.result({
  "duration": 1686414400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 7
    }
  ],
  "location": "redfineSteps.enter_something_to_search(String)"
});
formatter.result({
  "duration": 205177300,
  "status": "passed"
});
formatter.match({
  "location": "redfineSteps.click_on_search()"
});
formatter.result({
  "duration": 75944100,
  "status": "passed"
});
formatter.match({
  "location": "redfineSteps.did_you_mean_dialogbox_pops_up()"
});
formatter.result({
  "duration": 685025900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/city/19457/CA/Sunnyvale",
      "offset": 8
    }
  ],
  "location": "redfineSteps.select_something_you_want(String)"
});
formatter.result({
  "duration": 5108997500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 44
    }
  ],
  "location": "redfineSteps.check_the_displayedCity_is_same_as_entered(String)"
});
formatter.result({
  "duration": 1058472000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 7
    },
    {
      "val": "3",
      "offset": 16
    }
  ],
  "location": "redfineSteps.enter_and_in_the_list(String,String)"
});
formatter.result({
  "duration": 6306809900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/CA/Sunnyvale/",
      "offset": 33
    }
  ],
  "location": "redfineSteps.check_listed_homes_are_from_the(String)"
});
formatter.result({
  "duration": 3426570700,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Redfine",
  "description": "",
  "id": "redfin-functionality;redfine;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Connect to \"browser\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "open \"url\" website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter \"Sunnyvale\" to search",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on search",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Did you mean dialogbox pops up",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "select \"https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale\" you want",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Check the displayedCity is same as entered \"Sunnyvale\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Enter \"21\" and \"4\" in the list",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check listed homes are from the \"/TX/Dallas/\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "browser",
      "offset": 12
    }
  ],
  "location": "redfineSteps.connect_to_something(String)"
});
formatter.result({
  "duration": 5400032000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 6
    }
  ],
  "location": "redfineSteps.open_something_website(String)"
});
formatter.result({
  "duration": 2007656300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 7
    }
  ],
  "location": "redfineSteps.enter_something_to_search(String)"
});
formatter.result({
  "duration": 162783800,
  "status": "passed"
});
formatter.match({
  "location": "redfineSteps.click_on_search()"
});
formatter.result({
  "duration": 74365400,
  "status": "passed"
});
formatter.match({
  "location": "redfineSteps.did_you_mean_dialogbox_pops_up()"
});
formatter.result({
  "duration": 613792800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.redfin.com/neighborhood/338644/TX/Dallas/Sunnyvale",
      "offset": 8
    }
  ],
  "location": "redfineSteps.select_something_you_want(String)"
});
formatter.result({
  "duration": 4745030300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sunnyvale",
      "offset": 44
    }
  ],
  "location": "redfineSteps.check_the_displayedCity_is_same_as_entered(String)"
});
formatter.result({
  "duration": 470217700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21",
      "offset": 7
    },
    {
      "val": "4",
      "offset": 16
    }
  ],
  "location": "redfineSteps.enter_and_in_the_list(String,String)"
});
formatter.result({
  "duration": 6286705400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/TX/Dallas/",
      "offset": 33
    }
  ],
  "location": "redfineSteps.check_listed_homes_are_from_the(String)"
});
formatter.result({
  "duration": 3205564100,
  "status": "passed"
});
});
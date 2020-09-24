$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/bolcom.feature");
formatter.feature({
  "name": "Bol.com Arama Yapma",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@bolcom"
    }
  ]
});
formatter.scenarioOutline({
  "name": "TC08_gebruiker zoekt een goed op de bolcom",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "gebruiker gaat op website \"http://bol.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "gebruiker schrijft \"\u003cproduct\u003e\" in de zoekdoos",
  "keyword": "And "
});
formatter.step({
  "name": "gebruiker schrijft de gevolgen op",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "fietsen"
      ]
    },
    {
      "cells": [
        "computer"
      ]
    },
    {
      "cells": [
        "tandenborstel"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC08_gebruiker zoekt een goed op de bolcom",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@bolcom"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker gaat op website \"http://bol.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_gaat_op_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft \"fietsen\" in de zoekdoos",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_in_de_zoekdoos(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft de gevolgen op",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_de_gevolgen_op()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC08_gebruiker zoekt een goed op de bolcom",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@bolcom"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker gaat op website \"http://bol.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_gaat_op_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft \"computer\" in de zoekdoos",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_in_de_zoekdoos(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft de gevolgen op",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_de_gevolgen_op()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC08_gebruiker zoekt een goed op de bolcom",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@bolcom"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker gaat op website \"http://bol.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_gaat_op_website(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft \"tandenborstel\" in de zoekdoos",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_in_de_zoekdoos(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "gebruiker schrijft de gevolgen op",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.BolcomStepDefinitions.gebruiker_schrijft_de_gevolgen_op()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
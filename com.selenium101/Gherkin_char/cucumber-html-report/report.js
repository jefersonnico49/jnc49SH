$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("char.feature");
formatter.feature({
  "line": 1,
  "name": "Char Scenarios",
  "description": "",
  "id": "char-scenarios",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Increment and Dicrement Characters",
  "description": "",
  "id": "char-scenarios;increment-and-dicrement-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Increment Characters from C",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Decrement character form  G",
  "keyword": "Then "
});
formatter.match({
  "location": "testchar.increment_Characters_from_C()"
});
formatter.result({
  "duration": 169132500,
  "status": "passed"
});
formatter.match({
  "location": "testchar.decrement_character_form_G()"
});
formatter.result({
  "duration": 3172500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Input Decimal Value and its equivalent characters ASCCI table",
  "description": "",
  "id": "char-scenarios;input-decimal-value-and-its-equivalent-characters-ascci-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Input Decimal value and display equivalent characters",
  "keyword": "Given "
});
formatter.match({
  "location": "testchar.input_Decimal_value_and_display_equivalent_characters()"
});
formatter.result({
  "duration": 31573600,
  "status": "passed"
});
});
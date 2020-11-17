$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/automation_practice_tekrar.feature");
formatter.feature({
  "name": "Automation Calismasi",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Dress menusunden summer dressesleri listeler",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tsirt"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Otomasyon Adimlari:Given user web sayfasinda",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.otomasyon_Adimlari_Given_user_web_sayfasinda()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici dresses menusunden summer dresses\u0027e tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.kullanici_dresses_menusunden_summer_dresses_e_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici tsirt sayisini  ve isimlerini ekrana yazdirir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AutomationPracticeStepDef.kullanici_tsirt_sayisini_ve_isimlerini_ekrana_yazdirir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
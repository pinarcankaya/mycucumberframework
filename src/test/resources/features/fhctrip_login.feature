@fhclogin @smoketest
Feature: Login feature

  Scenario: TC01_kullanici gecerli kimlik bilgileri ile giris yapar
    Given kullanici fhctriplogin sayfasinda
    And kullanici gecerli username girer
    And kullanici gecerli password girer
    And kullanici login butonuna basar.
    Then loginin basarili oldugunu dogrula

    @fhcnegatif
  Scenario: TC01_user logins with invalid credentials
  Given user is on the fhctriplogin page
  And user enters invalid username
  And user enters  invalid password
  And user clicks login button
  Then verify login is not successfull
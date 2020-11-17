@automationPractice
Feature: Kullanici Kayit İslemi Otomasyonu

  Scenario: Kullanici Kayit İslemi Otomasyonu
    Given Otomasyon Adimlari:Given user web sayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin


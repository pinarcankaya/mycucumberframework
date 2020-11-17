@fhcregister
Feature: FhcTrip Registiration
  Scenario: fhcTrip registiration test
Given kullanici fc trip sayfasindadir
And kullanici create a new account butonuna tiklar
And kullanici username girer "manager2!"
And kullanici password girer "Man1ager2!"
And kullanici email girer   "abc123@gmail.com"
And kullanici fullname girer  "AliVeli CAN"
And kullanici phone girer "0033123456"
And kullanici SSN girer  "111223333"
And kullanici Driven lisans girer "12345678956"
And kullanici country dropdown secer "United States"
And kullanici state dropdown secer "Alaska"
And kullanici adress girer "A cadde B sokak"
And kullanici working sector girer "Information"
And kullanici birthday girer  "15-04-2020"
Then save butonuna tiklar

    @succesmesaj
    Scenario Outline: fhcTrip registiration test
      Given kullanici fc trip sayfasindadir
      And kullanici create a new account butonuna tiklar
      And kullanici username girer "<username>"
      And kullanici password girer "<password>"
      And kullanici email girer   "<mail>"
      And kullanici fullname girer  "<fullname>"
      And kullanici phone girer "<phone>"
      And kullanici SSN girer  "<SSN>"
      And kullanici Driven lisans girer "<driver num>"
      And kullanici country dropdown secer "<country>"
      And kullanici state dropdown secer "<state>"
      And kullanici adress girer "<adress>"
      And kullanici working sector girer "<sector>"
      And kullanici birthday girer  "<birtday>"
      And save butonuna tiklar
      And succes mesaji goruntulenir
      Then alert ok butonuna tiklar

      Examples:tables
      |username |password  |mail         |fullname|phone     |SSN      |driver num|country       |state  |adress     |sector     |birtday    |
      |ali1      |veli1      |123@gmail.com|AliVeli |0033123456|111223333|123456    |United States |Alaska |abc sok.123|information|15-04-2020|
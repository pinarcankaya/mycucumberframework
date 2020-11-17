@fhcroomreservation
  Feature: room resevation
    Scenario: fhctrip room reservation test
      Given :kullanici fhctrip sayfasindadir
      And :kullanici gecerli username girer "manager2"
      And :kullanici gecerli password girer "Man1ager2!"
      And :kullanici login butonuna basar.
      And :kullanici hotel management menusune tiklar
      And :kullanici room reservation menusune tiklar
      And :kullanici add room reservation butonuna tiklar
      And :kullanici select user secer "ali veli"
      And :kullanici select hotel room secer "Kral Dairesi"
      And kullanici fiyat bilgisi girer "500"
      And :kullanici date start secer "08/09/2020"
      And :kullanici date end secer "08/10/2020"
      And :kullanici adult amount girer "2"
      And :kullanici children amount girer "4"
      And :kullanici contact name surname girer "Ali Veli CAN"
      And :kullanici contact phone girer "0033123456"
      And :kullanici contact email girer "abc123@gmail.com"
      And :kullanici not girer  "Deniz Manzarali"
      And :kullanici approved checkbox'a tiklar
      And :kullanici isPaid checkbox'a tiklar
      And :kullanici save butonuna tiklar
      Then :succes mesajinin gorundugu dogrulanir


      @réservationd'Hôtel
      Scenario:test de réservation d'hôtel
        Given :l'utilisateur est sur la page fhctriplogin
        And :l'utilisateur écrit un nom d'utilisateur valide "manager2"
        And :l'utilisateur écrit un mot de passe valide "Man1ager2!"
        And :l'utilisateur clique sur le bouton login
        And :l'utilisateur clique sur le menu hotel management
        And :l'utilisateur clique sur le menu room reservation
        And :l'utilisateur clique sur le bouton add room reservation
        And :l'utilisateur sélectionne select user "ali veli"
        And :l'utilisateur sélectionne hotel room  "Kral Dairesi"
        And :l'utilisateur écrit les informations de prix "500"
        And :l'utilisateur sélectionne la date de début "08/09/2020"
        And :l'utilisateur sélectionne la date de fin "08/10/2020"
        And :l'utilisateur écrit le nombre d'adultes "2"
        And :l'utilisateur écrit le nombre d'enfants "4"
        And :l'utilisateur écrit le nom et le prénom "Ali Veli CAN"
        And :l'utilisateur écrit le numéro de téléphone "0033123456"
        And :l'utilisateur écrit l'adresse e-mail "abc123@gmail.com"
        And :l'utilisateur écrit des notes  "Deniz Manzarali"
        And :l'utilisateur clique sur la case à cocher Approved
        And :l'utilisateur clique sur la case à cocher IsPaid
        And :l'utilisateur clique sur le bouton save
        Then :l'utilisateur vérifie que le message de réussite de la personne est affiché

























Feature: Automation practice 2
@testcase2
Scenario:Geçersiz email ve password hatasını doğrulayın.
Given Otomasyon Adimlari:Given user web sayfasinda
And user sign in linkine tiklar
And email kutusuna gecersiz email ve password yazar ve sigin butonuna tiklar
Then error mesajinin Authentication failed. oldugunu dogrulayin
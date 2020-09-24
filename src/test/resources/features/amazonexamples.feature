@birdenfazlaexample
Feature: Amazonda Urun Arama
  Scenario Outline: TC07_kullanici amazonda dropdown ve aramakutusu kullanarak arama yapar
    Given kullanici "http://amazon.com" sayfasina gider
    And kullanici dropdown "<kategori>" secer
    And kullanici aramaKutusuna "<urunismi>" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir


    Examples: Test Verileri
      |kategori   | urunismi       |
      |Automotive | Phone holder   |
      |Baby       | Stroller       |
      |Books      | Miserables     |




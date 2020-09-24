@urunarama1 @amazon
Feature: Amazan Urun Arama

  Scenario: TC04_kullanici amazonda drone aramasi yapar
    Given kullanici amazon sayfasina gider
    And kullanici aramaKutusuna "drone" yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir
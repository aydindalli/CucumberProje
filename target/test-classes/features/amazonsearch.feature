@urunarama
Feature: Amazon Arama

  Background: Oncesinde Calisacak Method (BeforeClass gibi)
  Given kullanici amazon sayfasina gider

  @amazon
  Scenario: TC02_Kullanici amazon arama yapar
    And kullanici headphones aramasi yapar
    Then kullanici sonuc sayisini ekrana yazdirir

  @amazoncamera
  Scenario: TC03_kullanici amazonda arama yapar
    And kullanici aramaKutusuna camera yazar ve arar
    Then kullanici sonuc sayisini ekrana yazdirir



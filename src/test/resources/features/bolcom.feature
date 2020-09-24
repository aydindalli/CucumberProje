@bolcom
  Feature: Bol.com Arama Yapma
    Scenario Outline: TC08_gebruiker zoekt een goed op de bolcom
      Given gebruiker gaat op website "http://bol.com"
      And gebruiker schrijft "<product>" in de zoekdoos
      Then gebruiker schrijft de gevolgen op

      Examples:
        | product       |
        | fiets         |
        | computer      |
        | tandenborstel |

@KoalaPalace
  Feature: Koalapalace login test case
    Scenario: TC10_Valid Credentials Log in
      Given user must visit "http://kaolapalace-qa-environment.com/Account/Logon"
      And user must enter a valid username
      Then user must enter a valid password

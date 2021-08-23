@Test
Feature: Feature file #2 on Cucumber - Some action on Google site (duplicate)

  Scenario: Scenario1 - Check search functionality on Google site (duplicate)
    Given Open google main page
    And Google main page is open
    When I enter "selenide" in search field
    Then Search result "selenide.org" is appear

  Scenario: Scenario2 - Return to Google main page (with fail step)
    Given I click to logo Google
    Then Google main page is open
    And Step is fail
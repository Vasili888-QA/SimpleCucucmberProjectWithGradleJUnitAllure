@Test
Feature: Some action on Google site

  Scenario: Check search functionality
    Given Open google main page
    And Google main page is open
    When I enter "selenide" in search field
    Then Search result "selenide.org" is appear

  Scenario: Return to Google main page
    Given I click to logo Google
    Then Google main page is open

@Test
Feature: Feature file #3 with Cucumber - Available action on Elements Section in the DemoQA site

  Scenario: Scenario1 - Open Elements Section and check elements on the page
    Given Open DemoQA site on main page with endpoint " "
    And Main page DemoQA is open
    When I click to card "Elements"
    Then Elements page is open with title "Elements"
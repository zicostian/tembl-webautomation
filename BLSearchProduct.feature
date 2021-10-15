@BL
Feature: Search Product

  @tag1
  Scenario: User should be able to search product on Bukalapak
  Given User Launches the Website
  Then User should be able to check Home page
  When User enter keywords on Search text field "Macbook"
  And Click search icon button
  Then User should be able to see a list of searched products in PLP
  When User click one of the product
  Then User should be navigated to PDP page
  Then Close Website

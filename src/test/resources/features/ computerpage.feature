@regression
Feature: Computer Test of Nopcommerce
  As a user I should verify the computer and desktops functionality

   @sanity
  Scenario: verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on computer tab
    And I should verify the computer text "Computers"


  @sanity @smoke
  Scenario: verify user should navigate to desktops page successfully
    Given I am on homepage
    When I click on computer tab
    And I click on desktops tab
    And I should verify the desktops text "Desktops"


   @smoke
  Scenario Outline: verify that user should build and add your own computer into cart
    Given I am on homepage
    When I click on computer tab
    And I click on desktops tab
    And I click on build your own computer
    And I select processor "<Processor>"
    And I select ram "<Ram>"
    And I select Hdd radio "<HDD>"
    And I select OS radio "<OS>"
    And I select software "<Software>"
    And I click on add to cart button
    Then I should verify the add to cart message"<Message>"


    Examples:
      | Processor                                       | Ram           | HDD               | OS                      | Software                 | Message                                          |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Acrobat Reader [+$10.00] | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00] | The product has been added to your shopping cart |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00] | The product has been added to your shopping cart |
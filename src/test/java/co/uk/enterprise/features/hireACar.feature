Feature: Search cars for hire

  As a customer
  I want to be able to search cars for hire
  So I can get more details about the car

  Background: Given a user is on Enterprise rent-a-car homepage

  Scenario Outline: User can successfully search cars for hire
    When user enters "<Pickup Location>"
    And user selects the required location from the list provided
    And clicks on the continue button
    Then a list of  potential pick up spots in "<Pickup Location>" is displayed
    And user clicks on one of the result links

    Examples:
      |Pickup Location|Pickup Date|Return Date|
      |M400GE|July 28|July 30|
      |Oldham|Sept 5|Sept 7|
      |Manchester Airport|August 8|August 10|

#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Open the url of Adactin for checking the few details
 
  @Positive
Scenario: Validating the all the details for booking a room in adactin url
    Given Open the adactin url 
    When Enter the login userId and password details 
     When Enter the next or submit button
     When Select the Location Hotel RoomType NoOfRooms
    And Enter the NoOf Adults and NoofChilds
    When click the search
     When Enter the FirstName LastName Address CreditCardNumber 
    And Select the CardType ExpiryMonth ExpiryYear
    And Enter the cvv number
    Then click the BookNow
   
  @Negative
Scenario: Validating the all the details for booking a room in adactin url
    Given Open the adactin url 
    When Enter the login userId and password details 
     When Enter the next or submit button
     When Select the Location Hotel RoomType NoOfRooms
    And Enter the NoOf Adults and NoofChilds
    When click the search
     When Enter the FirstName LastName Address CreditCardNumber 
    And Select the CardType ExpiryMonth ExpiryYear
    And Enter the cvv number
    
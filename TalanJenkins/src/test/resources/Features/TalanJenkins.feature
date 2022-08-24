Feature: Connexion on TA


  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    When user is on login page
    And user enter his email<email>
    And user enters his password<password>
    Then user is on dashbord page

    Examples: 
      | email                   | password     |
      | ines.masmoudi@talan.com | DmbDBgDbHT95 |

  

  
 

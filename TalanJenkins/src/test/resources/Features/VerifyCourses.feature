Feature: Checking courses 
 
 Scenario: user is able to check his old sessions courses ressources
    
    Given old session link is displayed
    When user clicks on his old sessions link
    And user clicks on view the course
    And user clicks on a module number
    And user clicks on a course number
    And user clicks on resources
    Then user get lessons title displayed
Feature: update user data

Scenario Outline: user is able to modify his profils data
    Given user is on his dashbord
    When user clicks on his profil
    And user delet his old data
    And user enters his new data <name>  and <familyname> and <birthday> and <phonenumber> and <town>
    And user clicks on submit
    Then user get confirmation of his data modification

    Examples: 
      | name  | familyname | birthday | phonenumber | town |
      | inessss | masssmoudi | 07081991 |    21240226 | Sfax |
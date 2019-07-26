Feature: registration verification for testmeapp

  Scenario Outline: test me registration for multiple users
    Given He opens url of the application
    Then He click on SignUp link
    Given he enters user name "<uname>"
    Then he enters first name "<fname>"
    And he enters last name "<lname>"
    Then He provide password "<Paswrd>"
    Then He confirm password "<cpaswrd>"
    Then he selects gender
    Then he provides email address "<email>"
    And he enters Mobile number "<mno>"
    Then he enters date of birth "<dob>"
    Then He enters address "<add>"
    And he provides the answer "<ans>"
    Then I click on submit to register

    Examples: 
      | uname     | fname    | lname  | Paswrd      | cpaswrd     | email             | mno        | dob        | ans         | add         |
      | srni123l  | srnivas  | godari | password123 | password123 | qwerty@qwerty.com | 5478218754 | 12/12/1985 | tyfugyuruy  | drhaed 545  |
      | sinl11gff | sintheta | jaana  | password124 | password124 | qwerty@qwerty.com | 9856239865 | 12/12/1985 | ytrdguyreuy | ssjsjsjj 54 |

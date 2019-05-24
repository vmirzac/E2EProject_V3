Feature: Login into Application


  Scenario: Victor want to log in to his Wikipedia user account with correct credentials
    Given he navigates to Wikipedia's English Language Main Page
    And he logs into his account with username as "Vmirzac" and password as "Tester555"
    Then he is logged into his account


  Scenario Outline: Victor wants to test the failed login attempts using wrong credentials
    Given he navigates to Wikipedia's English Language Main Page
    When he logs into his account with username as "<username>" and password as "<password>"
    Then  he is not logged in

    Examples:
      | username | password |
      | TestX    | !23      |
      | Tset     | 123      |
      | Tset     | !23      |



#  Scenario: Login to Wikipedia  user account
#    Given  Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    And he clicks the "English" button
#    And he clicks the Login button
#    When he enters username as "Vmirzac" and password as "Tester555"
#    And he clicks the Login button on the loging page
#    Then he is logged into his account
#    And close browsers
#
#  Scenario Outline: Failed login using wrong credentials
#    Given  Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    And he clicks the "English" button
#    And he clicks the Login button
#    When he enters username as "<username>" and password as "<password>"
#    And he clicks the Login button on the loging page
#    Then  he is not logged in
#    And close browsers
#    Examples:
#      | username | password |
#      | TestX    | !23      |
#      | Tset     | 123      |
#      | Tset     | !23      |
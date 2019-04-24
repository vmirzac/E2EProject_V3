Feature: Login into Application


  Scenario: Login to Wikipedia  user account
    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    When he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    Then he is logged into his account
    And close browsers

  Scenario Outline: Failed login using wrong credentials
    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    When he enters username as "<username>" and password as "<password>"
    And he clicks the Login button on the loging page
    Then  he is not logged in
    And close browsers
    Examples:
      | username | password |
      | TestX    | !23      |
      | Tset     | 123      |
      | Tset     | !23      |
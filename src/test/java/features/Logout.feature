Feature: Logout from Application


  Scenario: Log out from Wikipedia  user account
    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "VictorHanescu" and password as "Tester666"
    And he clicks the Login button on the loging page
    And he is logged into his account
    When he clicks the Log out button
    Then he is logged out from the application
    And close browsers

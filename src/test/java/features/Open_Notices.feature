Feature: Open Latest Notices

  Scenario: Victor wants to view the latest notices on his account
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Your notices button
    Then he can see the Notices window displayed
    And close browsers
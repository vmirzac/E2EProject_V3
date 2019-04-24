Feature: Edit account preferences

  Scenario: Victor wants update his user preferences
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Moldova1859" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Preferences button
    And he enters "Victor Mirzac" as signature in the signature box
    And he clicks the Save button
    Then his signature is updated to Victor Mirzac
    And close browsers

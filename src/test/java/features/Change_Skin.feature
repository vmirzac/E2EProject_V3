Feature: Change skin (Appearance)

  Scenario: Victor wants to change the skin appearance
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Moldova1859" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Preferences button
    And he clicks the Appearance button
    And he selects the Cologne Blue skin
    And he clicks the Save button
    Then the Cologne Blue radio button is selected
    And restore all default settings
    And he confirms the intent to restore all default settings
    And close browsers

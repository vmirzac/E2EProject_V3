Feature: restore all default settings

  Scenario: Victor wants to restore all the settings to default
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Preferences button
    When he clicks the Restore all default settings in all sections button
    And he confirms the intent to restore all default settings
    Then he is redirected to the Preferences page
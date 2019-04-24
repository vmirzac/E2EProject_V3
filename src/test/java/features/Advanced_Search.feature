Feature: De-select the Advanced Search feature

  Scenario: Victor wants deactivate his Advances Search feature from his preferences
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Preferences button
    And he clicks on the Search button
    And he selects the Don’t show the Advanced Search interface
    And he clicks the Save button
    Then the --Don’t show the Advanced Search interface-- is selected
    And restore all default settings
    And close browsers

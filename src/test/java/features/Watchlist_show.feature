Feature: Change skin (Appearance)

  Scenario: Victor wants to update the number of days to show in watchlist
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he clicks the Preferences button
    And he clicks the Watchlist button
    And he enters "15" days in the Days to show in watchlist box
    And he clicks the Save button
    Then "15" days are displayed in the Days to show in watchlist box
    And restore all default settings
    And close browsers
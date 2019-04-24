Feature: Add article to watchlist

  Scenario: Victor wants to add an article to his watchlist
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he clicks the Login button
    And he enters username as "Vmirzac" and password as "Tester555"
    And he clicks the Login button on the loging page
    And he searches the keyword "Cucumber" the Search box
    And he clicks the Search Button
    When he adds the page to his watchlist star
    Then the watchlist star is selected


Feature: Navigate to one of Wikipedia's Sister sites

  Scenario: Victor wants to navigate to Wikipedia's sister site - Wikibooks
    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    And he is redirected to "https://en.wikipedia.org/wiki/Main_Page"
    When he clicks the Wikibooks article button
    Then he is redirected to a Wikibooks' Main Page
    And close browsers
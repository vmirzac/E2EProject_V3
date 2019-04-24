Feature: Search Article

  Scenario: Victor wants to search for an article on www.wikipedia.org
    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    When he searches the keyword "Cucumber" the Search box
    Then a single result is shown for "Cucumber"
    And close browsers






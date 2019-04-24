Feature: Change Language from English to Romanian on Wikipedia's English Main Page

  Scenario: Victor wants to change the language of an article from English to Romanian
    Given Victor Initializes the browser with chrome
    And Victor navigates to "https://en.wikipedia.org/wiki/Main_Page" website
    And he searches the keyword "Cucumber" the Search box
    And he clicks the Search Button
    And a single result is shown for "Cucumber"
    When he changes the language from English to Romanian
    Then the article is in Romanian
    And close browsers


Feature: Random article selection

  Scenario: Victor wants to randomly change the article displayed on Wikipedia

    Given he navigates to Wikipedia's English Language Main Page
    When he select the Random article button
    Then he is redirected to a random article


#    Given  Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    And he clicks the "English" button
#    And he is redirected to "https://en.wikipedia.org/wiki/Main_Page"
#    When he clicks the Random article button once
#    Then he is redirected to a random article
#    And close browsers


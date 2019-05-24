Feature: Surf to main page

  Scenario: Victor wants to select the English version of www.wikipedia.org

    Given Victor navigates to "https://www.wikipedia.org" website
    When he navigates to Wikipedia's English Language Main Page
    Then he is redirected to "https://en.wikipedia.org/wiki/Main_Page"



#    Given  Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    When he clicks the "English" button
#    Then he is redirected to "https://en.wikipedia.org/wiki/Main_Page"
#    And close browsers


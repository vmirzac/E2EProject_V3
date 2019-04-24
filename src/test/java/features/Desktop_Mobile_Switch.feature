Feature: Switch from desktop to mobile view

  Scenario: Victor wants to switch between desktop view and mobile view

    Given  Victor Initializes the browser with chrome
    And Victor navigates to "https://www.wikipedia.org" website
    And he clicks the "English" button
    When he clicks the Mobile View button
    Then he is redirected to "https://en.m.wikipedia.org/w/index.php?title=Main_Page&mobileaction=toggle_view_mobile" page
    And close browsers

Feature: Create a sample article

  Scenario: Victor wants to create a sample article
    Given he logs into his account with username as "Cucumber1859" and password as "Tester777"
    And he creates an article with template code "{{subst:Biography}}"
    And he publishes the article
    Then he is redirected to the Sandbox and a sample article is displayed






#  Scenario: Victor wants to create a sample article
#    Given Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    And he clicks the "English" button
#    And he clicks the Login button
#    And he enters username as "Vmirzac" and password as "Tester555"
#    And he clicks the Login button on the loging page
#    And he clicks on the Sandbox button
#    And he clicks the Edit Source button
#    And he pastes the templace code "{{subst:Biography}}"
#    And he publishes the changes
#    Then he is redirected to the Sandbox and a sample article is displayed
#    And close browsers




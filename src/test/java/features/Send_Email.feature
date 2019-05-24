Feature: Feature: Send email

  Scenario: Victor wants to send an email from within the Sandbox
    Given he logs into his account with username as "Vmirzac" and password as "Tester555"
    And he sends an email
    Then the email is sent to the user and Email sent message is displayed





#  Scenario: Victor wants to send an email from within the Sandbox
#    Given Victor Initializes the browser with chrome
#    And Victor navigates to "https://www.wikipedia.org" website
#    And he clicks the "English" button
#    And he clicks the Login button
#    And he enters username as "Vmirzac" and password as "Tester555"
#    And he clicks the Login button on the loging page
#    And he clicks on the Sandbox button
#    When he clicks the Email this user button
#    And he enters the message "Hello" in the message box
#    And he clicks the Send button
#    Then the email is sent to the user and Email sent message is displayed

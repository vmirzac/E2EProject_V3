Feature: Create account without captcha
  Verify that the new user registration is unsuccessful after passing incorrect inputs.

  Scenario: Victor wants to register on wikipedia.org, without providing the captcha code
    Given he navigates to Wikipedia's User Create Account Page
    When enters the following invalid data on the page
      | Fields                 | Values              |
      | Username               | cmirzac             |
      | Password               | Tester123           |
      | Confirm password       | Tester123           |
      | Email address          | someone@someone.com |
      | CAPTCHA security check | NOK                 |

    Then the user registration should be unsuccessful






#  Scenario: Victor wants to register on wikipedia.org, without providing the captcha code
#    Given Victor Initializes the browser with chrome
#    And Victor navigates to "https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Main+Page" website
#    When Victor enters invalid data on the page
#      | Fields                 | Values              |
#      | Username               | cmirzac             |
#      | Password               | Tester123           |
#      | Confirm password       | Tester123           |
#      | Email address          | someone@someone.com |
#      | CAPTCHA security check | NOK                 |
#
#    Then the user registration should be unsuccessful
#    And close browsers



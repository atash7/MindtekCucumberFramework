Feature: Validating a new user and search functionality

  Scenario: Validating new user with valid information
    Given user navigates to "OrangeHRMApp" application
    When user enters username "Admin" and password "admin123" and press ENTER
    And user lands on homepage and clicks PIM button
    And user lands on PIM page and clicks the +add button
    And user lands on create employee page and create a new employee by entering firstName "Jen", middleName "Jennifer" lastName "Lopez" and click Save
    And user lands back on PIM page and clicks Admin page
    And user lands on Admin User Management page and clicks add button
    And user lands on +add user page and clicks userRole "Admin" status "Enabled" employee "Jennifer Lopez" userName "Jen1234!!" confirmPassword "Jen1234!!"
    Then validates new user added
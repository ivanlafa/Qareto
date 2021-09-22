Feature: I as user of the Utest
  i want to created a new register
  to access as user

  Scenario: Succesful user creation
    Given user in the home page
    When user create and account filling all fields
    |   strName              |    |       strLastName           |
    |   strEmail              |    |       strMonth         |
    |   strDay              |    |       strYear         |
    Then user sees its username
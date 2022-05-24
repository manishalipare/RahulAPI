Feature: Login

  
  Scenario: Login with valid scenario
    Given Open home page
    When Login with valid "admin" and "manager"
    Then Home page should be displayed "true"
    
    
 Scenario: Login with invalid credentials
    Given Open home page
    When Login with valid "manisha" and "lipare"
    Then Home page should be displayed "false"
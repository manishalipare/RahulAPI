Feature: Login with valid scenario
 
  Scenario Outline: Title of your scenario outline
    Given Open url
    When Enter <id> and <password>
    Then Home page should be displayed

    Examples: 
     |id |password|
     |admin|manager|
     |trainee|trainee|
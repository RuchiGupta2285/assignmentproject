@Regression
Feature: Find searched item.

  Scenario Outline: To validate first searched item in Google search
    Given I open <browser>
    And I go to <url>
    When I type <searchtext> in searchbar  field
    Then I verify the <searchtext> as first item in the results

    Examples: 
      | browser | url    | searchtext |
      | chrome  | appUrl | apple      |

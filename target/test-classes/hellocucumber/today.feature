Feature: is it Friday today ?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given  today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "nope"

  Scenario: Friday is Friday
    Given  today is Friday
    When I ask whether it's Friday yet
    Then I should be told "TBC"

  Scenario Outline: Today is or not Friday
    Given  today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<custom_answer>"

    Examples:
    | day     |custom_answer |
    | Monday  | nope         |
    | Friday  | TBC          |
    | Any     | nope         |
Feature: Rational Arithmetic Expressions
  This feature provides a range of scenarios corresponding to the
  intended external behaviour of arithmetic expressions on rationals.

  # This is just a comment.
  # You can start with a Background: that will be run before executing each scenario.

  Background:
    Given I initialise a calculator

  # Each scenario can be seen as a test that can be executed with JUnit,
  # provided that each of the steps (Given, When, And and Then) are
  # implemented in a Java mapping file (CalculatorSteps.Java)

  Scenario: Adding two rational numbers
    Given a rational operation '+'
    When I provide a rational number 3÷2
    And I provide a rational number 1÷2
    Then the operation evaluates to 2÷1

  Scenario: Subtracting two rational numbers
    Given a rational operation '-'
    When I provide a rational number 3÷2
    And I provide a rational number 1÷2
    Then the operation evaluates to 1÷1

  Scenario: Multiplying two rational numbers
    Given a rational operation '*'
    When I provide a rational number 3÷2
    And I provide a rational number 1÷2
    Then the operation evaluates to 3÷4

  Scenario: Dividing two rational numbers
    Given a rational operation '/'
    When I provide a rational number 3÷2
    And I provide a rational number 1÷2
    Then the operation evaluates to 3÷1

  Scenario: Dividing an rational by zero
    Given a rational operation '/'
    When I provide a rational number 3÷2
    And I provide a rational number 0÷1
    Then the rational operation evaluates to MyNotANumber

  Scenario: Printing the sum of two rational numbers
    Given the sum of two rational numbers 3÷2 and 1÷2
    Then its INFIX notation of two rational numbers is ( 3÷2 + 1÷2 )
    And its PREFIX notation of two rational numbers is + (3÷2, 1÷2)
    And its POSTFIX notation of two rational numbers is (3÷2, 1÷2) +

  # This is an example of a scenario in which we provide a list of numbers as input.
  # (In fact, this is not entirely true, since what is given as input is a table of
  # strings. In this case, the table is of dimension 1 * 3 (1 line and three columns).
  Scenario: Evaluation arithmetic operations over a list of rational numbers
    Given the following list of rational numbers
      | 3÷2 | 1÷2 | 1÷2 |
    Then the sum is 5÷2
    And the product is 3÷8
    And the difference is 1÷2
    And the quotient is 6÷1

  # A scenario outline (or template) is a scenario that is parameterised
  # with different values. The outline comes with a set of examples.
  # The scenario will be executed with each of the provided inputs.
  Scenario Outline: Adding two rational numbers
    Given a rational operation '+'
    When I provide a rational number <n1>÷<d1>
    And I provide a rational number <n2>÷<d2>
    Then the operation evaluates to <result>

    Examples:
      |n1|d1|n2|d2|result|
      |3 |2 |1 |2 | "2÷1"|


  Scenario Outline: Dividing two rational numbers
    Given a rational operation '/'
    When I provide a rational number <n1>÷<d1>
    And I provide a rational number <n2>÷<d2>
    Then the operation evaluates to <result>

    Examples:
      |n1|d1|n2|d2|result|
      |3 |2 |1 |2 | "3÷1"|


  Scenario Outline: Evaluating arithmetic operations with two rational parameters
    Given a rational operation <op>
    When I provide a rational number <n1>÷<d1>
    And I provide a rational number <n2>÷<d2>
    Then the operation evaluates to <result>

    Examples:
      | op  |n1|d1|n2|d2|result|
      | "+" | 3| 2| 1| 2| "2÷1"|
      | "-" | 3| 2| 1| 2| "1÷1"|
      | "*" | 3| 2| 1| 2| "3÷4"|
      | "/" | 3| 2| 1| 2| "3÷1"|

  Scenario Outline: Evaluating arithmetic operations with one rational and not a number
    Given a rational operation <op>
    When I provide MyNotANumber for an rational operation
    When I provide a rational number <n>÷<d>
    Then the rational operation evaluates to MyNotANumber

    Examples:
        | op  |n |d |
        | "+" |3 |2 |
        | "-" |3 |2 |
        | "*" |3 |2 |
        | "/" |3 |2 |

    Scenario Outline: Evaluating arithmetic operations with one rational and a number
    Given a rational operation <op>
    When I provide a rational number <n>÷<d>
    When I provide an integer 1 for an rational operation
    Then the operation evaluates to <result>

    Examples:
        | op  |n |d | result |
        | "+" |3 |2 | "5÷2" |
        | "-" |3 |2 | "1÷2" |
        | "*" |3 |2 | "3÷2" |
        | "/" |3 |2 | "3÷2" |
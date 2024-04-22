Feature: Rational Arithmetic Expressions Parser
  This feature provides a range of scenarios corresponding to the
  intended behaviour of parser on rationals.

  Scenario Outline: Test the parser with a rational number
    Given a rational number "<rational>"
    Then I should get <numerator> as numerator
    And I should get <denominator> as denominator

    Examples:
    | rational | numerator | denominator |
    | 1÷2      | 1         | 2           |
    | -1÷2     | -1        | 2           |
    | 1÷-2     | 1         | -2          |
    | -1÷-2    | -1        | -2          |
    | 0÷1      | 0         | 1           |

  Scenario Outline: Test the parser with an infix rational expression
    Given an rational expression "<expression>"
    Then I should get <n>÷<d> as result

    Examples:
    | expression | n    | d |
    | 3÷2 + 1÷2  | 2    | 1 |
    | 3÷2 - 1÷2  | 1    | 1 |
    | 3÷2 * 1÷2  | 3    | 4 |
    | 3÷2 / 1÷2  | 3    | 1 |

  Scenario Outline: Test the parser with an prefix rational expression
    Given an rational expression "<expression>"
    Then I should get <n>÷<d> as result

    Examples:
    | expression    | n    | d    |
    | + (3÷2, 1÷2)  | 2    | 1    |
    | - (3÷2, 1÷2)  | 1    | 1    |
    | * (3÷2, 1÷2)  | 3    | 4    |
    | / (3÷2, 1÷2)  | 3    | 1    |

  Scenario Outline: Test the parser with an postfix rational expression
    Given an rational expression "<expression>"
    Then I should get <n>÷<d> as result

    Examples:
    | expression      | n    | d   |
    | (3÷2, 1÷2) +    | 2    | 1   |
    | (3÷2, 1÷2) -    | 1    | 1   |
    | (3÷2, 1÷2) *    | 3    | 4   |
    | (3÷2, 1÷2) /    | 3    | 1   |



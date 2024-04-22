Feature: Parser Test
  This feature provides a range of scenarios that covers all unit tests for the parser module.

  Scenario: Test Number:
    Given I have a number "1"
    Then I should get a number 1

  Scenario Outline: Test expression infix:
    Given I have an expression <expression>
    Then the result is  <result>

    Examples:
      | expression | result |
      | "5 + 3"    | 8      |
      | "(4+5)*2"  | 18     |
      | "10/5"     | 2      |
      | "10-1"     | 9      |

  Scenario Outline: Test expression prefix:
    Given I have an expression <expression>
    Then the result is  <result>

    Examples:
      | expression    | result |
      | "+(5, 3)"     | 8      |
      | "*(+(4,5),2)" | 18     |
      | "(+ 1 2)"     | 3      |
      | "/(10,5)"     | 2      |
      | "-(10,1)"     | 9      |

  Scenario Outline: Test expression postfix:
    Given I have an expression <expression>
    Then the result is  <result>

    Examples:
      | expression     | result |
      | "(5,3)+"       | 8      |
      | "((4,5)+,2)*)" | 18     |
      | "(10,5)/"      | 2      |
      | "(10,1)-"      | 9      |


  Scenario Outline: Test precedence of expression:
    Given I have an expression <expression>
    Then the result is  <result>

    Examples:
      | expression           | result |
      | "4+2*5"              | 14     |
      | "(4+5+6)*(7 + 4/2)*9"| 1215   |

  Scenario Outline: Test basic function:
    Given I have an expression <expression>
    Then the result is  945

    Examples:
      | expression                   |
      | "(4+5+6)*(7+(5/2/7))*9)"     |
      | "*(+(4,5,6),+(7,/(5,2,7)),9)"|
      | "((4,5,6)+,(7,(5,2,7)/)+,9)*"|

  Scenario: Test if a expression is not Space Sensible:
    Given I have an expression "(4+5)*2"
    Then the result is  18
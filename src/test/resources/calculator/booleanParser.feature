Feature: Boolean Parser Test
  This feature provides a range of scenarios that covers all unit tests for the boolean parser module.

  Scenario: Test Bool:
    Given I have a bool "1"
    Then I should get a bool 1

  Scenario Outline: Test expression infix:
    Given I have a boolean expression <expression>
    Then the resulting boolean is actually <result>

    Examples:
      |         expression        | result |
      | "0 AND 0"                 | 0      |
      | "NOT 0 AND 0"             | 1      |
      | "0 IMPL (1 EQ 1) IMPL 0"  | 0      |
      | "1 OR 0"                  | 0      |
      | "0 XOR 1"                 | 0      |
      | "1 EQ 1"                  | 0      |

  Scenario Outline: Test expression prefix:
    Given I have a boolean expression <expression>
    Then the resulting boolean is actually <result>

    Examples:
      |             expression            | result |
      | "AND (0, 0)"                      | 0      |
      | "AND (0 0)"                       | 0      |
      | "AND (NOT 0, 0)"                  | 1      |
      | "IMPL (IMPL (0, EQ (1, 1)), 0)"   | 0      |
      | "OR (1, 0)"                       | 0      |
      | "XOR (0, 1)"                      | 0      |
      | "EQ (1 1)"                        | 0      |

  Scenario Outline: Test expression postfix:
    Given I have a boolean expression <expression>
    Then the resulting boolean is actually <result>

    Examples:
      |             expression            | result |
      | "(0, 0) AND"                      | 0      |
      | "(0 0) AND"                       | 0      |
      | "(0 NOT, 0) AND"                  | 1      |
      | "((0, (1, 1) EQ) IMPL, 0) IMPL"   | 0      |
      | "(1, 0) OR"                       | 0      |
      | "(0, 1) XOR"                      | 0      |
      | "(1 1) EQ"                        | 0      |

  Scenario Outline: Test precedence of expression:
    Given I have a boolean expression <expression>
    Then the resulting boolean is actually <result>

    Examples:
      |          expression         | result |
      | "(0 IMPL 1) AND (1 IMPL 0)" | 1      |
      | "0 IMPL 1 AND 1 IMPL 0"     | 0      |

  Scenario: Test if a expression is not Space Sensible:
    Given I have a boolean expression "0AND1"
    Then the resulting boolean is actually 1

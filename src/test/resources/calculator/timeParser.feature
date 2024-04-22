Feature: TimeParser Test
  This feature provides a range of scenarios that covers all unit tests for the time parser module.

  Scenario: Test Time:
    Given I have a time "10:00:00"
    Then I should get a time 10 : 00 : 00

  Scenario: Test Date and Time:
    Given I have a time "2024:03:15:10:00:00"
    Then I should get a date and time  2024 : 03 : 15 : 10 : 00 : 00

  Scenario: Test Timezone:
    Given I have a time "10:00:00 CET+8"
    Then I should get a time 18 : 00 : 00

  Scenario: Test Time format:
    Given I have a time "10:00:00 PM"
    Then I should get a time 22 : 00 : 00

  Scenario Outline: Test time expression infix:
    Given I have a time expression <expression>
    Then I should get a time <result>

    Examples:
      | expression                     | result        |
      | "10:00:00 + 03:00:00"          | 13 : 00 : 00  |
      | "10:00:00 - 03:00:00"          | 07 : 00 : 00  |
      | "10:00:00 CET+8 - 03:00:00 PM" | 03 : 00 : 00  |

  Scenario Outline: Test date and time expression infix:
    Given I have a time expression <expression>
    Then I should get a date and time  <result>

    Examples:
      | expression                                | result                        |
      | "2024:03:15:10:00:00 + 03:00:00"          | 2024 : 03 : 15 : 13 : 00 : 00 |
      | "2024:03:15:10:00:00 - 03:00:00"          | 2024 : 03 : 15 : 07 : 00 : 00 |
      | "2024:03:15:10:00:00 CET+4 - 13:00:00 AM" | 2024 : 03 : 15 : 13 : 00 : 00 |

  Scenario Outline: Test time expression prefix:
    Given I have a time expression <expression>
    Then I should get a time <result>

    Examples:
      | expression                         | result        |
      | "+ (10:00:00 , 03:00:00)"          | 13 : 00 : 00  |
      | "- (10:00:00 , 03:00:00)"          | 07 : 00 : 00  |
      | "- (10:00:00 CET+8 , 03:00:00 PM)" | 03 : 00 : 00  |

  Scenario Outline: Test date and time expression prefix:
    Given I have a time expression <expression>
    Then I should get a date and time  <result>

    Examples:
      | expression                                    | result                        |
      | "+ (2024:03:15:10:00:00 , 03:00:00)"          | 2024 : 03 : 15 : 13 : 00 : 00 |
      | "- (2024:03:15:10:00:00 , 03:00:00)"          | 2024 : 03 : 15 : 07 : 00 : 00 |
      | "- (2024:03:15:10:00:00 CET+4 , 13:00:00 AM)" | 2024 : 03 : 15 : 13 : 00 : 00 |

  Scenario Outline: Test time expression postfix:
    Given I have a time expression <expression>
    Then I should get a time <result>

    Examples:
      | expression                         | result        |
      | "(10:00:00 , 03:00:00) +"          | 13 : 00 : 00  |
      | "(10:00:00 , 03:00:00) -"          | 07 : 00 : 00  |
      | "(10:00:00 CET+8 , 03:00:00 PM) -" | 03 : 00 : 00  |

  Scenario Outline: Test date and time expression postfix:
    Given I have a time expression <expression>
    Then I should get a date and time  <result>

    Examples:
      | expression                                | result                        |
      | "(2024:03:15:10:00:00 , 03:00:00) +"          | 2024 : 03 : 15 : 13 : 00 : 00 |
      | "(2024:03:15:10:00:00 , 03:00:00) -"          | 2024 : 03 : 15 : 07 : 00 : 00 |
      | "(2024:03:15:10:00:00 CET+4 , 13:00:00 AM) -" | 2024 : 03 : 15 : 13 : 00 : 00 |


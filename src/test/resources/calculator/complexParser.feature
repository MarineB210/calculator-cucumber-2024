Feature: Complex parser test
  this test is a complex parser test

  Scenario Outline: test Complex Number
    Given I have a complex number '<complex>'
    Then the real part should be <real>
    And the imaginary part should be <imaginary>

    Examples:
      | complex | real | imaginary |
      | 3+4i    | 3    | 4         |
      | +(5,6i) | 5    | 6         |
      | (7,8i)+ | 7    | 8         |

  Scenario Outline: test expression infix:
    Given I have a complex number expression '<expression>'
    Then the result should be '<result>'

    Examples:
      | expression     | result |
      | 3+4i+5+6i      | 8 + 10i  |
      | (3+4i)-(5+6i)      | -2 - 2i |
      | (3+4i)*(5+6i)  | -9 + 38i|
      | (10+5i)/(3+4i)  | 2 - i   |

  Scenario Outline: test expression postfix:
    Given I have a complex number expression '<expression>'
    Then the result should be '<result>'

    Examples:
        | expression           | result |
        | ((3 4i)+ (5 6i)+)+   | 8 + 10i  |
        | ((3 4i)+ (5 6i)+)-   | -2 - 2i |
        | ((3 4i)+ (5 6i)+)*  | -9 + 38i|
        | ((10 5i)+ (3 4i)+)/   | 2 - i   |

    Scenario Outline: test expression prefix:
    Given I have a complex number expression '<expression>'
    Then the result should be '<result>'

      Examples:
        | expression          | result |
        | + (+(3 4i) +(5 6i)) | 8 + 10i  |
        | - (+(3 4i) +(5 6i)) | -2 - 2i |
        | * (+(3 4i) +(5 6i)) | -9 + 38i|
        | / (+(10 5i) +(3 4i)) | 2 - i   |
      
    Scenario: test sqrt expression
        Given I have a complex number expression 'sqrt(-1)'
        Then the imaginary part should be 1

    Scenario Outline: test converting a complex number cartesian to complex number polar
        Given I have a complex number '<complex>'
        Then the result should be '<polar>'

      Examples:
        | complex | polar |
        |intoPolar(sqrt(2)+sqrt(2)i) | 2 * cis(45) |
        |intoPolar(sqrt(+(1 1))+sqrt(+(1 1))i)|2 * cis(45)|
        |intoPolar(sqrt((1 1)+)+sqrt((1 1)+)i)|2 * cis(45)|

    Scenario Outline: test converting a complex number polar to complex number exponential
        Given I have a complex number '<polar>'
        Then the result should be '<exponential>'

      Examples:
        | polar | exponential |
        | intoE(2 * cis(40 + 5)))| 2 * e(i*45) |
        | intoE(2 * cis(+(40 5))) | 2 * e(i*45) |
        | intoE(2 * cis((40 5)+)) | 2 * e(i*45) |

    Scenario Outline: test converting a complex number exponential to complex number cartesian
        Given I have a complex number '<exponential>'
        Then the result should be '<cartesian>'

      Examples:
        | exponential | cartesian |
        | intoCartesian(2 * e(i * 45)) | 1 + i |
        | intoCartesian(2 * e(i * +(45 0))) | 1 + i |
        | intoCartesian(2 * e(i * (45 0)+)) | 1 + i |




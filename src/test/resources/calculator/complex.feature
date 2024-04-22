Feature: Complex Numbers Example
  This feature provide a range af scenarios for feature Complex Numbers.


  Background:   Background:
    Given I initialise a calculator for Complex Numbers

  Scenario: Add two complex numbers
    Given A operator '+'
    When I have a complex number 3 + 4i
    And I have a complex number 5 + 6i
    Then I should get this complex number 8 + 10i

  Scenario: Add a complex number and a number
    Given A operator '+'
    When I have a complex number 3 + 4i
    And I have a number 5
    Then I should get this complex number 8 + 4i

  Scenario: Subtract two complex numbers
    Given A operator '-'
    When I have a complex number 5 - 4i
    And I have a complex number 2 + 6i
    Then I should get this complex number 3 - 10i

  Scenario: Subtract a complex number and a number
    Given A operator '-'
    When I have a complex number 5 - 4i
    And I have a number 2
    Then I should get this complex number 3 - 4i

  Scenario: Multiply two complex numbers
    Given A operator '*'
    When I have a complex number 5 + 4i
    And I have a complex number 5 + 1i
    Then I should get this complex number 21 + 25i

  Scenario: Multiply a complex number and a number
    Given A operator '*'
    When I have a complex number 5 + 4i
    And I have a number 5
    Then I should get this complex number 25 + 20i

  Scenario: Divide two complex numbers
    Given A operator '/'
    When I have a complex number 5 + 1i
    And I have a complex number 2 + 1i
    Then I should get this complex number 2 - 0i

  Scenario: Divide a complex number and a number
    Given A operator '/'
    When I have a complex number 5 + 5i
    And I have a number 5
    Then I should get this complex number 1 + 1i

  Scenario: Divide two complex numbers with the second complex number is 0
    Given A operator '/'
    When I have a complex number 5 + 5i
    And I have a complex number 0 + 0i
    Then I should get a MyNotANumber



  Scenario: Modulus of a complex number
    Given A operator '||'
    When I have a complex number 3 + 4i
    Then I should get this number 5

  Scenario: Modulus of a  number
    Given A operator '||'
    When I have a MyNotANumber
    Then I should get a MyNotANumber


  Scenario: Sqrt of a  number
    Given A operator 'sqrt'
    When I have a number 9
    Then I should get this number 3

  Scenario: Sqrt of a complex number
    Given A operator 'sqrt'
    When I have a number -1
    Then I should get this complex number 0 + 1i

  Scenario: Sqrt of a complex number
    Given A operator 'sqrt'
    When I have a complex number 9 + 12i
    Then I should get a MyNotANumber

  Scenario: Converting a complex number to complex number polar form
    Given A operator 'intoPolar'
    When I have a complex number 4 + 3i
    Then I should get this complex number polar form r = 5 and theta = 36

  Scenario: Converting a complex number polar form to complex number exponential form
    Given A operator 'intoExponential'
    When I have a complex number in polar form with r = 5 and theta = 45
    Then I should get this complex number exponential form with r = 5 and theta = 45

  Scenario: Converting a complex number exponential form to complex number form
    Given A operator 'intoPolar'
    When I have a complex number in exponential form with r = 2 and theta = 45
    Then I should get this complex number 1 + 1i




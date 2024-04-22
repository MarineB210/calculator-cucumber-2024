Feature: Conversions Test
  This feature provides a range of scenarios that covers all unit tests for the unit conversions.

  Scenario Outline: Test length conversions:
    Given the number <number> and the type of unit "LENGTH"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit       | toUnit         | integerPart | decimalPart    |
      | 1.5    | "METER"        | "CENTIMETER"   | "150"       | "0"           |
      | 3.0    | "CENTIMETER"   | "MILLIMETER"   | "30"        | "0"           |
      | 2.5    | "MILLIMETER"   | "KILOMETER"    | "0"         | "0000025"      |
      | 0.75   | "KILOMETER"    | "METER"        | "750"       | "0"           |
      | 4.7    | "METER"        | "MILLIMETER"   | "4700"      | "0"           |
      | 5.2    | "MILLIMETER"   | "CENTIMETER"   | "0"         | "52"           |
      | 1.8    | "CENTIMETER"   | "KILOMETER"    | "0"         | "000018"       |
      | 2.6    | "KILOMETER"    | "CENTIMETER"   | "260000"    | "0"           |
      | 1.5    | "METER"        | "INCH"         | "59"        | "05515"   |
      | 3.0    | "INCH"         | "FOOT"         | "0"         | "25"    |
      | 2.5    | "FOOT"         | "YARD"         | "0"         | "8333308"   |
      | 0.75   | "YARD"         | "MILE"         | "0"         | "0004261375"|
      | 4.7    | "MILE"         | "METER"        | "7563"      | "92"   |
      | 1.5    | "NAUTICAL_MILE"| "DECAMETER"    | "277"       | "8"      |
      | 2.5    | "HECTOMETER"   | "DECIMETER"    | "2500"       | "0"            |
      | 5.2    | "DECAMETER"    | "HECTOMETER"   | "0"         | "52"           |
      | 2.6    | "DECIMETER"    | "NAUTICAL_MILE"| "0"         | "0001403888"   |

  Scenario Outline: Test area conversions:
    Given the number <number> and the type of unit "AREA"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit           | toUnit             | integerPart  | decimalPart    |
      | 2.3    | "SQUAREMETER"      | "SQUAREKILOMETER"  | "0"          | "0000023"      |
      | 4.1    | "SQUAREKILOMETER"  | "SQUARECENTIMETER" | "41000000000"| "0"            |
      | 3.7    | "SQUARECENTIMETER" | "SQUAREMILLIMETER" | "370"        | "0"            |
      | 1.2    | "SQUAREMILLIMETER" | "HECTARE"          | "0"          | "0000000001" |
      | 5.6    | "HECTARE"          | "SQUAREFOOT"       | "602778"    | "4"            |
      | 7.8    | "SQUAREFOOT"       | "SQUAREINCH"       | "1123"       | "198840569"   |
      | 6.4    | "SQUAREINCH"       | "ACRE"             | "0"          | "0000010203" |
      | 8.2    | "ACRE"             | "ARE"              | "331"       | "842739"       |
      | 9.1    | "ARE"              | "SQUAREMILE"       | "0"          | "0003513528"    |
      | 7.3    | "SQUAREMILE"       | "SQUAREYARD"       | "22612488"    | "41"            |

  Scenario Outline: Test currency conversions:
    Given the number <number> and the type of unit "CURRENCY"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit | toUnit | integerPart | decimalPart |
      | 2.3    | "USD"    | "EUR"  | "2"         | "17"        |
      | 4.1    | "EUR"    | "GBP"  | "3"         | "485"        |
      | 3.7    | "GBP"    | "JPY"  | "716"       | "36353"         |
      | 1.2    | "JPY"    | "CHF"  | "0"         | "007073"      |
      | 5.6    | "CHF"    | "CAD"  | "8"         | "4866"         |
      | 7.8    | "CAD"    | "AUD"  | "8"         | "8081632653"   |
      | 6.4    | "AUD"    | "CNY"  | "29"        | "686747"         |
      | 8.2    | "CNY"    | "BEF"  | "42"       | "96"         |
      | 7.3    | "BEF"    | "USD"  | "0"         | "19182001"   |

  Scenario Outline: Test energy conversions:
    Given the number <number> and the type of unit "ENERGY"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit           | toUnit             | integerPart  | decimalPart    |
      | 3.5    | "JOULE"            | "KILOJOULE"        | "0"          | "0035"         |
      | 5.2    | "KILOJOULE"        | "CALORIE"          | "1242"       | "8312"            |
      | 4.6    | "CALORIE"          | "KILOCALORIE"      | "0"          | "0046"         |
      | 2.1    | "KILOCALORIE"      | "WATTHOUR"         | "2"          | "440666"          |
      | 6.3    | "WATTHOUR"         | "BRITISHTHERMALUNIT"| "21"         | "4964723628"         |
      | 8.4    | "BRITISHTHERMALUNIT"| "KILOWATTHOUR"     | "0"          | "0024618"         |
      | 7.2    | "KILOWATTHOUR"     | "JOULE"            | "25919979"   | "2640165888"            |

  Scenario Outline: Test mass and weight conversions:
    Given the number <number> and the type of unit "MASS"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit       | toUnit         | integerPart | decimalPart |
      | 3.5    | "GRAM"         | "KILOGRAM"     | "0"         | "0035"      |
      | 5.2    | "KILOGRAM"     | "MILLIGRAM"    | "5200000"   | "0"         |
      | 4.6    | "MILLIGRAM"    | "POUND"        | "0"         | "0000101413" |
      | 2.1    | "POUND"        | "OUNCE"        | "33"        | "6" |
      | 6.3    | "OUNCE"        | "NEWTON"       | "1"         | "7520836877"   |
      | 7.2    | "NEWTON"       | "POUND_FORCE"  | "1"         | "6186248073" |
      | 6.5    | "POUND_FORCE"  | "GRAM"         | "2947"      | "3428185476" |

  Scenario Outline: Test power conversions:
    Given the number <number> and the type of unit "POWER"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit               | toUnit                 | integerPart | decimalPart |
      | 3.5    | "WATT"                 | "KILOWATT"             | "0"         | "0035"      |
      | 5.2    | "KILOWATT"             | "MILLIWATT"            | "5200000"   | "0"         |
      | 4.6    | "MILLIWATT"            | "HORSEPOWER"           | "0"         | "0000061687"|
      | 2.1    | "HORSEPOWER"           | "FOOT_POUND_PER_MINUTE"| "69300"     | "0626388868"|
      | 6.3    | "FOOT_POUND_PER_MINUTE"| "BTU_PER_HOUR"         | "0"         | "4857558713"|
      | 8.4    | "BTU_PER_HOUR"         | "TON_OF_REFRIGERATION" | "0"         | "0007"      |
      | 7.2    | "TON_OF_REFRIGERATION" | "WATT"                 | "25321"     | "3525822504"|

  Scenario Outline: Test pressure conversions:
    Given the number <number> and the type of unit "PRESSURE"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit   | toUnit     | integerPart | decimalPart |
      | 3.5    | "PASCAL"   | "KILOPASCAL"| "0"        | "0035"      |
      | 5.2    | "KILOPASCAL"| "MEGAPASCAL"| "0"       | "0052"      |
      | 4.6    | "MEGAPASCAL"| "BAR"      | "46"        | "0"        |
      | 2.1    | "BAR"      | "MILLIBAR" | "2100"      | "0"         |
      | 6.3    | "MILLIBAR" | "ATMOSPHERE"| "0"        | "0062176"   |
      | 8.4    | "ATMOSPHERE"| "TORR"    | "6384"      | "023831719" |
      | 7.2    | "TORR"     | "PSI"      | "0"         | "14"        |
      | 6.5    | "PSI"      | "PASCAL"   | "44815"     | "8413657111"|

  Scenario Outline: Test speed conversions:
    Given the number <number> and the type of unit "SPEED"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit           | toUnit             | integerPart| decimalPart |
      | 3.5    | "METERS_PER_SECOND"| "KILOMETERS_PER_HOUR"| "12"     | "6"         |
      | 5.2    | "KILOMETERS_PER_HOUR"| "MILES_PER_HOUR" | "3"        | "2311355556"|
      | 4.6    | "MILES_PER_HOUR"   | "FEET_PER_SECOND" | "6"         | "7466557"   |
      | 2.1    | "FEET_PER_SECOND"  | "KNOT"            | "1"         | "2442130674"|
      | 6.3    | "KNOT"             | "METERS_PER_SECOND"| "3"        | "2410075"        |

  Scenario Outline: Test temperature conversions:
    Given the number <number> and the type of unit "TEMPERATURE"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit   | toUnit     | integerPart | decimalPart |
      | 101.7  | "CELSIUS"  | "FAHRENHEIT"| "215"      | "06"        |
      | 299.4  | "FAHRENHEIT"| "KELVIN"  | "421"       | "7055555556"|
      | 398.6  | "KELVIN"   | "CELSIUS"  | "125"       | "45"        |
      | 202.3  | "CELSIUS"  | "KELVIN"   | "475"       | "45"        |
      | 501.2  | "KELVIN"   | "FAHRENHEIT"| "442"      | "49"        |
      | 349.1  | "FAHRENHEIT"| "CELSIUS" | "176"       | "1666666667"|

  Scenario Outline: Test time conversions:
    Given the number <number> and the type of unit "TIME"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit   | toUnit     | integerPart | decimalPart |
      | 3.5    | "SECOND"   | "MINUTE"   | "0"         | "05833345"  |
      | 5.2    | "MINUTE"   | "HOUR"     | "0"         | "0866665627" |
      | 4.6    | "HOUR"     | "DAY"      | "0"         | "1916652867"|
      | 2.1    | "DAY"      | "MILLISECOND"| "181441161"| "22343183" |
      | 6.3    | "MILLISECOND" | "CENTISECOND"| "0"     | "63"       |
      | 8.4    | "CENTISECOND"| "DECISECOND"| "0"       | "84"        |
      | 7.2    | "DECISECOND"| "DECASECOND"| "0"        | "072"        |
      | 6.5    | "DECASECOND"| "HECTOSECOND"| "0"       | "65"        |
      | 9.8    | "HECTOSECOND"| "KILOSECOND"| "0"       | "98"        |
      | 1.2    | "KILOSECOND"| "SECOND"   | "1200"     | "0"         |

  Scenario Outline: Test volume conversions:
    Given the number <number> and the type of unit "VOLUME"
    When I convert it from <fromUnit> to <toUnit>
    Then I should get the correct number <integerPart>.<decimalPart>

    Examples:
      | number | fromUnit   | toUnit     | integerPart | decimalPart |
      | 3.5    | "CUBICMETER" | "LITER"   | "3500"     | "0"         |
      | 5.2    | "LITER"   | "MILLILITER"| "5200"     | "0"         |
      | 4.6    | "MILLILITER" | "GALLON" | "0"        | "0012152"    |
      | 2.1    | "GALLON"  | "CUBICFOOT"| "0"         | "28073"    |
      | 6.3    | "CUBICFOOT" | "CUBICYARD"| "0"       | "233333003"   |
      | 8.4    | "CUBICYARD"| "BARREL"| "40"         | "39482"        |
      | 7.2    | "BARREL"| "CUBICINCH"| "69854"      | "3580807687"  |
      | 6.5    | "CUBICINCH"| "CUBICCENTIMETER"| "106" | "516"         |
      | 9.8    | "CUBICCENTIMETER"| "CENTILITER"| "0" | "98"        |
      | 1.2    | "CENTILITER"| "DECILITER"| "0"       | "12"        |
      | 3.5    | "DECILITER" | "DECALITER"| "0"       | "035"       |
      | 5.2    | "DECALITER" | "HECTOLITER"| "0"      | "52"       |
      | 4.6    | "HECTOLITER" | "KILOLITER"| "0"      | "46"       |
      | 2.1    | "KILOLITER" | "CUBICMETER"| "2"      | "1"         |
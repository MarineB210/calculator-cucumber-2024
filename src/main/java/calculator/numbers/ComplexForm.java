package calculator.numbers;
/**
 * Enumeration of the 3 ways to represent a complex number:
 */
public enum ComplexForm {
    /**
     * Cartesian notation, e.g. "1 + 2i"
     */
    CARTESIAN,

    /**
     * Polar notation, e.g. "3 * cis(45)"
     */
    POLAR,

    /**
     * Exponential notation, e.g. "3 * e^(i*45)"
     */
    EXPONENTIAL
}

package calculator.numbers;

import visitor.Visitor;

public class MyRationalNumber extends MyNumber {

    private final int numerator, denominator;

    /**
     * Constructor method.
     *
     * @param numerator The numerator of the rational number.
     * @param denominator The denominator of the rational number, different from 0.
     */
    public MyRationalNumber(int numerator, int denominator) {
        super(numerator);
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Constructor method.
     *
     * @param numerator The numerator of the rational number.
     */
    public MyRationalNumber(int numerator) {
        this(numerator, 1);
    }

    /**
     * Compute the greatest common divisor (GCD) of two numbers using Euclidean algorithm.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    private int greatestCommonDivisor(int a, int b) {
        int a_abs = Math.abs(a);
        int b_abs = Math.abs(b);
        int rest;
        while (b_abs != 0) {
            rest = a_abs % b_abs;
            a_abs = b_abs;
            b_abs = rest;
        }
        return a_abs;
    }

    /**
     * Method to get the canonical form of the rational number.
     *
     * @return The canonical form of the rational number.
     */
    public MyRationalNumber getCanonicalForm() {
        int gcd = greatestCommonDivisor(numerator, denominator);
        int canonicalNumerator = (denominator < 0 ? -numerator : numerator) / gcd;
        int canonicalDenominator = Math.abs(denominator) / gcd;
        return new MyRationalNumber(canonicalNumerator, canonicalDenominator);
    }

    /**
     * Getter for the numerator
     *
     * @return The numerator of the rational number
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Getter for the denominator
     *
     * @return The denominator of the rational number
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Accept method to implement the visitor design pattern to traverse arithmetic expressions.
     * Each number will pass itself to the visitor object to get processed by the visitor.
     *
     * @param v The visitor object
     */
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    /**
     * Convert a rational number into a String to allow it to be printed.
     *
     * @return The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        if (numerator == 0)
            return "0";
        if (denominator == 1)
            return Integer.toString(numerator);
        return numerator + "÷" + denominator;
    }

    /**
     * Two MyRationalNumber expressions are equal if the numerators and denominators they contain are equal
     *
     * @param o The object to compare to
     * @return  A boolean representing the result of the equality test
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyRationalNumber that = (MyRationalNumber) o;

        return this.numerator * that.denominator == this.denominator * that.numerator;
    }

    /**
     * The method hashCode needs to be overridden it the equals method is overridden;
     * otherwise there may be problems when you use your object in hashed collections
     * such as HashMap, HashSet, LinkedHashSet.
     *
     * @return The result of computing the hash.
     */
    @Override
    public int hashCode() {
        MyRationalNumber canonicalForm = getCanonicalForm();
        int result = 17;
        result = 31 * result + canonicalForm.getNumerator();
        result = 31 * result + canonicalForm.getDenominator();
        return result;
    }
}

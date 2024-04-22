package calculator.numbers;

/**
 * ComplexNumber is a class that extends MyNumber.
 * It represents a complex number in the context of the calculator.
 *
 * @see MyNumber
 *
 */
public class ComplexNumber extends MyNumber{

    private final double imaginary;
    private ComplexForm form = ComplexForm.CARTESIAN;

    /**
     * Constructor for the ComplexNumber class.
     *
     * @param real The real part of the complex number
     * @param imaginary The imaginary part of the complex number
     */
    public ComplexNumber(double real, double imaginary) {
        super(real);
        this.imaginary = imaginary;
    }

    public void setForm(ComplexForm form) {
        this.form = form;
    }

    /**
     * Getter method to obtain the imaginary part of the complex number
     *
     * @return The floating number that represents the imaginary part of the complex number
     */
    @Override
    public double getImaginary() {
        return imaginary;
    }


    /**
     * Method to compare two complex numbers.
     *
     * @param other The object to compare to
     * @return True if the two complex numbers are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (other == null) return false;

        // If the object is compared to itself then return true
        if (other == this) {
            return true;
        }

        // If the object is of another type then return false
        if (!(other instanceof ComplexNumber)) {
            return false;
        }
        return this.getReal() == ((ComplexNumber)other).getReal() && this.imaginary == ((ComplexNumber)other).imaginary;
    }

    /**
     * Method to compute the hash code of a complex number.
     *
     * @return The hash code of the complex number
     */
    @Override
    public int hashCode() {
        return (int) (this.getReal() + this.imaginary);
    }



    /**
     * Methode to convert a complex number to a string.
     *
     * @return The string representation of the complex number
     */
    @Override
    public String toString() {
        return switch (form) {
            case CARTESIAN -> toStringCartesian();
            case POLAR -> toStringPolar();
            case EXPONENTIAL -> toStringExponential();
        };
    }

    /**
     * Method to convert a complex number to a string in Cartesian form.
     *
     * @return The string representation of the complex number in Cartesian form
     */
    public String toStringCartesian() {
        if ((int) this.getImaginary() ==0) {
            return (int) this.getReal() + "";
        }
        if ((int) this.getReal() ==0) {
            if ((int) this.getImaginary() == 1)
                return "i";
            if ((int) this.getImaginary() == -1)
                return "-i";
            else
                return (int) this.getImaginary() + "i";
        }
        else
        if ((int) this.getImaginary() < 0) {
            if ((int) this.getImaginary() == -1)
                return (int) this.getReal() + " - i";
            else
                return (int) this.getReal() + " - " + (int) -this.getImaginary() + "i";
        }
        else
        if ((int) this.getImaginary()==1)
            return (int) this.getReal() + " + i";
        else
            return (int) this.getReal() + " + " + (int) this.getImaginary()+ "i";
    }


    /**
     * Method to convert a complex number to a string in Polar form.
     *
     * @return The string representation of the complex number in Polar form
     */
    private String toStringPolar() {
        int r = (int) Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2));
        int theta = (int) Math.toDegrees(Math.atan2(this.getImaginary(), this.getReal()));
        return r + " * cis(" + theta + ")";
    }

    /**
     * Method to convert a complex number to a string in Exponential form.
     *
     * @return The string representation of the complex number in Exponential form
     */
    private String toStringExponential() {
        int r = (int) Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginary(), 2));
        int theta = (int) Math.toDegrees(Math.atan2(this.getImaginary(), this.getReal()));
        return r + " * e(i*" + theta + ")";
    }
}
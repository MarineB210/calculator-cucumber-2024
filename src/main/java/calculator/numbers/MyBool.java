package calculator.numbers;

public class MyBool extends MyNumber{

    private final int value;


    /**
     * Constructor method
     *
     * @param v The integer value to be contained in the object
     */
    public MyBool(int v) throws InvalidNumberException {
        super(v);
        if(v == 1 || v == 0){
            value = v;
        }
        else{
            throw new InvalidNumberException("Invalid number entered. Number should be either 0 or 1.");
        }
    }

    /**
     * Convert a number into a String to allow it to be printed.
     *
     * @return	The String that is the result of the conversion.
     */
    @Override
    public String toString() {
        return Integer.toString(value);
    }

    /** Two MyBool expressions are equal if the values they contain are equal
     *
     * @param o The object to compare to
     * @return  A boolean representing the result of the equality test
     */
    @Override
    public boolean equals(Object o) {
        // No object should be equal to null (not including this check can result in an exception if a MyNumber is tested against null)
        if (o == null) return false;

        // If the object is compared to itself then return true
        if (o == this) {
            return true;
        }

        // If the object is of another type then return false
        if (!(o instanceof MyBool)) {
            return false;
        }
        return this.value == ((MyBool)o).value;
        // Used == since the contained value is a primitive value
        // If it had been a Java object, .equals() would be needed
    }

    /** The method hashCode needs to be overridden it the equals method is overridden;
     * 	otherwise there may be problems when you use your object in hashed collections
     * 	such as HashMap, HashSet, LinkedHashSet.
     *
     * @return	The result of computing the hash.
     */
    @Override
    public int hashCode() {
        return value;
    }

    public static class InvalidNumberException extends Exception{
        public InvalidNumberException(String errorMessage) {
            super(errorMessage);
        }
    }
}

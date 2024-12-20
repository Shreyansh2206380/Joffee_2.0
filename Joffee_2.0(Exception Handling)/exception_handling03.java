class NegativeDimensionException extends Exception {
    @Override
    public String toString() {
        return "Dimensions can't be negative";
    }
}

public class exception_handling03{
    // Method to calculate area
    static int area(int l, int b) throws NegativeDimensionException {
        if (l < 0 || b < 0) {
            throw new NegativeDimensionException();
        }
        return l * b;
    }

    // Method that throws an exception
    static void meth2() throws NegativeDimensionException {
        System.out.println("Area is " + area(10, -1));
    }

    public static void main(String[] args) {
        try {
            meth2();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

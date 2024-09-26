public class T014JavaExceptions {

    public static void main(String[] args) {
        try {
            int[] numbs = {1,2,3};

            if(numbs[0] == 0) {
                throw new ArithmeticException("The first element can't be zero");
            }

            System.out.println(numbs[10]);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This block of code executes, regardless of what happens in the try catch blocks above");
        }
    }
}

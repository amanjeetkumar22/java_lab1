package test.test1;

class ExceptionDemo {
    public static void main(String[] args) {

        /* -------- ArrayIndexOutOfBoundsException -------- */
        try {
            int arr[] = {10, 20, 30};
            System.out.println("Accessing 5th element: " + arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        /* -------- NullPointerException -------- */
        try {
            String str = null;
            System.out.println("Length of string: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }

        System.out.println("Program executed successfully");
    }
}

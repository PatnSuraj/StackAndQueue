import java.util.Scanner;

// GenericQueueTester class
public class GenericQueueTester {
    // Main method
    public static void main(String[] args) {

        // Two stack objects one holds the String and another holds the Integer
        GenericQueue<String> Str_value = new GenericQueue<String>();
        GenericQueue<Integer> Int_value = new GenericQueue<Integer>();
        Scanner in = new Scanner(System.in);

        // Initializing the String an Integer
        String Input_String_Value = "";
        int Input_Integer_Value = 0;

        /* While loop checks the given String is matching with quit or not. If it is not matching, then it enters into the loop and asks to give input, if the user enters quit,
         * then it breaks the condition and puts all the values in String Queue.
         */
        while (!Input_String_Value.equalsIgnoreCase("quit")) {
            Input_String_Value = in.next();
            if (!Input_String_Value.equals("quit")) { Str_value.enqueue(Input_String_Value); }
        }

        /* While loop checks the given Integer is matching with -1 or not. If it is not matching, then it enters into the loop and asks to give input, if the user enters -1,
         * then it breaks the condition and puts all the values in Integer Queue.
         */
        while (Input_Integer_Value != -1) {
            Input_Integer_Value = in.nextInt();
            if (Input_Integer_Value != -1) { Int_value.enqueue(Input_Integer_Value); }
        }

        // Output
        System.out.println();
        // gets the count of number of String values
        int String_count = Str_value.size();
        System.out.println("String Queue Contents:");
        // For loop checks the size of string data and prints values according to order
        for (int str = 0; str < String_count; str++) {
            System.out.println(Str_value.dequeue());
        }
        System.out.println();

        // gets the count of number of Integer values
        int Integer_count = Int_value.size();
        System.out.println("Integer Queue Contents:");
        // For loop checks the size of Integer data and prints values according to order
        for (int ints = 0; ints < Integer_count; ints++) {
            System.out.println(Int_value.dequeue());
        }
    }
}



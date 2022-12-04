import java.util.Scanner;

// GenericStackTester
public class GenericStackTester {
    // Main method
    public static void main(String[] args) {

        // Two stack objects one holds the String and another holds the Integer
        GenericStack<String> Str_value = new GenericStack<String>();
        GenericStack<Integer> Int_value = new GenericStack<Integer>();
        Scanner in = new Scanner(System.in);

        // Initializing the String an Integer
        String Input_String_Value = "";
        int Input_Integer_Value = 0;

        /* While loop checks the given string is matching with quit or not. If it is not matching, then it enters into the loop and asks to give input, if the user enters quit,
         * then it breaks the condition and puts all the remaining values in the String Stack.
         */
        while (!Input_String_Value.equalsIgnoreCase("quit")) {
            Input_String_Value = in.next();
            if (!Input_String_Value.equalsIgnoreCase("quit")) { Str_value.push(Input_String_Value); }
        }

        /* While loop checks the given Integer is matching with -1 or not. If it is not matching, then it enters into the loop and asks to give input, if the user enters -1,
         * then it breaks the condition and puts all the remaining values in the Integer Stack.
         */
        while(Input_Integer_Value != -1) {
            Input_Integer_Value = in.nextInt();
            if (Input_Integer_Value != -1) { Int_value.push(Input_Integer_Value); }
        }

        // Output
        System.out.println();
        System.out.println("String Stack Contents:");
        // While loop of String checks whether the number of stack data in String_value is empty or not and if it is not empty, prints all those popped values
        while (!Str_value.isEmpty())
            System.out.println(Str_value.pop());
        System.out.println();
        // While loop of Integer checks whether the number of stack data in Int_value is empty or not and if it is not empty, prints all those popped values
        System.out.println("Integer Stack Contents:");
        while (!Int_value.isEmpty())
            System.out.println(Int_value.pop());
    }
}

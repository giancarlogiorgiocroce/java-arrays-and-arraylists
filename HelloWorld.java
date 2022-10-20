import java.util.ArrayList;


class HelloWorld {
    public static void main(String[]args){
        // System.out.println("HelloWorld");

            // For cycles are similar to Javascript and PHP
        // int number = 5;
        // for (int multiplier = 1; multiplier < 11; multiplier++){
        //     System.out.println(number * multiplier);
        // }

            // <Integer> is the aggregated form of the primitive type int; it's used for nested Arrays
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println(numbers.toString());

    }
}
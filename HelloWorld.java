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
        numbers.add(6);

        numbers.forEach(number -> {
            System.out.println(number * 10);
        });

            // Removal by index
        // numbers.remove(2);
            // Removal by value
        // numbers.remove(Integer.valueOf(3));

        // System.out.println(numbers.toString());
        // System.out.println(numbers.get(2));
        System.out.println(numbers.contains(2));

    }
}
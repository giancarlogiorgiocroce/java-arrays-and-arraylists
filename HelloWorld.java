// import java.util.ArrayList;
import java.util.HashMap;

class HelloWorld {
    public static void main(String[]args){
        // System.out.println("HelloWorld");

            // For cycles are similar to Javascript and PHP
        // int number = 5;
        // for (int multiplier = 1; multiplier < 11; multiplier++){
        //     System.out.println(number * multiplier);
        // }

            // <Integer> is the aggregated form of the primitive type int; it's used for nested Arrays
            // Adding in a single Array + ForEach
        // ArrayList<Integer> numbers = new ArrayList<Integer>();
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(4);
        // numbers.add(5);
        // numbers.add(6);
        // numbers.forEach(number -> {
        //     System.out.println(number * 10);
        // });

            // Removal by index
        // numbers.remove(2);
            // Removal by value
        // numbers.remove(Integer.valueOf(3));

        // System.out.println(numbers.toString());
        // System.out.println(numbers.get(2));
        // System.out.println(numbers.contains(2));


            // HashMap is like a nested Array; it is not sorted but random.
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 55);
        examScores.put("Phylosophy", 75);
        examScores.put("Etics", 80);
        examScores.put("Epistemiology", 75);
        examScores.put("English", 70);
        examScores.put("CS", 60);

        examScores.replace("Math", 100);

            // You cheated! Your scores will suffer!
        examScores.forEach((subject, score) -> {
            System.out.println(subject + "-" + (score - 5));
        });
        
            // If i look for a key it gives me the value, not true or false.
        // System.out.println(examScores.get("CS"));
            // If key does not exist, than get 0.
        // System.out.println(examScores.getOrDefault("Religion", 0));
        System.out.println(examScores.toString());
    }
}
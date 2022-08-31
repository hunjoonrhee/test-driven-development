public class FizzBuzz {

    public static String fizzBuzz(int value){
        // TODO - implement

        if(value == 3){
            return "fizz";
        } else if (value == 5) {
            return "buzz";
        } else if (value == 15) {
            return "fizzbuzz";
        }else {
            return String.valueOf(value);
        }
    }
}

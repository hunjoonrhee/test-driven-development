public class FizzBuzz {

    public static String fizzBuzz(int value){
        if(value%3==0 && value%5!=0){
            return "fizz";
        } else if (value%3!=0 && value%5==0) {
            return "buzz";
        } else if (value%3==0 && value%5==0) {
            return "fizzbuzz";
        }else {
            return String.valueOf(value);
        }
    }
}

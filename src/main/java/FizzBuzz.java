public class FizzBuzz {

    public static void main(String[] args) {
        int[] values = new int[20];
        for (int i = 0; i<values.length; i++){
            values[i] = i+1;
            System.out.println(fizzBuzz(values[i]));
        }




    }

    public static String fizzBuzz(int value){
        if(value%3==0 && value%5!=0){
            return "fuzz";
        } else if (value%3!=0 && value%5==0) {
            return "buzz";
        } else if (value%3==0 && value%5==0) {
            return "fizzbuzz";
        }else {
            return String.valueOf(value);
        }
    }
}

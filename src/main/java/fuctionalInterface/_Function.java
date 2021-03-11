package fuctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
//    static int increment(int number){
//        return number+1;
//    }
    //function
    static Function<Integer,Integer>incrementByOneFunction=number->number +1;
    static Function<Integer,Integer>multiplyBy10=number->number *10;
    //Bifunction
    static BiFunction<Integer,Integer,Integer>incrementAndThenMultiplyBifunction=(numberToIncrementBy,numberToMultiplyBy)->(numberToIncrementBy+1)*numberToMultiplyBy;

    public static void main(String[] args) {
//        int increment = increment(0);
//        System.out.println(increment);

        //function
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);
        //function chaining
        Integer incrementThenApply = incrementByOneFunction.andThen(multiplyBy10).apply(1);
        System.out.println(incrementThenApply);
        //Bifunction
        Integer incrementByOneAndMultiply = incrementAndThenMultiplyBifunction.apply(4, 100);
        System.out.println(incrementByOneAndMultiply);
    }
}

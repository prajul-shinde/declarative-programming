package fuctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    //predicate
    static Predicate<String> isPhoneNumberValid= phoneNumber ->
            phoneNumber.startsWith("+91") && phoneNumber.length()==11;
    //chaining predicate
    static Predicate<String>containsNumber= phoneNumber->
            phoneNumber.contains("3");
    //Bipredicate
    static BiPredicate<String,String>isNumberAndNameValid=(phoneNumber,name)->
            phoneNumber.length()==11 && name.startsWith("p");

    public static void main(String[] args) {
        //Predicate
        boolean isPhoneNumberValidOrNot = isPhoneNumberValid.test("+9130103441");
        System.out.println("isPhoneNumberValid "+isPhoneNumberValidOrNot);
        //Predicate Chaining using and
        boolean containsValid = containsNumber.and(isPhoneNumberValid).test("+913010344");
        System.out.println("doesNumberContains3AndIsItValid= "+containsValid);
        //prediacate chaining using or
        boolean containsOrValid = containsNumber.or(isPhoneNumberValid).test("+91301034");
        System.out.println("containsOrValid= "+containsOrValid);
        //BiPredicate
        boolean isNumberAndNameisValid = isNumberAndNameValid.test("+9130103441", "prajul");
        System.out.println("is number and name valid?= "+isNumberAndNameisValid);
    }
}

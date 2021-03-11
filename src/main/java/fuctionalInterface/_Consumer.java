package fuctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    //imperative approach
    static void greetCustomer(Customer customer){
        System.out.println("hello "+customer.customerName +" , thanx for registering your phone number "+ customer.customerPhoneNumber);
    }
    //declarative approach
    static Consumer<Customer>greetCustomerConsumer= customer->
            System.out.println
                    ("hello "+customer.customerName
                            + ", thanx for registering your number "
                            +customer.customerPhoneNumber);
    //BiConsumer
    static BiConsumer<Customer,Boolean>greetCustomerV2= (customer,showPhoneNumber)->
            System.out.println("Hello "+customer.customerName
                    +", thanx for registering "
                    +(showPhoneNumber? customer.customerPhoneNumber:"****")
            );
    public static void main(String[] args) {
    greetCustomer(new Customer("Maria","9999"));
    greetCustomerConsumer.accept(new Customer("John","69"));
    greetCustomerV2.accept(new Customer("Alice","9999"),true);
    }
    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}

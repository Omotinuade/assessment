package regnos.chapter16;

import java.util.Comparator;

public class Customer implements Comparable<Customer>, Comparator<Customer> {
    private String name;
    private int id;
    private int balance;

    public Customer(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int compareTo(Customer customer) {
        if(this.getBalance() > customer.getBalance()) return 1;
        else if (customer.getBalance()> this.getBalance()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", balance=" + balance +
                '}';
    }

    @Override
    public int compare(Customer c1, Customer c2) {
        return 0;
    }
}

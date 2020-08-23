package be.intecbrussel.linkedList;

import java.util.LinkedList;

public class LinkedClass
{
    public static void main(String[] args)
    {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("VW");
        cars.add("Audi");
        System.out.println(cars);
        cars.addFirst("Opel");
        System.out.println(cars);
        cars.addLast("Volvo");
        System.out.println(cars);
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        for (String i: cars)
        {
            System.out.println(i);
        }
    }
}

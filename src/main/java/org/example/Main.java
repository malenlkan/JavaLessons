package org.example;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Mammals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//   public static void main(String[] args) {
//       Cat vasiliy = new Cat("Vasiliy", 9);
//       Dog dog = new Dog();
//
//       lifeOfAnimal(vasiliy);
//       System.out.println();
//       lifeOfAnimal(dog);
//       dog.consume("mice");
//   }
//   private static void lifeOfAnimal(Mammals animal){
//       animal.drinkMilk();
//       animal.eat();
//       animal.sleep();
//       System.out.println(animal.sound());
//   }

    public static void main (String[] args){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(28);
        integerList.add(70);
        integerList.add(1);
        integerList.add(22);
        System.out.println(integerList.size() + " size");

        for (int i = 0; i< integerList.size(); i++) {
            System.out.println(i + " - "+ integerList.get(i));
        }

        for (Integer number : integerList){
            if (number%2>0){
                System.out.println(number % 2 +" нечетное: " +number);
            } else if (number>28){
                System.out.println(number % 2 +" четное большое: " + number);
            } else {
                System.out.println(number % 2 +" четное маленькое: " + number);
            }
        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        for (String text : stringList){
            System.out.print(text + " ");
        }

        System.out.println();

        for (int i=0; i <stringList.size(); i++){
            System.out.print(stringList.get(i) + " ");
        }

        int count=0;
                while (count < stringList.size()) {
                    boolean b = count >= 2;
            if (b) {
            System.out.println(count + " - " + stringList.get(count));
            } else {
                System.out.println("two: " + stringList.get(count));
            }
            count++;
        }

        count=0;
        do {
            System.out.println(count+ " - " +stringList.get(count));
            count++;
        } while (count<stringList.size());


    }


}
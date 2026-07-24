package com.core.scenarios;

public class ObjectCreationCounterTest {


    public static void main(String[] args) {

        ObjectCreationCounter creationCounter = new ObjectCreationCounter();

        System.out.println(creationCounter.getCounter());// Count 1

        creationCounter = new ObjectCreationCounter();

        System.out.println(creationCounter.getCounter());// Count 2

        creationCounter = new ObjectCreationCounter();

        System.out.println(creationCounter.getCounter());// Count 3
    }
}

class ObjectCreationCounter {

        private static Integer counter = 0;

        public ObjectCreationCounter() {
            counter++;
        }

        public Integer getCounter() {
            return counter;
        }
 }

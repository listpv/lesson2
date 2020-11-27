package com.company;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(2000006);
        for (int i = 0; i < 1000000; i++) {
            mal.add(random.nextInt(100));
        }

        mal.capacityAndSize();
        mal.remove(0);
        mal.capacityAndSize();
        mal.remove(0);
        mal.capacityAndSize();
        for (int i = 0; i < 4; i++) {
            mal.add(random.nextInt(100));
            mal.capacityAndSize();
        }


        Long tempTime = System.currentTimeMillis();
//
////        mal.bubbleSort();         //  2347495
////        mal.selectionSort();      //  688559
        mal.insertionSort();      //  230417
//
        System.out.println(System.currentTimeMillis() - tempTime);


//        mal.selectionSort(Comparator.naturalOrder());
//        mal.selectionSort(Comparator.reverseOrder());
//        mal.selectionSort((a,b)->{return a%10 - b %10;});

    }
}

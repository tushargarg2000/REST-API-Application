package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class CollectionsFramework {

    public static void main(String[] args) {

        List<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);
        list.remove(1);
        list.size();
        list.contains(1);
        list.isEmpty();
        list.clear();

        /*

            You have written a very long code with
            the Array List as the implementation

         */














        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.remove(1);

        priorityQueue.size();
        priorityQueue.contains(1);
        priorityQueue.isEmpty();
        priorityQueue.clear();


        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.remove(1);
        set.size();
        set.isEmpty();
        set.clear();



    }

}

package collections;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // 1.
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Potato");
        arrayList.add("Onion");
        arrayList.add("Pumpkin");
        arrayList.add("Corn");

        System.out.println("ArrayList: " + arrayList);

        // 2.
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        linkedList.add("Fox");

        System.out.println("LinkedList: " + linkedList);

        // 3.
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Yellow");

        System.out.println("HashSet: " + hashSet);

        // 4.
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(28);
        priorityQueue.add(14);
        priorityQueue.add(7);
        priorityQueue.add(21);

        System.out.println("PriorityQueue: " + priorityQueue);

        // 5.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);

        System.out.println("HashMap: " + hashMap);



        // LinkedList gen (example found on the web really)
        CustomLinkedList<Integer> intList = new CustomLinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.print("Integer LinkedList: ");
        intList.printList();

        intList.remove(2);
        System.out.print("After removing 2: ");
        intList.printList();

        CustomLinkedList<String> strList = new CustomLinkedList<>();
        strList.add("Hello");
        strList.add("World");
        System.out.print("String LinkedList: ");
        strList.printList();

        strList.remove("Hello");
        System.out.print("After removing 'Hello': ");
        strList.printList();
    }
}

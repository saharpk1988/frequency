package com.example.spk;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //numberOfDeletion("example");
        System.out.println(numberOfDeletion("aaaabbbb"));
    }

    private static int numberOfDeletion(String str){
        int  deletionCount=0;
        if(str.length()<2){
            return deletionCount;
        }

        // Adding each character and its occurrence to a map
        Map<Character,Integer> frequencyCount=new HashMap<>();
        for(char character:str.toLowerCase().toCharArray()){
            int count=frequencyCount.getOrDefault(character,0);
            frequencyCount.put(character,count+1);
        }

        // Adding occurrences of each character to a PriorityQueue in the reverse of the natural ordering means descending
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        for(Map.Entry<Character,Integer> entry: frequencyCount.entrySet()){
            priorityQueue.add(entry.getValue());
        }
        System.out.println(priorityQueue);

        while (!priorityQueue.isEmpty()){
            int count=priorityQueue.poll();
            // After taking the last element from queue, return the deletionCount
            if(priorityQueue.size()==0){
                return deletionCount;
            }
            // Comparing the count which was polled with the element at head and
            // if they are equal, we add one to the deletionCount and delete one occurrence of the character
            if(priorityQueue.peek()>0 && count==priorityQueue.peek()){
                priorityQueue.add(count-1);
                deletionCount++;
            }
        }

        return deletionCount;
    }
}

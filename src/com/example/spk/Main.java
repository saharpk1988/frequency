package com.example.spk;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
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

        return deletionCount;
    }
}

package com.example.spk;

public class EqualSideArrays {

    //EqualSideArray: Find an index N in an integer array where the sum of the integers
    //to the left of N is equal to the sum of the integers to the right of N.
    //Example: {1,2,3,4,3,2,1} --> index 3 is returned as the sum of left side of the index 3 "{1,2,3}"
    //and the sum of right side "{3,2,1}" both equal 6.

    public int findEvenIndex(int[] array){
        int leftSum=0, rightSum=0;
        for(int i=0; i<array.length; i++, leftSum=0, rightSum=0){
            for(int j=0; j<i;j++){
                leftSum +=array[j];
            }
            for(int k=array.length-1; k>i; k--){
                rightSum+=array[k];
            }
            if (leftSum==rightSum) return i;
        }
        return -1;
    }

}

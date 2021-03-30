package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {

    T [] inputArray;

    public ArrayUtility(T [] inputArray) {
        this.inputArray = inputArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[ i ].equals(valueToEvaluate))
                count++;

        }

        for (int i = 0; i < arrayToMerge.length; i++) {


            if (arrayToMerge[ i ].equals(valueToEvaluate)) {
                count++;
            }
        } return count;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
            T mostCommon = null;

            for (int i=0; i < inputArray.length; i++){
                for (int j=0; j< arrayToMerge.length; j++){
                    if(inputArray[i] == arrayToMerge[j]);
                    mostCommon = inputArray[i];
                }
            }

        return mostCommon;
        //return value that is most common
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;

        for(int i=0; i< inputArray.length; i++){
            if (inputArray[i].equals(valueToEvaluate)){
            count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] leftOver;
        Integer count =0;
        Integer remove = getNumberOfOccurrences(valueToRemove);
        Integer newArray = inputArray.length - remove;

        leftOver = Arrays.copyOf(inputArray, newArray);
        for (int i =0; i< inputArray.length; i++){
            if (inputArray[i] != valueToRemove){
                leftOver[count]= inputArray[i];
                count++;
            }

        }
        return leftOver;
    }
}

package com.nt.java;

public class LogicalCodeTest08 {
    public static void main(String[] args) {
    	
        String s = "TA%^N$MO@Y";
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        // loop until two pointers meet
        for (; left < right; ) {
            // if left is not alphabet, move forward
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // if right is not alphabet, move backward
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // if both are alphabets, swap
            else {
                char temp = arr[left];   // third variable
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        String result = new String(arr);
        System.out.println(result);
    }
}

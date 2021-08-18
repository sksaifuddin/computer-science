public class InsertionSort {
    public static void main(String args[]) {
      int[] arr = new int[]{2,7,4,1,5,3}; 
      insertionSort(arr);
    }
    
    public static void insertionSort(int[] arr) {
        // first value will be sorted part so start the iteration from 1
        for(int i=1; i<arr.length; i++) {
            int valueToBeInserted = arr[i];
            // need current value previous value to check the correct position for insertion
            int j = i-1;
            // iterate from backwards till we reach the index 0 to find the correct position
            while(j>=0 && arr[j] > valueToBeInserted) {
                arr[j+1] = arr[j]; // shift the position to right till correct position
                j=j-1;
            }
            arr[j+1] = valueToBeInserted; // inserting at correct positon // right of value smaller than the correct index
        }
        
        // loop for printing the array values
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
} 
class CountSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,4,1,0,1};
        countSort(arr,5);
        
         for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    // k = range of the numbers in input array
    public static void countSort(int[] arr,int k) {
        int output[] = new int[arr.length];
        // STEP 1-START; make count array //
        int count[] = new int[k];
        for(int i=0; i<k; i++) {
            count[i] = 0;
        }
        for(int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        // STEP 1- END - //
        
        // STEP 2 - START - Make accumulative sum for each index of count array // 
        for(int i=1; i<k; i++) {
            count[i] = count[i-1] + count[i];
        }
        // STEP 2- END - //
        
        // STEP 3 -Add all elements in appropriate position of output array;
        // iterate through all the value of input array and check the index of count array;
        // after every iteration decrease the count of indexs in count array
        for(int i=arr.length-1; i>=0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        // STEP 3 - END - //
        
        // transer everything back to arr
        for(int i=0; i<arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
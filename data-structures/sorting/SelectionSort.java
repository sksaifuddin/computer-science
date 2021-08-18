class SelectionSort {
    // driver code
    public static void main(String[] args) {
         int[] arr = new int[]{2,7,4,1,5,3}; 
         sort(arr);
    }
    
    public static void sort(int[] arr) 
        // check all the indexes of the array but last one
        for(int i=0; i< arr.length-1;i++) {
            int min = i;
            // select the min value and swap with the current index
            for(int j=i+1; j< arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min=j;
                }
            }
            // once we find min we swap it with current
            int temp=arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    
        // loop just for print the array content
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class BubbleSort {
    public static void main(String args[]) {
      int[] arr = new int[]{2,7,4,1,5,3}; 
      bubbleSort(arr);
    }
    
    public static void bubbleSort(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // loop for printing the array values
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
} 

// MAX heapify
class Heap {
    
    static void printHeap(int[] arr , int n){
         System.out.println("Array representation of Heap is:");
  
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
            
            System.out.println();
    }
    static void heapify(int[] arr , int n , int i){
        
        int largest = i;
         int left = 2 * i + 1; // compare left and right with largest node
         int right = 2 * i + 2;
         
         if(left < n && arr[left] >  arr[largest]) largest = left;
         if(right < n && arr[right] >  arr[largest]) largest = right;
         
         if(largest != i){
             int temp = arr[i];
             arr[i] = arr[largest];
             arr[largest] = temp;
             
             heapify(arr , n , largest);
         }
    }
    
    static void BuildHeap(int[] arr , int n){
        // find the last non leaf node as child node follows heap chracter
        
        int last = (n / 2) - 1;
        
        for(int i = last; i >= 0; i--){
            heapify(arr , n , i);
        }
    }
	public static void main (String[] args) {
		int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		
		BuildHeap(arr , arr.length);
		
		printHeap(arr , arr.length);
	}
}
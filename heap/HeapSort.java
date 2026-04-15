package heap;


	import java.util.Arrays;

	public class HeapSort {

	    
	    public void sort(int[] arr) {
	        int n = arr.length;

	        // Build a max heap (rearrange array)
	        // Start from the last non-leaf node and heapify downwards
	        for (int i = n / 2 - 1; i >= 0; i--) {
	            heapify(arr, n, i);
	        }

	        // One by one extract an element from the heap
	        for (int i = n - 1; i > 0; i--) {
	            // Move current root (largest element) to the end of the array
	            int temp = arr[0];
	            arr[0] = arr[i];
	            arr[i] = temp;

	            // Call max heapify on the reduced heap
	            heapify(arr, i, 0);
	        }
	    }

	    // /**
	    //  * A utility function to max heapify a subtree rooted with node i.
	    //  * n is the size of the heap.
	    //  * @param arr The array representing the heap.
	    //  * @param n The current size of the heap.
	    //  * @param i The index of the root of the subtree to heapify.
	    //  */
	    void heapify(int[] arr, int n, int i) {
	        int largest = i; // Initialize largest as root
	        int left = 2 * i + 1; // Left child index
	        int right = 2 * i + 2; // Right child index

	        // If left child is larger than root
	        if (left < n && arr[left] > arr[largest]) {
	            largest = left;
	        }

	        // If right child is larger than largest so far
	        if (right < n && arr[right] > arr[largest]) {
	            largest = right;
	        }

	        // If largest is not the root, swap and recursively heapify the affected subtree
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;

	            heapify(arr, n, largest);
	        }
	    }

	    // Driver code to test the implementation
	    public static void main(String[] args) {
	        int[] arr = {12, 11, 13, 5, 6, 7};
	        HeapSort hs = new HeapSort();
	        hs.sort(arr);

	        System.out.println("Sorted array is: " + Arrays.toString(arr));
	    }
	}


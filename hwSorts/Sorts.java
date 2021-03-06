import java.util.Arrays;
import java.util.Random;

public class Sorts{
	 public static void insertionSort(int[] data){
        for (int i = 1; i < data.length; i++){
            if (data[i] < data[i-1]){
                int j = i;
                while (j > 0 && data[i] < data[j-1]){
                    j--;
                }
                int temp = data[i];
                for (int k = i-1; k >= j; k--){
                    data[k+1] = data[k];
                }
                data[j] = temp;
            }
        }
    }

    public static void selectionSort(int[] data){
		for (int swapInd = 0; swapInd < data.length; swapInd++){
	    	int minInd = swapInd;
	    	int min = data[minInd];
	    	for (int i = swapInd; i < data.length; i++){
				if (data[i] < min){
		    		minInd = i;
		    		min = data[minInd];
				}
	    	}
	    	data[minInd] = data[swapInd];
	    	data[swapInd] = min;
		}
    }

    public static void bubbleSort(int[] data){
		for (int upperBound = data.length - 1; upperBound > 0; upperBound--){
		    int swap = 0;
		    for (int i = 0; i < upperBound; i++){
				if (data[i] > data[i+1]){
			    	swap = data[i + 1];
			    	data[i+1] = data[i];
			    	data[i] = swap;
				}
		    }
		}
    }

    public static void main(String[]args){
    	if (args.length == 0){
	    	//SelectionSort Sort tests
	    	System.out.println("Testing Selection Sort");
			int[] test1 = {};
			System.out.println(Arrays.toString(test1));
			selectionSort(test1);
			System.out.println(Arrays.toString(test1));

			int[] test2 = {1};
			System.out.println(Arrays.toString(test2));
			selectionSort(test2);
			System.out.println(Arrays.toString(test2));

			int[] test3 = {1,0};
			System.out.println(Arrays.toString(test3));
			selectionSort(test3);
			System.out.println(Arrays.toString(test3));

			int[] test4 = {0,1,2,3,4,5};
			System.out.println(Arrays.toString(test4));
			selectionSort(test4);
			System.out.println(Arrays.toString(test4));

			int[] test5 = {3,0,4,1,2,5};
			System.out.println(Arrays.toString(test5));
			selectionSort(test5);
			System.out.println(Arrays.toString(test5));

			int[] test6 = {-1,0,-5,6,3,-11,12,2};
			System.out.println(Arrays.toString(test6));
			selectionSort(test6);
			System.out.println(Arrays.toString(test6));

			//InsertionSort Sort tests
			System.out.println("Testing Insertion Sort");
			int[] test1i = {};
			System.out.println(Arrays.toString(test1i));
			insertionSort(test1i);
			System.out.println(Arrays.toString(test1i));

			int[] test2i = {1};
			System.out.println(Arrays.toString(test2i));
			insertionSort(test2i);
			System.out.println(Arrays.toString(test2i));

			int[] test3i = {1,0};
			System.out.println(Arrays.toString(test3i));
			insertionSort(test3i);
			System.out.println(Arrays.toString(test3i));

			int[] test4i = {0,1,2,3,4,5};
			System.out.println(Arrays.toString(test4i));
			insertionSort(test4i);
			System.out.println(Arrays.toString(test4i));

			int[] test5i = {3,0,4,1,2,5};
			System.out.println(Arrays.toString(test5i));
			insertionSort(test5i);
			System.out.println(Arrays.toString(test5i));

			int[] test6i = {-1,0,-5,6,3,-11,12,2};
			System.out.println(Arrays.toString(test6i));
			insertionSort(test6i);
			System.out.println(Arrays.toString(test6i));

			//Bubble Sort Testing
			System.out.println("Testing Bubble Sort");
			int[] test1b = {};
			System.out.println(Arrays.toString(test1b));
			bubbleSort(test1b);
			System.out.println(Arrays.toString(test1b));

			int[] test2b = {1};
			System.out.println(Arrays.toString(test2b));
			bubbleSort(test2b);
			System.out.println(Arrays.toString(test2b));

			int[] test3b = {1,0};
			System.out.println(Arrays.toString(test3b));
			bubbleSort(test3b);
			System.out.println(Arrays.toString(test3b));

			int[] test4b = {0,1,2,3,4,5};
			System.out.println(Arrays.toString(test4b));
			bubbleSort(test4b);
			System.out.println(Arrays.toString(test4b));

			int[] test5b = {3,0,4,1,2,5};
			System.out.println(Arrays.toString(test5b));
			bubbleSort(test5b);
			System.out.println(Arrays.toString(test5b));

			int[] test6b = {-1,0,-5,6,3,-11,12,2};
			System.out.println(Arrays.toString(test6b));
			bubbleSort(test6b);
			System.out.println(Arrays.toString(test6b));
		} else if (args[0].equals("insertion") || args[0].equals("selection") || args[0].equals("bubble")) { //If a known sort algo is specified
			int[] largeTest = new int[100000]; //Create test array
			int[] comparisonArray = new int[largeTest.length]; //Create array for default algo comparison
			Random randGen = new Random(); //Fill with random integers
			for (int i = 0; i < largeTest.length; i++){
				largeTest[i] = randGen.nextInt(100000) - 50000;
			}
			if (args.length == 2 && args[1].equals("verify")){ //If verification option specified, copy main test array into comparison
				System.arraycopy(largeTest, 0, comparisonArray, 0, largeTest.length);
			}
			if (args[0].equals("insertion")) { //Run algo corresponding to option
				insertionSort(largeTest);
			} else if (args[0].equals("selection")) {
				selectionSort(largeTest);
			} else if (args[0].equals("bubble")) {
				bubbleSort(largeTest);
			}
			if (args.length == 2 && args[1].equals("verify")){ //If verification option specified, compare array after default sorting to chosen algo sorting
				Arrays.sort(comparisonArray);
				System.out.println("Sorted correctly: " + Arrays.equals(largeTest, comparisonArray));
			}
		} else if (args[0].equals("default")) { //For testing default algo time
			int[] largeTest = new int[100000];
			Random randGen = new Random();
			for (int i = 0; i < largeTest.length; i++){
				largeTest[i] = randGen.nextInt(100000) - 50000;
			}
			Arrays.sort(largeTest);
		}
	}
}
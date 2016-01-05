import java.util.Arrays;

public class Sorts{
	 public static void insertion(int[] data){
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

    public static void selection(int[] data){
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

    public static void main(String[]args){

    	//Selection Sort tests
		int[] test1 = {};
		System.out.println(Arrays.toString(test1));
		selection(test1);
		System.out.println(Arrays.toString(test1));

		int[] test2 = {1};
		System.out.println(Arrays.toString(test2));
		selection(test2);
		System.out.println(Arrays.toString(test2));

		int[] test3 = {1,0};
		System.out.println(Arrays.toString(test3));
		selection(test3);
		System.out.println(Arrays.toString(test3));

		int[] test4 = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(test4));
		selection(test4);
		System.out.println(Arrays.toString(test4));

		int[] test5 = {3,0,4,1,2,5};
		System.out.println(Arrays.toString(test5));
		selection(test5);
		System.out.println(Arrays.toString(test5));

		int[] test6 = {-1,0,-5,6,3,-11,12,2};
		System.out.println(Arrays.toString(test6));
		selection(test6);
		System.out.println(Arrays.toString(test6));

		//Insertion Sort tests
		int[] test1i = {};
		System.out.println(Arrays.toString(test1i));
		insertion(test1i);
		System.out.println(Arrays.toString(test1i));

		int[] test2i = {1};
		System.out.println(Arrays.toString(test2i));
		insertion(test2i);
		System.out.println(Arrays.toString(test2i));

		int[] test3i = {1,0};
		System.out.println(Arrays.toString(test3i));
		insertion(test3i);
		System.out.println(Arrays.toString(test3i));

		int[] test4i = {0,1,2,3,4,5};
		System.out.println(Arrays.toString(test4i));
		insertion(test4i);
		System.out.println(Arrays.toString(test4i));

		int[] test5i = {3,0,4,1,2,5};
		System.out.println(Arrays.toString(test5i));
		insertion(test5i);
		System.out.println(Arrays.toString(test5i));

		int[] test6i = {-1,0,-5,6,3,-11,12,2};
		System.out.println(Arrays.toString(test6i));
		insertion(test6i);
		System.out.println(Arrays.toString(test6i));
    }
}

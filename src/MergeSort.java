
public class MergeSort {

	public static void main(String[] args) {
		Integer[] arr1 = {1,4};
		Integer[] arr2 = {2,4,6,9};
		Integer[] result = merge(arr1, arr2);
		
		for(int n = 0; n < result.length; n++) {
			System.out.println(result[n]);
		}
	}
	
	protected static Integer[] merge(Integer[] arr1, Integer[] arr2) {
		Integer[] result = new Integer[arr1.length+arr2.length];
		int i = 0;
		int j = 0;
		
		for(int n = 0; n <= result.length; n++) {
			
			if(arr1[i] < arr2[j]){
				result[n] = arr1[i];
				i++;
				if(i >= arr1.length) {
					System.arraycopy(arr2, j, result, n+1, arr2.length-j);
					break;
				}
			} else {
				result[n] = arr2[j];
				j++;
				if(j >= arr2.length) {
					System.arraycopy(arr1, i, result, n+1, arr1.length-i);
					break;
				}
			}
		}
		return result;
	}

}

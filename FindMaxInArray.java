
public class FindMaxInArray {
	
	public static int findMaxInArray(int [] arr, int first, int last){
		if(first == last){ //looking at the same index location
			return arr[first];//return either one... it is the same
		}
		else{
			int mid = (first + last)  / 2;
			return Math.max(findMaxInArray(arr, first, mid), findMaxInArray(arr, mid+1, last));
		}
	}

}

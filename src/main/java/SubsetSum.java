
public class SubsetSum {
	static SubsetSum subsetSum;
	static int arr[]=new int[5];
	int temp;
	public int SubsetSumEvaluate(int arr[],int sum,int i,int size,int trueSum) {
		try {
			if(i==size) {
				return 0;
			}	
			if(arr[i]==trueSum) {
				arr[i]=0;
				return 1+SubsetSumEvaluate(arr, sum, i+1, size, trueSum);
			}
			else if(sum==arr[i]) {
				return 1;
			}
			else if(arr[i]<sum) {
				return SubsetSumEvaluate(arr, sum-arr[i], i+1, size,trueSum)+SubsetSumEvaluate(arr, sum, i+1, size,trueSum);
			}
			else { 
				return SubsetSumEvaluate(arr, sum, i+1, size,trueSum);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			throw new ArrayIndexOutOfBoundsException("index went beyond the array size");
		}catch(NullPointerException e) {
			throw new NullPointerException("Null value");
		}
	}
	public int GetCountSubset(int[] arr, int sum, int i, int size) {
		int count;
		if(i!=0) {
			throw new IllegalArgumentException("initial value must be 0");
		}
		count=SubsetSumEvaluate(arr, sum, i, size,sum);
		if(count==0) {
				return -1;
		}
		return count;
	}
	
}

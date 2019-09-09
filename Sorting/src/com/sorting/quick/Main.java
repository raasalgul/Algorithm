package com.sorting.quick;

public class Main {
public static void main(String args[])
{
	int arr[]= {8,5,2,4,9,1,6};
	quick(arr,0,6);
	for(int res:arr)
	System.out.print(res);
}

private static void quick(int[] arr, int low, int high) {
	if(low>=high)
		return;
	int pivot= merge(arr,low,high);
	quick(arr,low,pivot);
	quick(arr,pivot+1,high);
	
}

private static int merge(int[] arr, int low, int high) {
	int pivot=low;
	int j=high;
	int i=low;
	while(i<j)
	{
		if(arr[i]>arr[pivot] &&pivot>i)
		{
			int temp=arr[i];
			arr[i]=arr[pivot];
			arr[pivot]=temp;
			pivot=i;
			j--;
		}
		else if(arr[j]<arr[pivot] && pivot<j)
		{
			int temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
			pivot=j;
			i++;
		}
		else if(pivot==j)
			i++;
		else if(pivot==i)
			j--;
		
	}
	for(int res:arr)
	System.out.print(res);
	System.out.println();
	return pivot;
}
}

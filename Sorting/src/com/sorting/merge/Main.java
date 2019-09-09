package com.sorting.merge;

public class Main {
	 public static void main(String[] args) {
			int arr[]={1,2,23,3,4,5,6,0,7,8};
			   mergeSort(arr,0,9,9);
			    System.out.println("Result ");
			    for(int res:arr)
			    	System.out.print(res+",");
			  }
	 public static void mergeSort(int arr[],int l,int r,int n)
	 {
		 if(l>=r)
			 return;
		 int mid=(r+l)/2;
		 mergeSort(arr,l,mid,mid-l);
		 mergeSort(arr,mid+1,r,r-mid+1);
		 sort(arr,l,mid,r);
	 }
	 public static void sort(int arr[],int l,int mid,int r)
	 {
		int n1=mid-l+1;
		int n2=r-mid;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			R[i]=arr[mid+i+1];
		int k=l,i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(L[i]>R[j])
			{
				arr[k]=L[i];
				i++;
			}
			else
			{
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k++]=L[i++];
		}
		while(j<n2)
		{
			arr[k++]=R[j++];
		}
	 }
}

package com.sorting.bubble;

//Using Recursion
class Main {
	  public static void main(String[] args) {
	    
	int arr[]={1,2,23,3,4,5,6,0,7,8};
	   bubbleSort(arr,0,9,9);
	    System.out.println("Result ");
	    for(int res:arr)
	    	System.out.print(res+",");
	  }
	  public static void bubbleSort(int arr[],int i,int j,int n)
	  {
		  if(j==0)
			  return;
		  if(i+1>j)
		  {
			  bubbleSort(arr,0,j-1,n);
		  }
		  else
		  {
			  if(arr[i]<arr[i+1])
			  {
				  int temp=arr[i];
				  arr[i]=arr[i+1];
				  arr[i+1]=temp;
			  }
			  bubbleSort(arr,i+1,j,n);
		  }
	  }
	}
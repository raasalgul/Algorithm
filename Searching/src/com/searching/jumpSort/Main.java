package com.searching.jumpSort;

//Using Recursion
class Main {
	  public static void main(String[] args) {
	    
	int arr[]={1,2,3,4,5,6,7,8};
	int m=(int)Math.floor(Math.sqrt(8));
	    int result=jumpSearch(arr,2,0,m,8);
	    System.out.println("Result "+result);
	  }
	  public static int jumpSearch(int arr[],int search,int i,int m,int n)
	  {
	    if(i>=n)
	    {
	    	for(i=i-m;i<n;i++)
	    	{
	    		if(arr[i]==search)
	    			return i;
	    	}
	    }
	    if(arr[i]==search)
	    return i;
	    else if(arr[i]<search)
	    return jumpSearch(arr,search,i+m,m,n);
	    else if(arr[i]>search)
	    {
	    	for(i=i-m;i<i+m&i<n;i++)
	    	{
	    		if(arr[i]==search)
	    			return i;
	    	}
	    }
	    return -1;
	  }
	}
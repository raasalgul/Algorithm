package com.backtracking;

public class SumOfSubset {
	static boolean check=false;
public static void main(String[] args) {
	// 1 3 6 4 5 3
	int inputArray[]= {10, 7, 5, 18, 12, 20, 15};
	int value=35;
	subset(inputArray,value,0,0,inputArray.length-1);
	if(check==false)
		System.out.println("Not a sum of subset......");
}

private static void subset(int[] inputArray, int value, int sum,int start,int end) {
if(sum==value &&check==false)
{
	System.out.println("Subset sum is present....");
	check=true;
	return;
}
	for(int i=start;i<=end;i++)
	{
		sum+=inputArray[i];
		subset(inputArray,value,sum,i+1,end);
		sum-=inputArray[i];
	}
}
}

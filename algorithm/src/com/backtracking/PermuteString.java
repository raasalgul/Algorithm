package com.backtracking;

public class PermuteString {

	public static void main(String[] args) {
	String input="ABC";
	permutation(input,0,input.length()-1);
	}

	private static void permutation(String input, int start, int end) {
		if(start==end)
			System.out.println(input);
	for(int i=start;i<=end;i++)
	{
		input=swap(input,start,i);
		permutation(input,start+1,end);
		swap(input,i,start);
	}
	}

	private static String swap(String input, int start, int i) {
		char inputArray[]=input.toCharArray();
		char temp=inputArray[start];
		inputArray[start]=inputArray[i];
		inputArray[i]=temp;
		return String.valueOf(inputArray);
	}

}

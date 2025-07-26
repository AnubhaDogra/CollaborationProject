package com.anubha.collab.algos;

public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindFactorial ff= new FindFactorial();
		System.out.println(ff.factorialAnkur(4));
		System.out.println(ff.factorialAnubha(6));

	}
	
	int factorialAnkur(int n) {
		if(n>0) {
		return n*factorialAnkur(n-1);
		}return 1;
	}
	int fact =1;
	int factorialAnubha(int n) {
		for(int i=1;i<=n;i++) {
			fact= fact*i;
			
		}
		return fact;
	}
	

}

package com.rs.logical.examples;

public class PrimeNumber {
public static void main(String[] args) {
	int n=11,count=0;
	for(int i=1;i<=n;i++){
		if(n%i==0){
			count++;
		}
	}
	if(count==2){
		System.out.println("prime Number");
	}else{
		System.out.println("Not Prime");
	}
}
}
